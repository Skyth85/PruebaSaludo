/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasjunit;

import javax.swing.*;
import java.awt.*;


public class CalculadoraUI extends JFrame {

    private JTextField pantalla;
    private JButton btnSumar, btnRestar, btnMultiplicar, btnDividir, btnCombinada;

    private Calculadora calc = new Calculadora();

    public CalculadoraUI() {
        setTitle("Calculadora");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        pantalla = new JTextField();
        pantalla.setName("pantalla");
        pantalla.setEditable(false);
        add(pantalla, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(5, 1));

        btnSumar = new JButton("Sumar");
        btnRestar = new JButton("Restar");
        btnMultiplicar = new JButton("Multiplicar");
        btnDividir = new JButton("Dividir");
        btnCombinada = new JButton("Combinada");

        btnSumar.setName("btnSumar");
        btnRestar.setName("btnRestar");
        btnMultiplicar.setName("btnMultiplicar");
        btnDividir.setName("btnDividir");
        btnCombinada.setName("btnCombinada");

        panel.add(btnSumar);
        panel.add(btnRestar);
        panel.add(btnMultiplicar);
        panel.add(btnDividir);
        panel.add(btnCombinada);

        add(panel, BorderLayout.CENTER);

        // Acciones con valores fijos para pruebas
        btnSumar.addActionListener(e ->
                pantalla.setText(String.valueOf(calc.sumar(2, 3))));

        btnRestar.addActionListener(e ->
                pantalla.setText(String.valueOf(calc.restar(5, 3))));

        btnMultiplicar.addActionListener(e ->
                pantalla.setText(String.valueOf(calc.multiplicar(3, 4))));

        btnDividir.addActionListener(e ->
                pantalla.setText(String.valueOf(calc.dividir(8, 2))));

        btnCombinada.addActionListener(e ->
                pantalla.setText(String.valueOf(calc.operacionCombinada(2, 3, 4, 2))));
    }
}

