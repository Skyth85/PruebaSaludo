/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordepeliculas;

/**
 * Interfaz para clases que tienen un identificador único.
 * Todas las clases que implementen esta interfaz deben proporcionar un ID.
 * Contiene un método por defecto para mostrar el ID por consola.
 * 
 * @author david
 */
public interface Identificable {

    /**
     * Método que deben implementar las clases hijas para devolver el ID.
     * 
     * @return ID del objeto
     */
    int getId();

    /**
     * Método por defecto que muestra el ID por pantalla.
     */
    default void mostrarId() {
        System.out.println("ID = " + getId());
    }
}

