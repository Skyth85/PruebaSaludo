/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasjunit;

import org.junit.jupiter.api.Test;
import org.netbeans.jemmy.operators.JFrameOperator;
import org.netbeans.jemmy.operators.JButtonOperator;
import org.netbeans.jemmy.operators.JTextFieldOperator;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    void testSumarDesdeInterfaz() {
        new CalculadoraUI().setVisible(true);

        JFrameOperator frame = new JFrameOperator("Calculadora");
        JButtonOperator btnSumar = new JButtonOperator(frame, "Sumar");
        JTextFieldOperator pantalla = new JTextFieldOperator(frame);

        btnSumar.push();

        assertEquals("5.0", pantalla.getText());
    }

    @Test
    void testOperacionCombinadaDesdeInterfaz() {
        new CalculadoraUI().setVisible(true);

        JFrameOperator frame = new JFrameOperator("Calculadora");
        JButtonOperator btnCombinada = new JButtonOperator(frame, "Combinada");
        JTextFieldOperator pantalla = new JTextFieldOperator(frame);

        btnCombinada.push();

        assertEquals("10.0", pantalla.getText());
    }
}
