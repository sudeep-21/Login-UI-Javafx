package com.javafx.project;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Stop[] stops = new Stop[] { new Stop(0, Color.GREEN), new Stop(1, Color.BLUE)};
        LinearGradient linear = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);

        Text username = new Text();
        Text password = new Text();
        TextField txtfield = new TextField();
        PasswordField passfield = new PasswordField();

        username.setText("Username: ");
        password.setText("Password: ");
        username.setFont(Font.font("Montserrat", FontPosture.REGULAR, 25));
        password.setFont(Font.font("Montserrat", FontPosture.REGULAR, 25));
        username.setFill(linear);

        VBox root = new VBox();
        root.getChildren().add(username);
        root.getChildren().add(password);
        root.setAlignment(Pos.CENTER);
        root.setId("pane");

        Scene scene = new Scene(root);
        scene.setFill(Color.RED);

        primaryStage.setScene(scene);
        primaryStage.setWidth(1280);
        primaryStage.setHeight(720);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }

}