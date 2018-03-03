package controllers;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import data.CustomersDB;
import models.MatrixData;
import models.Person;
import run.Main;
import utils.MatrixCount;


public class MatrixController {


    @FXML
    DatePicker datePicker;
    @FXML
    TextField firstNameField;
    @FXML
    TextField lastNameField;
    @FXML
    TextField gender;

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
    @FXML
    Label male;
    @FXML
    Label female;
    @FXML
    Label maleFemaleSum;
    @FXML
    Label earth;
    @FXML
    Label sky;
    @FXML
    Label earthSkySum;
    @FXML
    Label afterSix;
    @FXML
    Label planet;
    @FXML
    Label ph1;
    @FXML
    Label en1;
    @FXML
    Label emo1;
    @FXML
    Label ph2;
    @FXML
    Label en2;
    @FXML
    Label emo2;
    @FXML
    Label ph3;
    @FXML
    Label en3;
    @FXML
    Label emo3;
    @FXML
    Label ph4;
    @FXML
    Label en4;
    @FXML
    Label emo4;
    @FXML
    Label ph5;
    @FXML
    Label en5;
    @FXML
    Label emo5;
    @FXML
    Label ph6;
    @FXML
    Label en6;
    @FXML
    Label emo6;
    @FXML
    Label ph7;
    @FXML
    Label en7;
    @FXML
    Label emo7;

    @FXML
    Label phSum;
    @FXML
    Label enSum;
    @FXML
    Label emoSum;
    @FXML
    Label phSumConv;
    @FXML
    Label enSumConv;
    @FXML
    Label emoSumConv;

    private Main main;
    private MatrixCount count = new MatrixCount();

    public void setMain(Main main) {
        this.main = main;

    }

