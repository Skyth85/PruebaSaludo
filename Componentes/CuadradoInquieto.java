/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componentes;

import javax.swing.*;
import java.awt.*;

public class CuadradoInquieto extends JFrame {

    private JPanel obj1, obj2;
    private Timer timerMovimiento, timerParpadeo;

    public CuadradoInquieto() {

        setTitle("Animación con Colisiones");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Cuadrados
        
        obj1 = new JPanel();
        obj1.setBackground(Color.BLUE);
        obj1.setBounds(50, 50, 70, 70);

        obj2 = new JPanel();
        obj2.setBackground(Color.RED);
        obj2.setBounds(300, 250, 70, 70);

        add(obj1);
        add(obj2);

        iniciarAnimacion();
    }

    private void iniciarAnimacion() {

        final int[] dx = {3};
        final int[] dy = {3};

        // Temporizador 1  Movimiento
        
        timerMovimiento = new Timer(25, e -> {

            obj1.setLocation(obj1.getX() + dx[0], obj1.getY() + dy[0]);

            // Rebotes en bordes
            
            if (obj1.getX() < 0 || obj1.getX() + obj1.getWidth() > getWidth())
                dx[0] = -dx[0];

            if (obj1.getY() < 0 || obj1.getY() + obj1.getHeight() > getHeight())
                dy[0] = -dy[0];

            // Colisión
            if (obj1.getBounds().intersects(obj2.getBounds())) {
                obj2.setBackground(Color.GREEN);
            } else {
                obj2.setBackground(Color.RED);
            }
        });

        timerMovimiento.start();

        // Temporizador 2 → Parpadeo
      
        timerParpadeo = new Timer(600, e -> {
            Color c = obj2.getBackground();
            obj2.setBackground(c == Color.RED ? Color.MAGENTA : Color.RED);
        });

        timerParpadeo.start();
    }
}