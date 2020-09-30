package sample;


import javafx.application.Application;
import sample.controllerfxml.StartView;

public class Main {



    public static void main(String[] args) {
    startGuiView();
    }
    public static void startGuiView(){
        Application.launch(StartView.class);
    }
}
