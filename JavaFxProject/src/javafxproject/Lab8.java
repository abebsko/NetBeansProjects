/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author seyib
 */
public class Lab8 extends Application {
//Intialize the Stage 
    @Override
    public void start(Stage primaryStage) {
        //create a button
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        //Faster to do this 
        // Button btn = new Button("Say, Hello World");
        //action when clicking on the button
        btn.setOnAction(new EventHandler<ActionEvent>() {
//EventHandler is an interface to a super class with method handle declared
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        //faster way using lambda expression
        /*
        btn.setOnAction((ActionEvent event) -> {
        System.out.println("Hello World!");
        });
         */
        //StackPane is a panel that stacks components on top of each other 
        StackPane root = new StackPane();
        
//        StackPane.setAlignment(btn, Pos.BOTTOM_RIGHT);
//        StackPane.setAlignment(label, Pos.TOP_LEFT);
//        root.getChildren().addAll(btn, label); 

//Get a list of all the Children first and then add to it 
        root.getChildren().add(btn);

        //Scene class is the container for all content in a window that you add panes to 
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
