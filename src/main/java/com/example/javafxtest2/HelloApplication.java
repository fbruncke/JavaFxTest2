package com.example.javafxtest2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.beans.binding.Bindings;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

import java.io.IOException;

public class HelloApplication extends Application {
    private TextField tfDigit1;
    private TextField tfDigit2;
    private Label lbResult;
    private Calculator calc;




    @Override
    public void start(Stage primaryStage) throws Exception {

        setUpUI(primaryStage);

        setUpCalculator();
    }

    private void setUpCalculator()
    {
        calc = new Calculator();

        StringConverter<Number> converter = new NumberStringConverter();
        Bindings.bindBidirectional(tfDigit1.textProperty(), calc.digit1Property(), converter);
        Bindings.bindBidirectional(tfDigit2.textProperty(), calc.digit2Property(), converter);

        lbResult.textProperty().bind( Bindings.format("%d", calc.digitResultProperty() ));
    }


    private void setUpUI(Stage primaryStage)
    {
        Pane pane = new Pane();
        Scene scene = new Scene(pane,500,500);

        tfDigit1 = new TextField();
        tfDigit1.setMaxWidth(100);
        tfDigit1.setLayoutX(50);
        tfDigit1.setLayoutY(50);

        Label lbAdd = new Label("+");
        lbAdd.setMinWidth(20);
        lbAdd.setLayoutX(175);
        lbAdd.setLayoutY(50);

        tfDigit2 = new TextField();
        tfDigit2.setMaxWidth(100);
        tfDigit2.setLayoutX(200);
        tfDigit2.setLayoutY(50);

        Label lbEqual = new Label("=");
        lbEqual.setMinWidth(20);
        lbEqual.setLayoutX(325);
        lbEqual.setLayoutY(50);

        lbResult = new Label();
        lbResult.setMinWidth(100);
        lbResult.setLayoutX(350);
        lbResult.setLayoutY(50);

        Button btnMultiply = new Button("Multiply");
        btnMultiply.setLayoutX(50);
        btnMultiply.setLayoutY(150);
        btnMultiply.setOnAction((e)->{  calc.multiply(); });


        Button btnAdd = new Button("Add");
        btnAdd.setLayoutX(200);
        btnAdd.setLayoutY(150);
        btnAdd.setOnAction((e)->{  calc.add();  });


        pane.getChildren().addAll(tfDigit1,tfDigit2,lbResult,lbAdd,lbEqual,btnMultiply, btnAdd );

        primaryStage.setTitle("Cool Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}