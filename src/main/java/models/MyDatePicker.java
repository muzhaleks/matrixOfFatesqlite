package models;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MyDatePicker extends Application{


    private int day;
    private int month;
    private int year;

    public MyDatePicker(){

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        DatePicker datePicker = new DatePicker();
        datePicker.setOnAction(event -> {
            day = datePicker.getValue().getDayOfMonth();
            month = datePicker.getValue().getMonth().getValue();
            year = datePicker.getValue().getYear();
        });

        StackPane pane = new StackPane();
        pane.getChildren().add(datePicker);
        primaryStage.setScene(new Scene(pane, 250, 250));
        primaryStage.show();

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
