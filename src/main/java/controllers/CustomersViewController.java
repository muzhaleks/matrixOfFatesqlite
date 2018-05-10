package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import data.CustomersDB;
import models.Person;
import run.Main;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;


public class CustomersViewController {

    @FXML
    private TableView<Person> customers;
    @FXML
    private TableColumn<Person, Integer> id;
    @FXML
    private TableColumn<Person, String> fName;
    @FXML
    private TableColumn<Person, String> lName;
    @FXML
    private TableColumn<Person, String> gender;
    @FXML
    private TableColumn<Person, LocalDate> bDay;
    @FXML
    private TextField searchField;

    private Stage dialogStage;
    private CustomersDB db = new CustomersDB();
    private ObservableList<Person> personList;
    private ObservableList<Person> filteredList = FXCollections.observableArrayList();
    private Main main;


    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void setMain(Main main) {
        this.main = main;

    }

    public CustomersViewController() throws ClassNotFoundException, SQLException {
        this.db.createDB();
        personList = db.readData();
        filteredList.addAll(personList);
        personList.addListener((ListChangeListener<Person>) c -> updateFilteredData());
    }

    //get customers list from database to table,create filter for search
    @FXML
    public void initialize() {

        id.setVisible(false);
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        fName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        bDay.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        customers.setItems(filteredList);


        searchField.textProperty().addListener((observable, oldValue, newValue) -> updateFilteredData());

    }

    private void updateFilteredData() {
        filteredList.clear();
        for (Person p : personList
                ) {
            if (matchesFilter(p)) {
                filteredList.add(p);
            }
        }
        reapplyTableSortOrder();
    }

    private boolean matchesFilter(Person person) {
        String filterString = searchField.getText();

        if (filterString == null || filterString.isEmpty()) {
            return true;
        }
        String lowerCaseFilterString = filterString.toLowerCase();

        return person.getLastName().toLowerCase().contains(lowerCaseFilterString) ||
                person.getBirthDate().toString().contains(lowerCaseFilterString);
    }

    private void reapplyTableSortOrder() {
        ArrayList<TableColumn<Person, ?>> sortOrder = new ArrayList<>(customers.getSortOrder());
        customers.getSortOrder().clear();
        customers.getSortOrder().addAll(sortOrder);

    }

    //delete from table & from DB;
    @FXML
    private void handleDelete() throws ClassNotFoundException, SQLException {
        db.deletePerson(customers, id);
    }

    @FXML
    private void clearData() throws ClassNotFoundException, SQLException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        dialogStage = (Stage) alert.getDialogPane().getScene().getWindow();
        dialogStage.getIcons().add(new Image(Main.class.getResourceAsStream("/pics/alert.png")));
        alert.setTitle("Подтвердите удаление!");
        alert.setHeaderText("Удалить все данные?");
        ButtonType ok = new ButtonType("Ok", ButtonBar.ButtonData.OK_DONE);
        ButtonType cancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(ok, cancel);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ok) {
            db.clearDB(customers);
        } else {
            alert.close();
        }
    }

    @FXML
    public void onHandleEdit() {
        Person selectedPerson = customers.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
          boolean okClicked = main.showPersonEditDialog(selectedPerson);
            if (okClicked) {
                customers.refresh();
                Person newPerson = customers.getSelectionModel().getSelectedItem();
                db.changeData(newPerson);
            }

        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            dialogStage = (Stage) alert.getDialogPane().getScene().getWindow();
            dialogStage.getIcons().add(new Image(Main.class.getResourceAsStream("/pics/alert.png")));
            alert.setTitle("Ничего не выбрано!");
            alert.setHeaderText("Не выбрано ни одной записи!");
            alert.setContentText("Пожалуйста, выберите редактируемую запись в таблице.");

            alert.showAndWait();
        }
    }


    @FXML
    public void getPersonDataFromTable() {
        Person tmpPerson = customers.getSelectionModel().getSelectedItem();
        customers.setOnMouseClicked((event) -> {
            if (event.getClickCount() == 2 && tmpPerson != null) {
                try {
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(Main.class.getResource("/view/mainMatrixView.fxml"));
                    Parent root = loader.load();

                    main.getPrimaryStage().setScene(new Scene(root));
                    MatrixController controller = loader.getController();
                    dialogStage.close();
                    controller.firstNameField.setText(tmpPerson.getFirstName());
                    controller.lastNameField.setText(tmpPerson.getLastName());
                    controller.genderChoice.setValue(tmpPerson.getGender());
                    controller.datePicker.setValue(tmpPerson.getBirthDate());

                    controller.setMain(main);
                    controller.onHandleCount();

                }catch (Exception e){
                    e.printStackTrace();
                }
            }

        });

    }
}
