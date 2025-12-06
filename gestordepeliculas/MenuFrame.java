/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordepeliculas;

import com.mycompany.gestordepeliculas.BotonPersonalizado;

import javax.swing.*;
/**
 *
 * @author david
 */
public class MenuFrame extends JFrame {

    public MenuFrame() {
        setTitle("Menú");
        setSize(300, 150);
        setLocationRelativeTo(null);

        BotonPersonalizado pelis = new BotonPersonalizado("Películas");
        BotonPersonalizado series = new BotonPersonalizado("Series");

        pelis.addActionListener(e -> {
            new PeliculasFrame().setVisible(true);
            dispose();
        });

        series.addActionListener(e -> {
            new SeriesFrame().setVisible(true);
            dispose();
        });

        setLayout(new java.awt.GridLayout(2, 1));
        add(pelis);
        add(series);
    }
}
