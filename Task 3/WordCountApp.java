package com.example.task3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WordCountApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        WordCountGUI gui = new WordCountGUI();
        Scene scene = new Scene(gui.getMainLayout(), 400, 200);

        primaryStage.setTitle("Word Count App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
