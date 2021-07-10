package com.javafx.project;

import javafx.animation.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.*;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        FadeTransition fade = new FadeTransition();

        Text empty = new Text();
        Text username = new Text();
        Text password = new Text();
        TextField userfield = new TextField();
        PasswordField passfield = new PasswordField();

        fade.setDuration(Duration.millis(5000));
        fade.setFromValue(0.1);
        fade.setToValue(1.0);
        fade.play();

        username.setText("Username ");
        password.setText("Password ");
        empty.setText("");
        username.setStyle("-fx-background-image: url('')");
        username.setFont(Font.font("Montserrat", FontPosture.REGULAR, 25));
        password.setFont(Font.font("Montserrat", FontPosture.REGULAR, 25));

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: linear-gradient(rgba(199,55,255,1) 0%, rgba(0,218,244,1) 100%)");
        root.addRow(0, username, userfield);
        root.addRow(1, empty);
        root.addRow(2, password, passfield);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setWidth(1280);
        primaryStage.setHeight(720);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }

}