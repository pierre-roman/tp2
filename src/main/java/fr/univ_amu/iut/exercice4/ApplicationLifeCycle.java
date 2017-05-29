package fr.univ_amu.iut.exercice4;

import javafx.application.Application;
import javafx.stage.Stage;

public class ApplicationLifeCycle extends Application {

    public ApplicationLifeCycle() {
    }

    public static void main(String[] args) {
        System.out.println("main() : avant launch");
        launch(args);
        System.out.println("main() : après launch");
    }

    @Override
    public void init() throws Exception {

    }

    @Override
    public void stop() throws Exception {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
