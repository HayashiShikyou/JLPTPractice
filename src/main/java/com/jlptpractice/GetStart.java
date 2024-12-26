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

    private static Stage stage;
    private static final VBox root = new VBox();
    private static final BackgroundSize size = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        changeBG("GetStart.jpg");
        root.setAlignment(Pos.TOP_CENTER);
        Scene scene = new Scene(root, 1140, 1080);
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(600);
        primaryStage.setMaximized(true);
        primaryStage.setTitle("JLPT Practice App");
        changeScene("GetStart.fxml");
    }

    public static void changeScene(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader(GetStart.class.getResource(fxml));
        Node info_node = loader.load();
        VBox.setVgrow(info_node, Priority.ALWAYS);
        root.getChildren().clear();
        root.getChildren().add(info_node);
        stage.getScene().setRoot(root);
        stage.show();
    }

    public static void changeBG(String file) {
        Image bg = new Image(Objects.requireNonNull(GetStart.class.getResourceAsStream(file)));
        BackgroundImage bg_img = new BackgroundImage(bg, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, size);
        root.setBackground(new Background(bg_img));
    }

}