/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestordepeliculas;

/**
 *
 * @author david
 */
import java.util.Scanner;

/**
 * Clase principal que gestiona películas, series, actores y clientes.
 */
public class Gestordepeliculas {

    public static void main(String[] args) {
        iniciarPrograma();
    }

    /**
     * Método que inicia el programa y crea objetos de ejemplo.
     */
    public static void iniciarPrograma() {
    // Crear algunos actores
    Actor actor1 = new Actor("Robert", "Downey", 55, 1, "ruta/imagen/robert.jpg");
    Actor actor2 = new Actor("Chris", "Evans", 40, 2, "ruta/imagen/chris.jpg");

    // Crear algunos clientes
    Cliente cliente1 = new Cliente("Ana", "Pérez", 25, 1, "ruta/imagen/ana.jpg", TipoCliente.BASICO);
    Cliente cliente2 = new Cliente("Luis", "García", 30, 2, "ruta/imagen/luis.jpg", TipoCliente.PREMIUM);

    // Crear algunas películas
    Peliculas pelicula1 = new Peliculas("Iron Man", 1, "ruta/imagen/ironman.jpg", 126);
    Peliculas pelicula2 = new Peliculas("Avengers", 2, "ruta/imagen/avengers.jpg", 143);

    // Crear una serie
    int[] capitulos = {10, 8};
    int[] duraciones = {45, 50};
    Series serie1 = new Series("WandaVision", 1, "ruta/imagen/wandavision.jpg", 2, capitulos, duraciones);

    // Mostrar menú de información
    mostrarInformacion(actor1, actor2, cliente1, cliente2, pelicula1, pelicula2, serie1);
}


    /**
     * Método que pide al usuario qué información desea ver y la muestra.
     */
    public static void mostrarInformacion(Actor a1, Actor a2, Cliente c1, Cliente c2,
                                          Peliculas p1, Peliculas p2, Series s1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué desea ver? (1=Actores, 2=Clientes, 3=Películas, 4=Series)");
        int opcion = sc.nextInt();

        switch(opcion) {
            case 1:
                System.out.println(a1.getNombre() + " " + a1.getApellido());
                System.out.println(a2.getNombre() + " " + a2.getApellido());
                break;
            case 2:
                System.out.println(c1.getNombre() + " " + c1.getApellido() + " - " + c1.getTipoCliente());
                System.out.println(c2.getNombre() + " " + c2.getApellido() + " - " + c2.getTipoCliente());
                break;
            case 3:
                System.out.println(p1.getNombre() + " - " + p1.getDuracion() + " min");
                System.out.println(p2.getNombre() + " - " + p2.getDuracion() + " min");
                break;
            case 4:
                System.out.println(s1.getNombre() + " - " + s1.getTemporadas() + " temporadas");
                System.out.println("Duración total: " + s1.calcularDuracionTotal() + " min");
                break;
            default:
                System.out.println("Opción no válida");
        }
        sc.close();
    }
}
