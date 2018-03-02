package controllers;

import data.CustomersDB;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import models.Person;
import run.Main;
import utils.DateUtil;

import java.sql.SQLException;


public class PersonEditDialog {

    @FXML
    private TextField fNameField;
    @FXML
    private TextField lNameField;
    @FXML
    private TextField genderField;
    @FXML
    private TextField bDayField;

    private CustomersDB db;
    private Stage dialogStage;
    private Person person;
    private boolean okClicked = false;

    @FXML
    public void initialize(){

    }

    public void setDialogStage(Stage dialogStage){
        this.dialogStage = dialogStage;
    }
    public void setPerson(Person person){
        this.person = person;
        this.fNameField.setText(person.getFirstName());
        this.lNameField.setText(person.getLastName());
        this.genderField.setText(person.getGender());
        this.bDayField.setText(DateUtil.format(person.getBirthDate()));
        bDayField.setPromptText("гггг-мм-дд");

    }
    public boolean isOkClicked(){
        return okClicked;
    }
    @FXML
    private void onHandleOk(){

        if (isInputValid())
        person.setFirstName(fNameField.getText());
        person.setLastName(lNameField.getText());
        person.setGender(genderField.getText());
        person.setBirthDate(DateUtil.parse(bDayField.getText()));

        okClicked = true;
        dialogStage.close();
    }

    private boolean isInputValid() {
        String errMessage = "";
        if (fNameField.getText() == null || fNameField.getText().length() == 0){
            errMessage += "Не введено имя\n";
        }
        if (lNameField.getText() == null || fNameField.getText().length() == 0 ){
            errMessage += "Не введена фамилия\n";
        }
        if (genderField.getText() == null || genderField.getText().length() == 0){
            errMessage += "Не введен пол\n";
        }
        if (bDayField.getText() == null || bDayField.getText().length() == 0){
            errMessage += "Не введена дата рождения\n";
        }
        else {
            if (!DateUtil.validDate(bDayField.getText())){
                errMessage += "Некорректная дата. Используйте формат гггг-мм-дд\n";
            }
        }if (errMessage.length() == 0){
            return true;
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(dialogStage);
            dialogStage = (Stage) alert.getDialogPane().getScene().getWindow();
            dialogStage.getIcons().add(new Image(Main.class.getResourceAsStream("/pics/alert.png")));
            alert.setTitle("Неверно заполненные поля");
            alert.setHeaderText("Пожалуйста, заполните поля корректно");
            alert.setContentText(errMessage);
            alert.showAndWait();

            return false;
        }
    }

    @FXML
    private void onHandleCancel(){
        dialogStage.close();
    }

}
