package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    // Coded by Christian C.

    @Override
    public void start(Stage primaryStage) throws Exception{

       Controller control = new Controller(primaryStage);

       // Screen size
        int screenSizeX = 1280;
        int screenSizeY = 720;

        control.BuildStage(screenSizeX, screenSizeY);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
