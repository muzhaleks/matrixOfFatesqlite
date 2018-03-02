package run;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import controllers.CustomersViewController;
import controllers.MatrixController;
import controllers.PersonEditDialog;
import models.Person;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;



public class Main extends Application {

    private Stage primaryStage;
    private ScrollPane root;
    private ObservableList<Person> personData = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Матрица Судьбы");
        this.primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("/pics/logo.jpg")));
        initRoot();

    }

    public void initRoot() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/matrixForOnePerson.fxml"));

            root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);

            MatrixController controller = loader.getController();
            controller.setMain(this);

            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showDataBase() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/customersView.fxml"));
            Pane pane = loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("Заказчики");
            dialogStage.getIcons().add(new Image(Main.class.getResourceAsStream("/pics/customer.png")));
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);

            Scene scene = new Scene(pane);
            dialogStage.setScene(scene);

            CustomersViewController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setMain(this);

            dialogStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean showPersonEditDialog(Person person) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/view/personEditView.fxml"));
            AnchorPane page = loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("Редактировать запись :");
            dialogStage.getIcons().add(new Image(Main.class.getResourceAsStream("/pics/customer.png")));
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            PersonEditDialog controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setPerson(person);
            dialogStage.showAndWait();

            return controller.isOkClicked();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public ObservableList<Person> getPersonData() {
        return personData;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
