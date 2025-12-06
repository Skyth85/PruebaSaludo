/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordepeliculas;

/**
 * Clase abstracta Titulo que representa un título genérico (película o serie).
 * Contiene nombre, id y ruta de imagen.
 * Permite mostrar sus atributos por consola.
 * 
 * @author david
 */
public abstract class titulo implements Identificable {

    private String nombre;
    private int id;
    private String rutaImagen;

    /**
     * Constructor de Titulo.
     * 
     * @param nombre Nombre del título
     * @param id Identificador único
     * @param rutaImagen Ruta de la imagen del título
     */
    public titulo(String nombre, int id, String rutaImagen) {
        this.nombre = nombre;
        this.id = id;
        this.rutaImagen = rutaImagen;
    }

    /** @return Nombre del título */
    public String getNombre() {
        return nombre;
    }

    /** @return Ruta de la imagen */
    public String getRutaImagen() {
        return rutaImagen;
    }

    /** @return ID del título */
    @Override
    public int getId() {
        return id;
    }

    /** Muestra los atributos del título por consola */
    public void mostrarAtributos() {
        System.out.println("Título: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Imagen: " + rutaImagen);
    }
}

