package com.javafx.project;

import javafx.animation.*;
import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.util.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        TranslateTransition translate = new TranslateTransition();

        Image image = new Image("logo.png");
        ImageView imgView = new ImageView(image);
        imgView.setFitWidth(500);
        imgView.setFitHeight(300);
        imgView.setTranslateY(-400);

        Text empty = new Text();
        Label username = new Label();
        Label password = new Label();
        Label message = new Label();
        TextField userfield = new TextField();
        PasswordField passfield = new PasswordField();
        Button submit = new Button("Submit");

        translate.setDuration(Duration.seconds(3.3));
        translate.setByY(400);
        translate.setNode(imgView);
        translate.play();

        username.setText("Username ");
        password.setText("Password ");
        submit.setTranslateY(30);
        message.setText("");
        message.setId("message");
        message.setTranslateY(50);

        VBox mroot = new VBox();

        VBox lroot = new VBox();
        lroot.setId("pane");
        lroot.setAlignment(Pos.BASELINE_CENTER);
        lroot.setFillWidth(false);
        lroot.getChildren().addAll(imgView, username, userfield, password, passfield, submit, message);

        Scene login = new Scene(lroot);
        Scene main = new Scene(mroot);

        submit.setCursor(Cursor.HAND);
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String uname = userfield.getText().toString();
                String pass = passfield.getText().toString();

                if (uname.equals("admin") && pass.equals("admin")) {
                    message.setText("Login Successful!!");
                    message.setStyle("-fx-text-fill: lime;");
                    primaryStage.setScene(main);
                } else {
                    message.setText("Incorrect Crenditials!!");
                    message.setStyle("-fx-text-fill: #9E0000;");
                }
            }
        });

        login.getStylesheets().addAll(this.getClass().getResource("/styles/styles.css").toExternalForm());
        primaryStage.setScene(login);
        primaryStage.setWidth(1280);
        primaryStage.setHeight(720);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}