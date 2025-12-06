/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordepeliculas;

/**
 * Clase Series que representa una serie.
 * Hereda de Titulo y añade información sobre temporadas y episodios.
 * Permite calcular la duración total y mostrar atributos por consola.
 * 
 * @author david
 */
public class Series extends titulo {

    private int temporadas;
    private int[] capitulosPorTemporada;
    private int[] duracionEpisodios;

    /**
     * Constructor de Series.
     * 
     * @param nombre Nombre de la serie
     * @param id Identificador único
     * @param rutaImagen Ruta de la imagen de la serie
     * @param temporadas Número de temporadas
     * @param capitulosPorTemporada Array con capítulos por temporada
     * @param duracionEpisodios Array con duración de cada episodio
     */
    public Series(String nombre, int id, String rutaImagen,
                  int temporadas, int[] capitulosPorTemporada,
                  int[] duracionEpisodios) {
        super(nombre, id, rutaImagen);
        this.temporadas = temporadas;
        this.capitulosPorTemporada = capitulosPorTemporada;
        this.duracionEpisodios = duracionEpisodios;
    }

    /** @return Número de temporadas */
    public int getTemporadas() {
        return temporadas;
    }

    /** @return Duración total de todos los episodios en minutos */
    public int calcularDuracionTotal() {
        int total = 0;
        for (int dur : duracionEpisodios)
            total += dur;
        return total;
    }

    /** Muestra los atributos de la serie por consola */
    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Duración total: " + calcularDuracionTotal() + " min");
    }
}

