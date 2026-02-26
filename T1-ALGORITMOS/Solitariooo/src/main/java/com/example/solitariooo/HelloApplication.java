package com.example.solitariooo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane principal = new BorderPane();
        Button botoncito = new Button("HOLA SOY BOTONCITO");
        principal.setBottom(botoncito);
        Scene scene = new Scene(principal, 1500, 840);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}