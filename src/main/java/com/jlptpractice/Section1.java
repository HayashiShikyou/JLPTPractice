package com.jlptpractice;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Section1 implements Initializable {

    @FXML
    VBox questions_view;

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

    public void setLoader() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Section1.fxml"));
        Node info_node = loader.load();
        questions_view.getChildren().add(info_node);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            setLoader();
            setLoader();
            setLoader();
            setLoader();
            setLoader();
            setLoader();
            setLoader();
            setLoader();
            setLoader();
            setLoader();
            setLoader();
            setLoader();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
