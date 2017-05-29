package fr.univ_amu.iut.exercice3;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MyUndecoratedJavaFXWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Undecorated Useless JavaFX Window");
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setResizable(false);
        primaryStage.setWidth(800);
        primaryStage.setHeight(400);
        primaryStage.initStyle(StageStyle.UNDECORATED);
    }
}
