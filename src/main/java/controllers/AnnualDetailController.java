package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import run.Main;
import utils.MatrixCount;

public class AnnualDetailController {


    private Main main;
    private MatrixCount count = new MatrixCount();


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
    Label a1;
    @FXML
    Label a2;
    @FXML
    Label a3;
    @FXML
    Label a4;
    @FXML
    Label a5;
    @FXML
    Label a6;
    @FXML
    Label a7;
    @FXML
    Label b1;
    @FXML
    Label b2;
    @FXML
    Label b3;
    @FXML
    Label b4;
    @FXML
    Label b5;
    @FXML
    Label b6;
    @FXML
    Label b7;
    @FXML
    Label c1;
    @FXML
    Label c2;
    @FXML
    Label c3;
    @FXML
    Label c4;
    @FXML
    Label c5;
    @FXML
    Label c6;
    @FXML
    Label c7;
    @FXML
    Label d1;
    @FXML
    Label d2;
    @FXML
    Label d3;
    @FXML
    Label d4;
    @FXML
    Label d5;
    @FXML
    Label d6;
    @FXML
    Label d7;
    @FXML
    Label e1;
    @FXML
    Label e2;
    @FXML
    Label e3;
    @FXML
    Label e4;
    @FXML
    Label e5;
    @FXML
    Label e6;
    @FXML
    Label e7;
    @FXML
    Label g1;
    @FXML
    Label g2;
    @FXML
    Label g3;
    @FXML
    Label g4;
    @FXML
    Label g5;
    @FXML
    Label g6;
    @FXML
    Label g7;
    @FXML
    Label h1;
    @FXML
    Label h2;
    @FXML
    Label h3;
    @FXML
    Label h4;
    @FXML
    Label h5;
    @FXML
    Label h6;
    @FXML
    Label h7;
    @FXML
    Label j1;
    @FXML
    Label j2;
    @FXML
    Label j3;
    @FXML
    Label j4;
    @FXML
    Label j5;
    @FXML
    Label j6;
    @FXML
    Label j7;

    public void setMain(Main main) {
        this.main = main;
    }

    public void getDataFromMatrix(MatrixController controller) {

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

        countAnnualDetail();
    }

