/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.componentesfxjemmy;

/**
 *
 * @author david
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Random;

public class ComponentesFXJemmy extends Application {

    private final String[] options = {"Piedra", "Papel", "Tijera"};
    private final Random random = new Random();

    @Override
    public void start(Stage stage) {

        ResultLabel resultLabel = new ResultLabel();

        GameButton piedraBtn = new GameButton("Piedra", "lightcoral");
        GameButton papelBtn = new GameButton("Papel", "lightgoldenrodyellow");
        GameButton tijeraBtn = new GameButton("Tijera", "lightpink");

        piedraBtn.setOnAction(e -> play(piedraBtn.getChoice(), resultLabel));
        papelBtn.setOnAction(e -> play(papelBtn.getChoice(), resultLabel));
        tijeraBtn.setOnAction(e -> play(tijeraBtn.getChoice(), resultLabel));

        HBox buttonBox = new HBox(15, piedraBtn, papelBtn, tijeraBtn);
        buttonBox.setStyle("-fx-alignment: center;");

        VBox root = new VBox(20, resultLabel, buttonBox);
        root.setStyle("-fx-padding: 30; -fx-alignment: center;");

        Scene scene = new Scene(root, 500, 300);
        stage.setTitle("Piedra, Papel o Tijera - JavaFX Componentes Personalizados");
        stage.setScene(scene);
        stage.show();
    }

    private void play(String playerChoice, ResultLabel resultLabel) {
        String cpuChoice = options[random.nextInt(3)];

        String result;

        if (playerChoice.equals(cpuChoice)) {
            result = "Empate. Ambos elegisteis " + playerChoice;
        } else if (
                (playerChoice.equals("Piedra") && cpuChoice.equals("Tijera")) ||
                (playerChoice.equals("Papel") && cpuChoice.equals("Piedra")) ||
                (playerChoice.equals("Tijera") && cpuChoice.equals("Papel"))
        ) {
            result = "¡Ganaste! " + playerChoice + " vence a " + cpuChoice;
        } else {
            result = "Perdiste. " + cpuChoice + " vence a " + playerChoice;
        }

        resultLabel.showResult(result);
    }

    public static void main(String[] args) {
        launch();
    }
}
