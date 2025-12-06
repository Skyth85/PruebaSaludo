/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordepeliculas;

/**
 * Clase Actor que representa a un actor en el sistema.
 * Hereda de Persona y permite mostrar sus atributos.
 * 
 * @author david
 */
public class Actor extends Persona {

    /**
     * Constructor de Actor.
     *
     * @param nombre Nombre del actor
     * @param apellido Apellido del actor
     * @param edad Edad del actor
     * @param id Identificador único
     * @param rutaImagen Ruta de la imagen del actor
     */
    public Actor(String nombre, String apellido, int edad, int id, String rutaImagen) {
        super(nombre, apellido, edad, id, rutaImagen);
    }

    /** Muestra los atributos del actor por consola */
    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
    }
}

