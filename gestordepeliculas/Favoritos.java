/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordepeliculas;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Favoritos {
    private static final ArrayList<titulo> listaFavoritos = new ArrayList<>();

    /**
     * @param t título a guardar
     */
    public static void agregar(titulo t) {
        listaFavoritos.add(t);
    }

    public static void mostrar() {
        System.out.println("FAVORITOS:");
        listaFavoritos.forEach(t -> System.out.println("- " + t.getNombre()));
    }
}
