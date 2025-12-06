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
public class LoginFrame extends JFrame {

    public LoginFrame() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextField usuario = new JTextField();
        JPasswordField pass = new JPasswordField();
        BotonPersonalizado btn = new BotonPersonalizado("Entrar");

        btn.addActionListener(e -> {
            if (usuario.getText().equals("admin") && new String(pass.getPassword()).equals("1234")) {
                new MenuFrame().setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Usuario incorrecto");
            }
        });

        setLayout(new java.awt.GridLayout(3, 1));
        add(usuario);
        add(pass);
        add(btn);
    }
}