    @FXML
    public void onHandleCount() {

        try {
            if (datePicker != null) {
                Person person = new Person(datePicker.getValue().getDayOfMonth(),
                        datePicker.getValue().getMonth().getValue(), datePicker.getValue().getYear(),
                        firstNameField.getText(), lastNameField.getText(), gender.getText());

                MatrixData matrixData = new MatrixData(person);
                System.out.println(person);
                System.out.println(matrixData);

                zeroYear.setText(Integer.toString(matrixData.getZeroYear()));
                tenYear.setText(Integer.toString(matrixData.getTenYear()));
                twentyYear.setText(Integer.toString(matrixData.getTwentyYear()));
                thirtyYear.setText(Integer.toString(matrixData.getThirtyYear()));
                fortyYear.setText(Integer.toString(matrixData.getFortyYear()));
                fiftyYear.setText(Integer.toString(matrixData.getFiftyYear()));
                sixtyYear.setText(Integer.toString(matrixData.getSixtyYear()));
                seventyYear.setText(Integer.toString(matrixData.getSeventyYear()));
                comfortZone.setText(Integer.toString(matrixData.getComfort()));

                zeroYearOne.setText(Integer.toString(matrixData.getZeroYearOne()));
                zeroYearTwo.setText(Integer.toString(matrixData.getZeroYearTwo()));
                zeroYearThree.setText(Integer.toString(matrixData.getZeroYearThree()));

                tenYearOne.setText(Integer.toString(matrixData.getTenYearOne()));
                tenYearTwo.setText(Integer.toString(matrixData.getTenYearTwo()));

                twentyYearOne.setText(Integer.toString(matrixData.getTwentyYearOne()));
                twentyYearTwo.setText(Integer.toString(matrixData.getTwentyYearTwo()));
                twentyYearThree.setText(Integer.toString(matrixData.getTwentyYearThree()));

                thirtyYearOne.setText(Integer.toString(matrixData.getThirtyYearOne()));
                thirtyYearTwo.setText(Integer.toString(matrixData.getThirtyYearTwo()));

                fortyYearOne.setText(Integer.toString(matrixData.getFortyYearOne()));
                fortyYearTwo.setText(Integer.toString(matrixData.getFortyYearTwo()));

                relations.setText(Integer.toString(matrixData.getRelations()));
                career.setText(Integer.toString(matrixData.getCareer()));

                fiftyYearOne.setText(Integer.toString(matrixData.getFiftyYearOne()));
                fiftyYearTwo.setText(Integer.toString(matrixData.getFiftyYearTwo()));
                center.setText(Integer.toString(matrixData.getCenter()));

                sixtyYearOne.setText(Integer.toString(matrixData.getSixtyYearOne()));
                sixtyYearTwo.setText(Integer.toString(matrixData.getSixtyYearTwo()));

                seventyYearOne.setText(Integer.toString(matrixData.getSeventyYearOne()));
                seventyYearTwo.setText(Integer.toString(matrixData.getSeventyYearTwo()));

                male.setText(Integer.toString(matrixData.getMale()));
                female.setText(Integer.toString(matrixData.getFemale()));
                maleFemaleSum.setText(Integer.toString(matrixData.getMaleFemaleSum()));

                earth.setText(Integer.toString(matrixData.getEarth()));
                sky.setText(Integer.toString(matrixData.getSky()));
                earthSkySum.setText(Integer.toString(matrixData.getEarthSkySum()));

                afterSix.setText(Integer.toString(matrixData.getSpirit()));
                planet.setText(Integer.toString(matrixData.getPlanet()));


                ph1.setText(Integer.toString(matrixData.getFortyYear()));
                en1.setText(Integer.toString(matrixData.getSixtyYear()));
                emo1.setText(Integer.toString(count.counter((matrixData.getFortyYear() + matrixData.getSixtyYear()))));

                ph2.setText(Integer.toString(matrixData.getFortyYearTwo()));
                en2.setText(Integer.toString(matrixData.getSixtyYearTwo()));
                emo2.setText(Integer.toString(count.counter(matrixData.getFortyYearTwo() + matrixData.getSixtyYearTwo())));

                ph3.setText(Integer.toString(matrixData.getComfort()));
                en3.setText(Integer.toString(matrixData.getComfort()));
                emo3.setText(Integer.toString(count.counter(matrixData.getComfort() + matrixData.getComfort())));

                ph4.setText(Integer.toString(matrixData.getZeroYearThree()));
                en4.setText(Integer.toString(matrixData.getTwentyYearThree()));
                emo4.setText(Integer.toString(count.counter(matrixData.getZeroYearThree() + matrixData.getTwentyYearThree())));

                ph5.setText(Integer.toString(matrixData.getZeroYearTwo()));
                en5.setText(Integer.toString(matrixData.getTwentyYearTwo()));
                emo5.setText(Integer.toString(count.counter(matrixData.getZeroYearTwo() + matrixData.getTwentyYearTwo())));

                ph6.setText(Integer.toString(matrixData.getZeroYearOne()));
                en6.setText(Integer.toString(matrixData.getTwentyYearOne()));
                emo6.setText(Integer.toString(count.counter(matrixData.getZeroYearOne() + matrixData.getTwentyYearOne())));

                ph7.setText(Integer.toString(matrixData.getZeroYear()));
                en7.setText(Integer.toString(matrixData.getTwentyYear()));
                emo7.setText(Integer.toString(count.counter(matrixData.getZeroYear() + matrixData.getTwentyYear())));

                phSum.setText(Integer.toString(matrixData.getFortyYear() +
                        matrixData.getFortyYearTwo() + matrixData.getComfort() +
                        matrixData.getZeroYearThree() + matrixData.getZeroYearTwo() +
                        matrixData.getZeroYearOne() + matrixData.getZeroYear()));
                enSum.setText(Integer.toString(matrixData.getSixtyYear() +
                        matrixData.getSixtyYearTwo() + matrixData.getComfort() +
                        matrixData.getTwentyYearThree() + matrixData.getTwentyYearTwo() + matrixData.getTwentyYearOne()
                        + matrixData.getTwentyYear()));
                int emoSumDigit = Integer.parseInt(emo1.getText()) + Integer.parseInt(emo2.getText()) +
                        Integer.parseInt(emo3.getText())
                        + Integer.parseInt(emo4.getText()) + Integer.parseInt(emo5.getText()) + Integer.parseInt(emo6.getText())
                        + Integer.parseInt(emo7.getText());
                emoSum.setText(Integer.toString(emoSumDigit));

                phSumConv.setText(Integer.toString(count.counter(Integer.parseInt(phSum.getText()))));
                enSumConv.setText(Integer.toString(count.counter(Integer.parseInt(enSum.getText()))));
                emoSumConv.setText(Integer.toString(count.counter(emoSumDigit)));
            }

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            Stage dialogStage = (Stage) alert.getDialogPane().getScene().getWindow();
            dialogStage.getIcons().add(new Image(Main.class.getResourceAsStream("/pics/alert.png")));
            alert.setTitle("Неверный ввод.");
            alert.setHeaderText("Незаполненное поле.");
            alert.setContentText("Выберите дату!");
            alert.showAndWait();
        }
    }
    //saving customer to database

