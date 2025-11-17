/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.componentes;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Logger;

public class Componentes extends JFrame {

    private static final Logger logger = Logger.getLogger(Componentes.class.getName());

    public Componentes() {

        setTitle("Ventana Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setLayout(null);

        // Botón Para Abrir Animaión
        
        JButton abrirAnimacion = new JButton("Abrir Animación");
        abrirAnimacion.setBounds(20, 20, 180, 40);
        add(abrirAnimacion);

        abrirAnimacion.addActionListener(e -> {
            // Abrimos la ventana CuadradoInquieto
            CuadradoInquieto ventana = new CuadradoInquieto();
            ventana.setVisible(true);
        });

    }

    public static void main(String[] args) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> new Componentes().setVisible(true));
    }
}

