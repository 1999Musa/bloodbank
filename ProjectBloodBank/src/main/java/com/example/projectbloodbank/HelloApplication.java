package com.example.projectbloodbank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("RegPg.fxml"));
        primaryStage.setTitle("Registration");
        primaryStage.setScene(new Scene(root, 750, 580));
        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
    }

    public static void main(String[] args) {
        launch();
    }
}