    private void countAnnualDetail(){
        int aBlockSum;
        aBlockSum = count.counter(Integer.parseInt(tenYear.getText()) + Integer.parseInt(twentyYear.getText()));
        a4.setText(Integer.toString(aBlockSum));
        aBlockSum = count.counter( Integer.parseInt(a4.getText()) + Integer.parseInt(tenYear.getText()));
        a2.setText(Integer.toString(aBlockSum));
        aBlockSum = count.counter(Integer.parseInt(tenYear.getText()) + Integer.parseInt(a2.getText()));
        a1.setText(Integer.toString(aBlockSum));
        aBlockSum = count.counter(Integer.parseInt(a4.getText()) + Integer.parseInt(a2.getText()));
        a3.setText(Integer.toString(aBlockSum));
        aBlockSum = count.counter(Integer.parseInt(a4.getText()) + Integer.parseInt(twentyYear.getText()));
        a6.setText(Integer.toString(aBlockSum));
        aBlockSum = count.counter(Integer.parseInt(twentyYear.getText()) + Integer.parseInt(a6.getText()));
        a7.setText(Integer.toString(aBlockSum));
        aBlockSum = count.counter(Integer.parseInt(a4.getText()) + Integer.parseInt(a6.getText()));
        a5.setText(Integer.toString(aBlockSum));

        int bBlockSum;
        bBlockSum = count.counter(Integer.parseInt(twentyYear.getText()) + Integer.parseInt(thirtyYear.getText()));
        b4.setText(Integer.toString(bBlockSum));
        bBlockSum = count.counter(Integer.parseInt(b4.getText()) + Integer.parseInt(twentyYear.getText()));
        b2.setText(Integer.toString(bBlockSum));
        bBlockSum = count.counter(Integer.parseInt(twentyYear.getText()) + Integer.parseInt(b2.getText()));
        b1.setText(Integer.toString(bBlockSum));
        bBlockSum = count.counter(Integer.parseInt(b4.getText()) + Integer.parseInt(b2.getText()));
        b3.setText(Integer.toString(bBlockSum));
        bBlockSum = count.counter(Integer.parseInt(b4.getText()) + Integer.parseInt(thirtyYear.getText()));
        b6.setText(Integer.toString(bBlockSum));
        bBlockSum = count.counter(Integer.parseInt(thirtyYear.getText()) + Integer.parseInt(b6.getText()));
        b7.setText(Integer.toString(bBlockSum));
        bBlockSum = count.counter(Integer.parseInt(b4.getText()) + Integer.parseInt(b6.getText()));
        b5.setText(Integer.toString(bBlockSum));

        int cBlockSum;
        cBlockSum = count.counter(Integer.parseInt(thirtyYear.getText()) + Integer.parseInt(fortyYear.getText()));
        c4.setText(Integer.toString(cBlockSum));
        cBlockSum = count.counter(Integer.parseInt(c4.getText()) + Integer.parseInt(thirtyYear.getText()));
        c2.setText(Integer.toString(cBlockSum));
        cBlockSum = count.counter(Integer.parseInt(thirtyYear.getText()) + Integer.parseInt(c2.getText()));
        c1.setText(Integer.toString(cBlockSum));
        cBlockSum = count.counter(Integer.parseInt(c4.getText()) + Integer.parseInt(c2.getText()));
        c3.setText(Integer.toString(cBlockSum));
        cBlockSum = count.counter(Integer.parseInt(c4.getText()) + Integer.parseInt(fortyYear.getText()));
        c6.setText(Integer.toString(cBlockSum));
        cBlockSum = count.counter(Integer.parseInt(fortyYear.getText()) + Integer.parseInt(c6.getText()));
        c7.setText(Integer.toString(cBlockSum));
        cBlockSum = count.counter(Integer.parseInt(c4.getText()) + Integer.parseInt(c6.getText()));
        c5.setText(Integer.toString(cBlockSum));

        int dBlockSum;
        dBlockSum = count.counter(Integer.parseInt(fortyYear.getText()) + Integer.parseInt(fiftyYear.getText()));
        d4.setText(Integer.toString(dBlockSum));
        dBlockSum = count.counter(Integer.parseInt(d4.getText()) + Integer.parseInt(fortyYear.getText()));
        d2.setText(Integer.toString(dBlockSum));
        dBlockSum = count.counter(Integer.parseInt(fortyYear.getText()) + Integer.parseInt(d2.getText()));
        d1.setText(Integer.toString(dBlockSum));
        dBlockSum = count.counter(Integer.parseInt(d4.getText()) + Integer.parseInt(d2.getText()));
        d3.setText(Integer.toString(dBlockSum));
        dBlockSum = count.counter(Integer.parseInt(d4.getText()) + Integer.parseInt(fiftyYear.getText()));
        d6.setText(Integer.toString(dBlockSum));
        dBlockSum = count.counter(Integer.parseInt(fiftyYear.getText()) + Integer.parseInt(d6.getText()));
        d7.setText(Integer.toString(dBlockSum));
        dBlockSum = count.counter(Integer.parseInt(d4.getText()) + Integer.parseInt(d6.getText()));
        d5.setText(Integer.toString(dBlockSum));

        int eBlockSum;
        eBlockSum = count.counter(Integer.parseInt(fiftyYear.getText()) + Integer.parseInt(sixtyYear.getText()));
        e4.setText(Integer.toString(eBlockSum));
        eBlockSum = count.counter(Integer.parseInt(e4.getText()) + Integer.parseInt(fiftyYear.getText()));
        e2.setText(Integer.toString(eBlockSum));
        eBlockSum = count.counter(Integer.parseInt(fiftyYear.getText()) + Integer.parseInt(e2.getText()));
        e1.setText(Integer.toString(eBlockSum));
        eBlockSum = count.counter(Integer.parseInt(e4.getText()) + Integer.parseInt(e2.getText()));
        e3.setText(Integer.toString(eBlockSum));
        eBlockSum = count.counter(Integer.parseInt(e4.getText()) + Integer.parseInt(sixtyYear.getText()));
        e6.setText(Integer.toString(eBlockSum));
        eBlockSum = count.counter(Integer.parseInt(sixtyYear.getText()) + Integer.parseInt(e6.getText()));
        e7.setText(Integer.toString(eBlockSum));
        eBlockSum = count.counter(Integer.parseInt(e4.getText()) + Integer.parseInt(e6.getText()));
        e5.setText(Integer.toString(eBlockSum));

        int gBlockSum;
        gBlockSum = count.counter(Integer.parseInt(sixtyYear.getText()) + Integer.parseInt(seventyYear.getText()));
        g4.setText(Integer.toString(gBlockSum));
        gBlockSum = count.counter(Integer.parseInt(g4.getText()) + Integer.parseInt(sixtyYear.getText()));
        g2.setText(Integer.toString(gBlockSum));
        gBlockSum = count.counter(Integer.parseInt(sixtyYear.getText()) + Integer.parseInt(g2.getText()));
        g1.setText(Integer.toString(gBlockSum));
        gBlockSum = count.counter(Integer.parseInt(g4.getText()) + Integer.parseInt(g2.getText()));
        g3.setText(Integer.toString(gBlockSum));
        gBlockSum = count.counter(Integer.parseInt(g4.getText()) + Integer.parseInt(seventyYear.getText()));
        g6.setText(Integer.toString(gBlockSum));
        gBlockSum = count.counter(Integer.parseInt(seventyYear.getText()) + Integer.parseInt(g6.getText()));
        g7.setText(Integer.toString(gBlockSum));
        gBlockSum = count.counter(Integer.parseInt(g4.getText()) + Integer.parseInt(g6.getText()));
        g5.setText(Integer.toString(gBlockSum));

        int hBlockSum;
        hBlockSum = count.counter(Integer.parseInt(seventyYear.getText()) + Integer.parseInt(zeroYear.getText()));
        h4.setText(Integer.toString(hBlockSum));
        hBlockSum = count.counter(Integer.parseInt(h4.getText()) + Integer.parseInt(seventyYear.getText()));
        h2.setText(Integer.toString(hBlockSum));
        hBlockSum = count.counter(Integer.parseInt(seventyYear.getText()) + Integer.parseInt(h2.getText()));
        h1.setText(Integer.toString(hBlockSum));
        hBlockSum = count.counter(Integer.parseInt(h4.getText()) + Integer.parseInt(h2.getText()));
        h3.setText(Integer.toString(hBlockSum));
        hBlockSum = count.counter(Integer.parseInt(h4.getText()) + Integer.parseInt(zeroYear.getText()));
        h6.setText(Integer.toString(hBlockSum));
        hBlockSum = count.counter(Integer.parseInt(zeroYear.getText()) + Integer.parseInt(h6.getText()));
        h7.setText(Integer.toString(hBlockSum));
        hBlockSum = count.counter(Integer.parseInt(h4.getText()) + Integer.parseInt(h6.getText()));
        h5.setText(Integer.toString(hBlockSum));

        int jBlockSum;
        jBlockSum = count.counter(Integer.parseInt(zeroYear.getText()) + Integer.parseInt(tenYear.getText()));
        j4.setText(Integer.toString(jBlockSum));
        jBlockSum = count.counter(Integer.parseInt(j4.getText()) + Integer.parseInt(zeroYear.getText()));
        j2.setText(Integer.toString(jBlockSum));
        jBlockSum = count.counter(Integer.parseInt(zeroYear.getText()) + Integer.parseInt(j2.getText()));
        j1.setText(Integer.toString(jBlockSum));
        jBlockSum = count.counter(Integer.parseInt(j4.getText()) + Integer.parseInt(j2.getText()));
        j3.setText(Integer.toString(jBlockSum));
        jBlockSum = count.counter(Integer.parseInt(j4.getText()) + Integer.parseInt(tenYear.getText()));
        j6.setText(Integer.toString(jBlockSum));
        jBlockSum = count.counter(Integer.parseInt(tenYear.getText()) + Integer.parseInt(j6.getText()));
        j7.setText(Integer.toString(jBlockSum));
        jBlockSum = count.counter(Integer.parseInt(j4.getText()) + Integer.parseInt(j6.getText()));
        j5.setText(Integer.toString(jBlockSum));
    }
}
