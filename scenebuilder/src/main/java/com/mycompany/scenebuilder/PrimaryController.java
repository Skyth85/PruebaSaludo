package com.mycompany.scenebuilder;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.util.Duration;

import java.util.Random;

public class PrimaryController {

    @FXML
    private GridPane grid;

    private static final int SIZE = 10;
    private static final int MINES = 15;

    private Button[][] buttons;
    private boolean[][] mines;
    private boolean[][] descubiertas;
    private boolean[][] marcadas;

    private boolean juegoTerminado;

    @FXML
    public void initialize() {
        iniciarJuego();
    }

    @FXML
    private void reiniciar() {
        iniciarJuego();
    }

    private void iniciarJuego() {

        juegoTerminado = false;
        grid.getChildren().clear();

        buttons = new Button[SIZE][SIZE];
        mines = new boolean[SIZE][SIZE];
        descubiertas = new boolean[SIZE][SIZE];
        marcadas = new boolean[SIZE][SIZE];

        colocarMinas();

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {

                Button btn = new Button();

                // Tamaño mejor para táctil (Y la fuente)
                btn.setPrefSize(60, 60);
                btn.setFont(Font.font(18));

                final int r = row;
                final int c = col;

                /* 
                   RATÓN 
                    */
                btn.setOnMouseClicked(e -> {

                    if (juegoTerminado) return;

                    // Evitar doble evento en pantallas táctiles
                    if (e.isSynthesized()) return;

                    if (e.getButton() == MouseButton.PRIMARY) {
                        descubrir(r, c);
                    }
                    else if (e.getButton() == MouseButton.SECONDARY) {
                        marcar(r, c);
                    }
                });


                /* 
                   TÁCTIL 
                    */

                PauseTransition hold =
                        new PauseTransition(Duration.millis(500));

                // Empieza a contar al tocar
                btn.setOnTouchPressed(e -> {
                    if (juegoTerminado) return;
                    hold.playFromStart();
                });

                // Si suelta antes → tap y no pone la bandera
                btn.setOnTouchReleased(e -> {

                    if (juegoTerminado) return;

                    if (hold.getStatus() == PauseTransition.Status.RUNNING) {

                        // Tap corto → abre la casilla
                        descubrir(r, c);
                        hold.stop();
                    }
                });

                // Si lo aguantas  → bandera
                hold.setOnFinished(e -> {

                    if (!juegoTerminado) {
                        marcar(r, c);
                    }
                });


                buttons[row][col] = btn;
                grid.add(btn, col, row);
            }
        }
    }

    

    private void colocarMinas() {

        Random rand = new Random();
        int colocadas = 0;

        while (colocadas < MINES) {

            int r = rand.nextInt(SIZE);
            int c = rand.nextInt(SIZE);

            if (!mines[r][c]) {

                mines[r][c] = true;
                colocadas++;
            }
        }
    }

    private void descubrir(int row, int col) {

        if (descubiertas[row][col] || marcadas[row][col]) return;

        descubiertas[row][col] = true;

        Button btn = buttons[row][col];

        if (mines[row][col]) {

            btn.setText("💣");
            btn.setStyle("-fx-background-color: red");
            finJuego(false);
            return;
        }

        int minasCercanas = contarMinasCercanas(row, col);

        if (minasCercanas > 0) {

            btn.setText(String.valueOf(minasCercanas));

        } else {

            btn.setText("");

            for (int i = row - 1; i <= row + 1; i++) {
                for (int j = col - 1; j <= col + 1; j++) {

                    if (i >= 0 && i < SIZE &&
                        j >= 0 && j < SIZE) {

                        descubrir(i, j);
                    }
                }
            }
        }

        btn.setDisable(true);

        comprobarVictoria();
    }

    private int contarMinasCercanas(int row, int col) {

        int count = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {

                if (i >= 0 && i < SIZE &&
                    j >= 0 && j < SIZE &&
                    mines[i][j]) {

                    count++;
                }
            }
        }

        return count;
    }

    private void marcar(int row, int col) {

        if (descubiertas[row][col]) return;

        marcadas[row][col] = !marcadas[row][col];

        buttons[row][col]
                .setText(marcadas[row][col] ? "🚩" : "");
    }

    private void comprobarVictoria() {

        int descubiertasCorrectas = 0;

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {

                if (descubiertas[r][c] && !mines[r][c]) {
                    descubiertasCorrectas++;
                }
            }
        }

        if (descubiertasCorrectas ==
                SIZE * SIZE - MINES) {

            finJuego(true);
        }
    }

    private void finJuego(boolean victoria) {

        juegoTerminado = true;

        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {

                if (mines[r][c]) {
                    buttons[r][c].setText("💣");
                }

                buttons[r][c].setDisable(true);
            }
        }

        System.out.println(
                victoria ? "¡HAS GANADO!" : "HAS PERDIDO"
        );
    }
}


