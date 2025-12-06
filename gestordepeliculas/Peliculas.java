/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordepeliculas;

/**
 * Clase Pelicula que representa una película.
 * Hereda de Titulo y añade duración en minutos.
 * Permite mostrar sus atributos por consola.
 * 
 * @author david
 */
public class Peliculas extends titulo {

    private int duracion;

    /**
     * Constructor de Pelicula.
     * 
     * @param nombre Nombre de la película
     * @param id Identificador único
     * @param rutaImagen Ruta de la imagen de la película
     * @param duracion Duración en minutos
     */
    public Peliculas(String nombre, int id, String rutaImagen, int duracion) {
        super(nombre, id, rutaImagen);
        this.duracion = duracion;
    }

    /** @return Duración de la película en minutos */
    public int getDuracion() {
        return duracion;
    }

    /** Muestra los atributos de la película por consola */
    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Duración: " + duracion + " min");
    }
}
