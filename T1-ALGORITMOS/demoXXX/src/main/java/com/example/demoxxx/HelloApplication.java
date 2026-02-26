package com.example.demoxxx;

import com.example.demoxxx.solitaire.SolitaireGame;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private SolitaireGame sg;
    @Override
    public void start(Stage stage) throws IOException {
        sg = new SolitaireGame();

        BorderPane principal = new BorderPane();
        Button botoncito = new Button(sg.toString());
        principal.setBottom(botoncito);

        Scene scene = new Scene(principal, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}