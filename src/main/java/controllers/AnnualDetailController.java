package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import run.Main;

public class AnnualDetailController {



    private Main main;


    @FXML
    Label zeroYear;
    @FXML
    Label tenYear;
    @FXML
    Label twentyYear;
    @FXML
    Label thirtyYear;
    @FXML
    Label fortyYear;
    @FXML
    Label fiftyYear;
    @FXML
    Label sixtyYear;
    @FXML
    Label seventyYear;
    @FXML
    Label comfortZone;
    @FXML
    Label zeroYearOne;
    @FXML
    Label zeroYearTwo;
    @FXML
    Label zeroYearThree;
    @FXML
    Label tenYearOne;
    @FXML
    Label tenYearTwo;
    @FXML
    Label twentyYearOne;
    @FXML
    Label twentyYearTwo;
    @FXML
    Label twentyYearThree;
    @FXML
    Label thirtyYearOne;
    @FXML
    Label thirtyYearTwo;
    @FXML
    Label fortyYearOne;
    @FXML
    Label fortyYearTwo;
    @FXML
    Label fiftyYearOne;
    @FXML
    Label fiftyYearTwo;
    @FXML
    Label center;
    @FXML
    Label career;
    @FXML
    Label relations;
    @FXML
    Label sixtyYearOne;
    @FXML
    Label sixtyYearTwo;
    @FXML
    Label seventyYearOne;
    @FXML
    Label seventyYearTwo;

    public void setMain(Main main) {
        this.main = main;
    }

    public void getDataFromMatrix(MatrixController controller){

        zeroYear.setText(controller.zeroYear.getText());
        tenYear.setText(controller.tenYear.getText());
        twentyYear.setText(controller.twentyYear.getText());
        thirtyYear.setText(controller.thirtyYear.getText());
        fortyYear.setText(controller.fortyYear.getText());
        fiftyYear.setText(controller.fiftyYear.getText());
        sixtyYear.setText(controller.sixtyYear.getText());
        seventyYear.setText(controller.seventyYear.getText());
        comfortZone.setText(controller.comfortZone.getText());

        zeroYearOne.setText(controller.zeroYearOne.getText());
        zeroYearTwo.setText(controller.zeroYearTwo.getText());
        zeroYearThree.setText(controller.zeroYearThree.getText());

        tenYearOne.setText(controller.tenYearOne.getText());
        tenYearTwo.setText(controller.tenYearTwo.getText());

        twentyYearOne.setText(controller.twentyYearOne.getText());
        twentyYearTwo.setText(controller.twentyYearTwo.getText());
        twentyYearThree.setText(controller.twentyYearThree.getText());

        thirtyYearOne.setText(controller.thirtyYearOne.getText());
        thirtyYearTwo.setText(controller.thirtyYearTwo.getText());

        fortyYearOne.setText(controller.fortyYearOne.getText());
        fortyYearTwo.setText(controller.fortyYearTwo.getText());

        relations.setText(controller.relations.getText());
        career.setText(controller.career.getText());

        fiftyYearOne.setText(controller.fiftyYearOne.getText());
        fiftyYearTwo.setText(controller.fiftyYearTwo.getText());
        center.setText(controller.center.getText());

        sixtyYearOne.setText(controller.sixtyYearOne.getText());
        sixtyYearTwo.setText(controller.sixtyYearTwo.getText());

        seventyYearOne.setText(controller.seventyYearOne.getText());
        seventyYearTwo.setText(controller.seventyYearTwo.getText());


    }

}
