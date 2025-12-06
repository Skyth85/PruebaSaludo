/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordepeliculas;

import javax.swing.JButton;
import java.awt.Color;
/**
 *
 * @author david
 */


public class BotonPersonalizado extends JButton {

    public BotonPersonalizado(String texto) {
        super(texto);
        setBackground(new Color(30, 30, 30));
        setForeground(Color.WHITE);
    }
}