package com.openbootcamp;

public class GestorFacturas {
    Calculadora calculadora;
    String name;
    public GestorFacturas(Calculadora calculadora, String name) {
        this.calculadora = calculadora;
        this.name = name;
        System.out.println("Ejecutando constructor de GestorFacturas");
    }
}
