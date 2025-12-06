/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordepeliculas;

/**
 * Clase Persona que representa a una persona en el sistema.
 * Contiene nombre, apellido, edad, id y ruta de imagen.
 * Permite mostrar sus atributos por consola.
 * 
 * @author david
 */
public class Persona implements Identificable {

    private String nombre;
    private String apellido;
    private int edad;
    private int id;
    private String rutaImagen;

    /**
     * Constructor de Persona.
     * 
     * @param nombre Nombre de la persona
     * @param apellido Apellido de la persona
     * @param edad Edad de la persona
     * @param id Identificador único
     * @param rutaImagen Ruta de la imagen asociada
     */
    public Persona(String nombre, String apellido, int edad, int id, String rutaImagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
        this.rutaImagen = rutaImagen;
    }

    /** @return Nombre de la persona */
    public String getNombre() {
        return nombre;
    }

    /** @return Apellido de la persona */
    public String getApellido() {
        return apellido;
    }

    /** @return Edad de la persona */
    public int getEdad() {
        return edad;
    }

    /** @return ID de la persona */
    @Override
    public int getId() {
        return id;
    }

    /** @return Ruta de la imagen */
    public String getRutaImagen() {
        return rutaImagen;
    }

    /**
     * Muestra los atributos de la persona por consola.
     */
    public void mostrarAtributos() {
        System.out.println("Persona: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("ID: " + id);
        System.out.println("Imagen: " + rutaImagen);
    }
}

