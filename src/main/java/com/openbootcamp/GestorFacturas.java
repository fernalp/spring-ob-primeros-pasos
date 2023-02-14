package com.openbootcamp;

import org.springframework.stereotype.Component;

@Component
public class GestorFacturas {
    Calculadora calculadora;

    public GestorFacturas(Calculadora calculadora) {
        this.calculadora = calculadora;
        System.out.println("Ejecutando constructor de GestorFacturas");
    }
}
