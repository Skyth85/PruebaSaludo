/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordepeliculas;

/**
 * Clase Cliente que representa a un cliente del sistema.
 * Hereda de Persona y añade un tipo de cliente.
 * 
 * Tipos de cliente: ANUNCIOS, BASICO, PREMIUM
 * 
 * @author david
 */
public class Cliente extends Persona {

    private TipoCliente tipo;

    /**
     * Constructor de Cliente.
     * 
     * @param nombre Nombre del cliente
     * @param apellido Apellido del cliente
     * @param edad Edad del cliente
     * @param id Identificador único
     * @param rutaImagen Ruta de la imagen del cliente
     * @param tipo Tipo de cliente
     */
    public Cliente(String nombre, String apellido, int edad, int id, String rutaImagen, TipoCliente tipo) {
        super(nombre, apellido, edad, id, rutaImagen);
        this.tipo = tipo;
    }

    /** @return Tipo de cliente */
    public TipoCliente getTipoCliente() {
        return tipo;
    }

    /** Muestra los atributos del cliente por consola */
    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Tipo cliente: " + tipo);
    }
}
