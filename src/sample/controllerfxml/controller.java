package sample.controllerfxml;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;


public class controller {
    public Media media;

    public void setMedia(String cane) {
            this.media = new Media(new File(cane).toURI().toString());


    }
    @FXML
    ImageView img;
    @FXML
    Button one;
    @FXML
    Button two;
    @FXML
    Button three;
    @FXML
    Button four;
    @FXML
    Button five;
    @FXML
    Button six;
    @FXML
    Button seven;
    @FXML
    Button eight;
    @FXML
    Button nine;
    @FXML
    Button ten;
    @FXML
    Button play;
    @FXML
    Button pause;
    @FXML
    Label label;

    public void PlayOne() {
        img.setImage(new Image("file:img\\i1.gif"));
        label.setText("Waterfall in a forest");
        setMedia("media/a1.mp3");
    }

    public void PlayTwo() {
        img.setImage(new Image("file:img\\i2.JPG"));
        label.setText("Thunderstorm & Rains");
       setMedia("media/a2.mp3");
    }

    public void PlayThree() {
        img.setImage(new Image("file:img\\i3.JPG"));
        label.setText("Cafe Music");
        setMedia("media/a3.mp3");
    }

    public void PlayFour() {
        img.setImage(new Image("file:img\\i4.gif"));
        label.setText("Brown Noise");
       setMedia("media/a4.mp3");
    }

    public void PlayFive() {
        img.setImage(new Image("file:img\\i5.gif"));
        label.setText("Rainy Day");
        setMedia("media/a5.mp3");
    }

    public void PlaySix() {
        img.setImage(new Image("file:img\\i6.gif"));
        label.setText("Medieval Town");
       setMedia("media/a6.mp3");
    }

    public void PlaySeven() {
        img.setImage(new Image("file:img\\i7.JPG"));
        label.setText("Celestial Noise");
        setMedia("media/a7.mp3");
    }

    public void PlayEight() {
        img.setImage(new Image("file:img\\i8.gif"));
        label.setText("Metropolis Soundscape");
        setMedia("media/a8.mp3");
    }

    public void PlayNine() {
        img.setImage(new Image("file:img\\i9.JPG"));
        label.setText("Snowy Blizzard");
        setMedia("media/a9.mp3");
    }

    public void PlayTen() {
        img.setImage(new Image("file:img\\i10.gif"));
        label.setText("Forest Ambience");
        setMedia("media/a10.mp3");
    }
    static MediaPlayer mediaPlayer;
    public void play(){
        mediaPlayer = new MediaPlayer(this.media);
        mediaPlayer.play();
    }

    public void pause (){
        mediaPlayer.pause();
    }

}
