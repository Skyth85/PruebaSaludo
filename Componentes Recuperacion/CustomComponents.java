/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componentesfxjemmy;

/**
 *
 * @author david
 */
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

class GameButton extends Button {

    private final String choice;
    private final String hoverColor;

    public GameButton(String text, String hoverColor) {
        super(text);
        this.choice = text;
        this.hoverColor = hoverColor;
        initStyle();
        initHoverEffect();
    }

    private void initStyle() {
        this.setStyle("-fx-background-color: lightblue; -fx-font-size: 16px; -fx-pref-width: 120px;");
    }

    private void initHoverEffect() {
        this.addEventHandler(MouseEvent.MOUSE_ENTERED, e ->
            this.setStyle("-fx-background-color: " + hoverColor + "; -fx-font-size: 16px; -fx-pref-width: 120px;")
        );
        this.addEventHandler(MouseEvent.MOUSE_EXITED, e ->
            this.setStyle("-fx-background-color: lightblue; -fx-font-size: 16px; -fx-pref-width: 120px;")
        );
    }

    public String getChoice() {
        return choice;
    }
}

class ResultLabel extends Label {

    public ResultLabel() {
        super("Elige Piedra, Papel o Tijera");
        this.setStyle("-fx-font-size: 18px; -fx-text-fill: darkblue;");
    }

    public void showResult(String text) {
        this.setText(text);
    }
}
