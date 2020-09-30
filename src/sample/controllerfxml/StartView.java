package sample.controllerfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class StartView extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("page.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Noize");
            Image ico = new Image("file:img\\logo512.png");
            stage.getIcons().add(ico);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.showAndWait();
        }
    }
