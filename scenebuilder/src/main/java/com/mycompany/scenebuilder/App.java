package com.mycompany.scenebuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("primary.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Buscaminas");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(); // Inicia JavaFX
    }
}

