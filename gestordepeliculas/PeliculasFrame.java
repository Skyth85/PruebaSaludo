/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordepeliculas;

import com.mycompany.gestordepeliculas.*; 
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author david
 */
public class PeliculasFrame extends JFrame {

    private Peliculas[] pelis = {
        new Peliculas("Matrix", 1, "matrix.png", 130),
        new Peliculas("Avatar", 2, "avatar.png", 160)
    };

    public PeliculasFrame() {
        setTitle("Películas");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JComboBox<String> lista = new JComboBox<>();
        for (Peliculas p : pelis)
            lista.addItem(p.getNombre());

        JLabel imagen = new JLabel();
        JLabel info = new JLabel();

        lista.addActionListener(e -> {
            int idx = lista.getSelectedIndex();
            Peliculas p = pelis[idx];
            info.setText("<html>" + p.getNombre() + "<br>Duración: " + p.getDuracion() + "</html>");
            imagen.setIcon(new ImageIcon(p.getRutaImagen()));
        });

        BotonPersonalizado fav = new BotonPersonalizado("Guardar favorito");
        fav.addActionListener(e -> Favoritos.agregar(pelis[lista.getSelectedIndex()]));

        setLayout(new BorderLayout());
        add(lista, BorderLayout.NORTH);
        add(imagen, BorderLayout.CENTER);
        add(info, BorderLayout.SOUTH);
        add(fav, BorderLayout.EAST);
    }
}