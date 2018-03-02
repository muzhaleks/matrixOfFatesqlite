package data;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import models.Person;
import run.Main;
import utils.DateUtil;


import java.sql.*;
import java.time.LocalDate;


// work with database, CRUD operations.
public class CustomersDB {

    private static final String INSERT_NEW = "INSERT INTO customers(fName,lName,gender,bDay) VALUES(?,?,?,?)";
    private static final String QUEST = "SELECT * FROM customers";


    private Stage dialogStage;
    private ObservableList<Person> persons = FXCollections.observableArrayList();


    Connection connection = null;
    Statement statement = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    private void getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:matrixcustomerdata.s3db");
    }

    public void createDB() throws ClassNotFoundException, SQLException {
        this.getConnection();
        statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE if NOT EXISTS 'customers'('id' INTEGER PRIMARY KEY NOT NULL,'fName' TEXT,'lNAme' TEXT, 'gender' TEXT,'bDay' TEXT NOT NULL)");
    }

    //write customer data from matrix fields (user input) to database
    public void writeData(String fName, String lName, String gender, LocalDate bDay) throws ClassNotFoundException {
        String date = DateUtil.format(bDay);
        try {
            this.getConnection();
            preparedStatement = connection.prepareStatement(INSERT_NEW);
            // preparedStatement.setInt(1, ++id);
            preparedStatement.setString(1, fName);
            preparedStatement.setString(2, lName);
            preparedStatement.setString(3, gender);
            if (bDay != null) {
                preparedStatement.setString(4, date);
            }
            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            dialogStage = (Stage) alert.getDialogPane().getScene().getWindow();
            dialogStage.getIcons().add(new Image(Main.class.getResourceAsStream("/pics/alert.png")));
            alert.setTitle("Неверный ввод.");
            alert.setHeaderText("Незаполненное поле.");
            alert.setContentText("Выберите дату!");
            alert.showAndWait();
            e.printStackTrace();
        }
    }

    //create customer from database & adding to customers list
    public ObservableList<Person> readData() {
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(QUEST);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String fName = resultSet.getString("fName");
                String lName = resultSet.getString("lName");
                String gender = resultSet.getString("gender");
                String date = resultSet.getString("bDay");
                persons.add(new Person(id, fName, lName, gender, DateUtil.parse(date)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return persons;
    }

    public void deletePerson(TableView cus, TableColumn col) throws ClassNotFoundException, SQLException {
        int selectedRow = cus.getSelectionModel().getSelectedIndex();
        int rowForDel = (int) col.getCellData(selectedRow);
        this.getConnection();
        preparedStatement = connection.prepareStatement("DELETE FROM customers WHERE id=?");
        preparedStatement.setInt(1, rowForDel);
        preparedStatement.executeUpdate();

        cus.getItems().remove(selectedRow);
        cus.refresh();
        //connection.close();

    }

    public void clearDB(TableView cus) throws ClassNotFoundException, SQLException {
        this.getConnection();
        preparedStatement = connection.prepareStatement("DELETE FROM customers");
        preparedStatement.executeUpdate();
        cus.getItems().clear();
        //preparedStatement.close();

    }

    public void changeData(Person person){

        try {
            this.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE customers SET fName=? , lName=?, gender=?, bDay=? WHERE id=?");

            preparedStatement.setString(1,person.getFirstName());
            preparedStatement.setString(2, person.getLastName());
            preparedStatement.setString(3, person.getGender());
            preparedStatement.setString(4, DateUtil.format(person.getBirthDate()));
            preparedStatement.setInt(5, person.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException   | ClassNotFoundException e) {
          e.printStackTrace();
        }
    }

    public void closeConn() throws SQLException {
        connection.close();
    }
}









