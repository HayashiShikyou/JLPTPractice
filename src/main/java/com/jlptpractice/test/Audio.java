//package com.jlptpractice.test;
//
//import java.io.File;
//import java.util.Objects;
//
//import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.ComboBox;
//import javafx.scene.control.Label;
//import javafx.scene.control.Slider;
//import javafx.scene.image.Image;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.scene.media.MediaPlayer.Status;
//import javafx.scene.media.MediaView;
//import javafx.stage.FileChooser;
//import javafx.stage.FileChooser.ExtensionFilter;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
//
//public class Audio extends Application {
//    private final Button btnPlay = new Button("||");
//    private final Slider slVolume = new Slider(0, 1, 1);
//    private final Label lblTime = new Label("--:--:--");
//    private final Slider slSkTime = new Slider(0, 1, 0);
//    private final ComboBox<Double> cmbRate = new ComboBox<>(FXCollections.observableArrayList(.6, .2, 1., 2., 3., 4.));
//    private final Button btnLoad = new Button("Load");
//    private final HBox control = new HBox(btnPlay, slVolume, lblTime, slSkTime, cmbRate, btnLoad);
//
//    private final FileChooser fc = new FileChooser();
//    private final MediaView mediaView = new MediaView();
//    private final BorderPane root = new BorderPane();
//    private final int width = 800;
//    private final int height = 500;
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    public void browse() {
//        File f = fc.showOpenDialog(root.getScene().getWindow());
//        if (f != null) {
//            if (mediaView.getMediaPlayer() != null)
//                mediaView.getMediaPlayer().stop();
//            Media media = new Media(f.toURI().toString());
//            MediaPlayer mediaPlayer = new MediaPlayer(media);
//            mediaView.setMediaPlayer(mediaPlayer);
//
//            mediaPlayer.play();
//            mediaView.setFitWidth(width);
//            root.getScene().getWindow().sizeToScene();
//        }
//    }
//
//    public void play() {
//        if (mediaView.getMediaPlayer().getStatus() == Status.PLAYING) {
//            mediaView.getMediaPlayer().pause();
//            btnPlay.setText(">");
//        } else {
//            mediaView.getMediaPlayer().play();
//            btnPlay.setText("||");
//        }
//    }
//
//    @Override
//    public void start(Stage st) throws Exception {
//        root.setTop(mediaView);
//        root.setBottom(control);
//        control.setAlignment(Pos.BASELINE_CENTER);
//
//        btnLoad.setOnAction(e -> browse());
//        btnPlay.setOnAction(e -> play());
//
//        slVolume.valueProperty().addListener((ob, ov, nv) -> {
//            if (mediaView.getMediaPlayer() != null) {
//                mediaView.getMediaPlayer().setVolume(nv.doubleValue());
//            }
//        });
//
//        mediaView.mediaPlayerProperty().addListener((ob, ov, nv) -> {
//            nv.setOnReady(() -> {
//                double totalTime = nv.getTotalDuration().toMillis();
//                slSkTime.setMax(totalTime);
//            });
//            nv.currentTimeProperty().addListener((ob1, ov1, nv1) -> {
//                double currentTime = nv.getCurrentTime().toMillis();
//                slSkTime.setValue(currentTime);
//
//                double sec = nv.getCurrentTime().toSeconds() % 60;
//                double min = nv.getCurrentTime().toMinutes() % 60;
//                double hr = nv.getCurrentTime().toHours();
//                String time = String.format("%02.0f:%02.0f:%02.0f", hr, min, sec);
//                lblTime.setText(time);
//            });
//            if (ov != null && ov.getStatus() == Status.PLAYING) {
//                ov.stop();
//                nv.play();
//            }
//        });
//
//        slSkTime.setOnMousePressed(e -> {
//            Duration seekTime = Duration.millis(slSkTime.getValue());
//            mediaView.getMediaPlayer().seek(seekTime);
//        });
//        slSkTime.setPrefWidth(300);
//
//        fc.getExtensionFilters().addAll(new ExtensionFilter("mp4", "*.mp4"),
//                new ExtensionFilter("FLV", "*.flv"),
//                new ExtensionFilter("All", "*.*"));
//
//        cmbRate.setValue(1.0);
//        cmbRate.setOnAction(e -> {
//            mediaView.getMediaPlayer().setRate(cmbRate.getValue());
//        });
//
////		Media media = new Media(new File("//home//tzo//Videos//Kyousougiga(10)//00.mkv").toURI().toString());
////        Media media = new Media(new File("D://Kimetsu_No_Yaiba_「AMV」Sold_Out(720p).mp4").toURI().toString());
////        Media media = new Media(new File("./audio/5202407.mp3").toURI().toString());
////        AudioInputStream audioIn = AudioSystem.getAudioInputStream(Objects.requireNonNull(Audio.class.getResource("5202407.mp3")));
////        Clip clip = AudioSystem.getClip();
////        clip.open(audioIn);
////        clip.start();
////        MediaPlayer mediaPlayer = new MediaPlayer(media);
////        mediaView.setMediaPlayer(mediaPlayer);
////        mediaPlayer.play();
////        mediaView.setFitWidth(width);
//
//        Scene sc = new Scene(root, width, height);
////        st.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("Icon 4.png"))));
//        st.setScene(sc);
//        st.setTitle("Media Playing");
//        st.show();
//    }
//
//}
