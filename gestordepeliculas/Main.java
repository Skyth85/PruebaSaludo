/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordepeliculas;

import com.mycompany.gestordepeliculas.LoginFrame;

/**
 *
 * @author david
 */
public class Main {

    /**
     * @param args argumentos
     */
    public static void main(String[] args) {
        iniciarPrograma();
    }

    
    public static void iniciarPrograma() {
        new LoginFrame().setVisible(true);
    }
}