    @FXML
    public void onHandleSave() throws ClassNotFoundException {

        CustomersDB customersDB = new CustomersDB();
        customersDB.writeData(firstNameField.getText(), lastNameField.getText(),
                gender.getText(), datePicker.getValue());
        datePicker.getEditor().clear();
        datePicker.setValue(null);
        firstNameField.clear();
        lastNameField.clear();
        gender.clear();

    }

    //clear matrix fields
    @FXML
    public void clearMatrix() {
        zeroYear.setText("");
        tenYear.setText("");
        twentyYear.setText("");
        thirtyYear.setText("");
        fortyYear.setText("");
        fiftyYear.setText("");
        sixtyYear.setText("");
        seventyYear.setText("");
        comfortZone.setText("");
        zeroYearOne.setText("");
        zeroYearTwo.setText("");
        zeroYearThree.setText("");
        tenYearOne.setText("");
        tenYearTwo.setText("");
        twentyYearOne.setText("");
        twentyYearTwo.setText("");
        twentyYearThree.setText("");
        thirtyYearOne.setText("");
        thirtyYearTwo.setText("");
        fortyYearOne.setText("");
        fortyYearTwo.setText("");
        fiftyYearOne.setText("");
        fiftyYearTwo.setText("");
        center.setText("");
        career.setText("");
        relations.setText("");
        sixtyYearOne.setText("");
        sixtyYearTwo.setText("");
        seventyYearOne.setText("");
        seventyYearTwo.setText("");
        male.setText("");
        female.setText("");
        maleFemaleSum.setText("");
        earth.setText("");
        sky.setText("");
        earthSkySum.setText("");
        afterSix.setText("");
        planet.setText("");

        ph1.setText("");
        en1.setText("");
        emo1.setText("");
        ph2.setText("");
        en2.setText("");
        emo2.setText("");
        ph3.setText("");
        en3.setText("");
        emo3.setText("");
        ph4.setText("");
        en4.setText("");
        emo4.setText("");
        ph5.setText("");
        en5.setText("");
        emo5.setText("");
        ph6.setText("");
        en6.setText("");
        emo6.setText("");
        ph7.setText("");
        en7.setText("");
        emo7.setText("");
        phSum.setText("");
        enSum.setText("");
        emoSum.setText("");
        phSumConv.setText("");
        enSumConv.setText("");
        emoSumConv.setText("");


        firstNameField.clear();
        lastNameField.clear();
        gender.clear();
        datePicker.getEditor().clear();
        datePicker.setValue(null);
    }

    //showing table with customers info
    @FXML
    public void showDB() {
        main.showDataBase();
    }


}
