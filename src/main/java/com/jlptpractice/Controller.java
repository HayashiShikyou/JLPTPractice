package com.jlptpractice;

import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.Objects;

public class Controller {

    public void switchGS() throws Exception {
        GetStart.bg = new Image(Objects.requireNonNull(getClass().getResourceAsStream("GetStart.jpg")));
        GetStart.bg_img = new BackgroundImage(GetStart.bg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, GetStart.size);
        GetStart.root.setBackground(new Background(GetStart.bg_img));

        GetStart.loader = new FXMLLoader(getClass().getResource("GetStart.fxml"));
        GetStart.info_node = GetStart.loader.load();
        GetStart.root.getChildren().clear();
        GetStart.root.getChildren().add(GetStart.info_node);
        VBox.setVgrow(GetStart.info_node, Priority.ALWAYS);
        GetStart.scene.setRoot(GetStart.root);
        GetStart.stage.setScene(GetStart.scene);
        GetStart.stage.show();
    }

    public void switchLV() throws IOException {
        GetStart.bg = new Image(Objects.requireNonNull(getClass().getResourceAsStream("LevelPage.jpg")));
        GetStart.bg_img = new BackgroundImage(GetStart.bg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, GetStart.size);
        GetStart.root.setBackground(new Background(GetStart.bg_img));

        GetStart.loader = new FXMLLoader(getClass().getResource("LevelPage.fxml"));
        GetStart.info_node = GetStart.loader.load();
        GetStart.root.getChildren().clear();
        GetStart.root.getChildren().add(GetStart.info_node);
        VBox.setVgrow(GetStart.info_node, Priority.ALWAYS);
        GetStart.scene.setRoot(GetStart.root);
        GetStart.stage.setScene(GetStart.scene);
        GetStart.stage.show();
    }

    public void switchYM() throws IOException {
        GetStart.bg = new Image(Objects.requireNonNull(getClass().getResourceAsStream("YearMonth.jpg")));
        GetStart.bg_img = new BackgroundImage(GetStart.bg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, GetStart.size);
        GetStart.root.setBackground(new Background(GetStart.bg_img));

        GetStart.loader = new FXMLLoader(getClass().getResource("YearMonth.fxml"));
        GetStart.info_node = GetStart.loader.load();
        GetStart.root.getChildren().clear();
        GetStart.root.getChildren().add(GetStart.info_node);
        VBox.setVgrow(GetStart.info_node, Priority.ALWAYS);
        GetStart.scene.setRoot(GetStart.root);
        GetStart.stage.setScene(GetStart.scene);
        GetStart.stage.show();
    }

    public void switchQA() throws IOException {
        GetStart.loader = new FXMLLoader(getClass().getResource("QuestionRoot.fxml"));
        GetStart.info_node = GetStart.loader.load();
        GetStart.root.getChildren().clear();
        GetStart.root.getChildren().add(GetStart.info_node);
        VBox.setVgrow(GetStart.info_node, Priority.ALWAYS);
        GetStart.scene.setRoot(GetStart.root);
        GetStart.stage.setScene(GetStart.scene);
        GetStart.stage.show();
    }
}