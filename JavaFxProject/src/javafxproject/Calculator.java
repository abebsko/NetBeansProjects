/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author seyib
 */
public class Calculator extends Application {

    private TextField input1, input2; //Input boxes for the numbers
    private Label result; //Label for displaying the answer

    private void formatButton(Button button, int width, int height, char operation) {
        button.setMinSize(width, height);
        button.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        button.setOnAction((ActionEvent event) -> doOperation(operation));
        HBox.setHgrow(button, Priority.ALWAYS);
        button.setMaxWidth(Double.POSITIVE_INFINITY);
        button.setStyle(
                "-fx-background-color: linear-gradient(lightgray 0%, gray 25%, black 50%, gray 75%, lightgray 100%);"
                + "-fx-background-insets: 2,2,2,2;"
                + "-fx-text-fill: white;"
                + "-fx-effect: dropshadow( three-pass-box , gray , 0, 0 , 2 , 2 );"
        );
    }

    private void setPadding(Pane pane, int l, int r, int t, int b) {
 for (Node n: pane.getChildren()){
 Region region = (Region) n;
 region.setPadding(new Insets(l,r,t,b));
 }
    }

    @Override
    public void start(Stage primaryStage) {
        Label input1Label = new Label("Number 1 =");
        Label input2Label = new Label("Number 2 =");
        input1 = new TextField("1");
        input2 = new TextField("2");
        Button plus = new Button("+");
        Button minus = new Button("-");
        Button times = new Button("*");
        Button divide = new Button("/");
        result = new Label("result=");
        //call functions for buttons
        formatButton(plus, 40, 40, '+');
        formatButton(minus, 40, 40, '-');
        formatButton(times, 40, 40, '*');
        formatButton(divide, 40, 40, '/');

        //HBox Layout pane 
        HBox boxNumber1 = new HBox();
        boxNumber1.getChildren().addAll(input1Label, input1);

        HBox boxNumber2 = new HBox();
        boxNumber2.getChildren().addAll(input2Label, input2);

        HBox buttonBox = new HBox();
        buttonBox.getChildren().addAll(plus, minus, times, divide);

        //VBox Layout 
        VBox layout = new VBox();
        layout.getChildren().addAll(boxNumber1, boxNumber2, buttonBox, result);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

        //Formating 
        setPadding(layout, 5,5,5,5); //calls setPadding function
//        boxNumber1.setPadding(new Insets(5, 5, 5, 5));
//        boxNumber2.setPadding(new Insets(5, 5, 5, 5));
//        buttonBox.setPadding(new Insets(5, 5, 5, 5));
//        layout.setPadding(new Insets(5, 5, 5, 5));
//        result.setPadding(new Insets(5, 5, 5, 5));
        

//        plus.setPrefSize(40, 40); button will not grow 
//        minus.setPrefSize(40, 40);
//        times.setPrefSize(40, 40);
//        divide.setPrefSize(40, 40);
//        plus.setMinSize(40, 40);
//        minus.setMinSize(40, 40);
//        times.setMinSize(40, 40);
//        divide.setMinSize(40, 40);
        //formating result label
        
        result.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        result.setStyle(
                "-fx-background-color: black;"
                + "-fx-text-alignment:left;"
                + "-fx-padding: 10;"
                + "-fx-spacing: 10;"
                + "-fx-border-color: gray;"
                + "-fx-border-width: 5px;"
                + "-fx-text-fill: red;"
        );

        //Alignment of Components when window is resized
        HBox.setHgrow(input1, Priority.ALWAYS);
        HBox.setHgrow(input2, Priority.ALWAYS);

//        //Add border 
//        boxNumber1.setStyle(
//                "-fx-border-color: black;"
//                + "-fx-border-width: 1px;"
//        );
//        HBox.setHgrow(plus, Priority.ALWAYS);
//        HBox.setHgrow(minus, Priority.ALWAYS);
//        HBox.setHgrow(times, Priority.ALWAYS);
//        HBox.setHgrow(divide, Priority.ALWAYS);
//        plus.setMaxWidth(Double.POSITIVE_INFINITY);
//        minus.setMaxWidth(Double.POSITIVE_INFINITY);
//        times.setMaxWidth(Double.POSITIVE_INFINITY);
//        divide.setMaxWidth(Double.POSITIVE_INFINITY);
        HBox.setHgrow(result, Priority.ALWAYS);
        result.setMaxWidth(Double.POSITIVE_INFINITY);

        VBox.setVgrow(result, Priority.ALWAYS);
        result.setMaxHeight(Double.POSITIVE_INFINITY);

        //Buttons Functionality
//        plus.setOnAction((ActionEvent event) -> doOperation('+'));
//        minus.setOnAction((ActionEvent event) -> doOperation('-'));
//        times.setOnAction((ActionEvent event) -> doOperation('*'));
//        divide.setOnAction((ActionEvent event) -> doOperation('/'));
    }

    private void doOperation(char op) {
        double x, y; // The numbers from the input boxes.
        try {
            String xStr = input1.getText();
            x = Double.parseDouble(xStr);
        } catch (NumberFormatException e) {
// The string xStr is not a legal number.
            result.setText("Illegal data for x.");
            input1.requestFocus();
            input1.selectAll();
            return;
        }
        try {
            String yStr = input2.getText();
            y = Double.parseDouble(yStr);
        } catch (NumberFormatException e) {
            result.setText("Illegal data for y.");
            input2.requestFocus();
            input2.selectAll();
            return;
        }
        switch (op) {
            case '+':
                result.setText("Result (+) = " + (x + y));
                break;
            case '-':
                result.setText("Result (-) = " + (x - y));
                break;
            case '*':
                result.setText("Result (*) = " + (x * y));
                break;
            case '/':
                if (y == 0) {
                    result.setText("Can't divide by zero!");
                    input1.requestFocus();
                    input2.selectAll();
                } else {
                    result.setText("Result (/) = " + (x / y));
                }
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
