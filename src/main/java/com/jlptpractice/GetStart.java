package com.jlptpractice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

public class GetStart extends Application {

    public static Stage stage;
    public static Scene scene;
    public static FXMLLoader loader;
    public static Node info_node;
    public static Image bg;
    public static BackgroundSize size;
    public static BackgroundImage bg_img;
    public static VBox root = new VBox();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        size = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true);
        bg = new Image(Objects.requireNonNull(getClass().getResourceAsStream("GetStart.jpg")));
        bg_img = new BackgroundImage(bg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, size);
        root.setBackground(new Background(bg_img));

        loader = new FXMLLoader(getClass().getResource("GetStart.fxml"));
        info_node = loader.load();
        VBox.setVgrow(info_node, Priority.ALWAYS);
        root.getChildren().add(info_node);
        root.setAlignment(Pos.TOP_CENTER);

        stage = primaryStage;
        scene = new Scene(root, 1140, 1080);
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JLPT Practice App");
        primaryStage.show();
    }
}