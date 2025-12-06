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
public class SeriesFrame extends JFrame {

    private Series[] series = {
        new Series("Breaking Bad", 3, "bb.png", 5,
                new int[]{7, 10, 13, 13, 16},
                new int[]{45, 45, 47, 50, 55}),
        new Series("Dark", 4, "dark.png", 3,
                new int[]{10, 8, 8},
                new int[]{55, 56, 60})
    };

    public SeriesFrame() {
        setTitle("Series");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JComboBox<String> lista = new JComboBox<>();
        for (Series s : series)
            lista.addItem(s.getNombre());

        JLabel imagen = new JLabel();
        JLabel info = new JLabel();

        lista.addActionListener(e -> {
            Series s = series[lista.getSelectedIndex()];
            info.setText("<html>" + s.getNombre() +
                    "<br>Temporadas: " + s.calcularDuracionTotal() + "</html>");
            imagen.setIcon(new ImageIcon(s.getRutaImagen()));
        });

        BotonPersonalizado fav = new BotonPersonalizado("Guardar favorito");
        fav.addActionListener(e -> Favoritos.agregar(series[lista.getSelectedIndex()]));

        setLayout(new BorderLayout());
        add(lista, BorderLayout.NORTH);
        add(imagen, BorderLayout.CENTER);
        add(info, BorderLayout.SOUTH);
        add(fav, BorderLayout.EAST);
    }
}