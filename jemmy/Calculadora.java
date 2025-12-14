/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasjunit;


public class Calculadora {

    public Calculadora() {
    }

    public double sumar(int a, int b) {
        return a + b;
    }

    public double restar(int a, int b) {
        return a - b;
    }

    public double multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return (double) a / b;
    }

    public double operacionCombinada(int a, int b, int c, int d) {
        // Ejemplo: (a + b) * (c - d)
        return (a + b) * (c - d);
    }
}


