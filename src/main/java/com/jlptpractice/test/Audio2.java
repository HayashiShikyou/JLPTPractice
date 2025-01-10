package com.jlptpractice.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Audio2 extends Application {
    private final VBox vBox = new VBox();
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();
    }
}
