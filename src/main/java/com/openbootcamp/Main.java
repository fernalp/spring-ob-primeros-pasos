package com.openbootcamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Calculadora calculadora = (Calculadora) context.getBean("calculadora");

        String texto = calculadora.holaMundo();
        System.out.println(texto);

        Calculadora calculadora2 = (Calculadora) context.getBean("calculadora");
        System.out.println(calculadora2.holaMundo());

        //bean es la forma de recibir objetos de spring

        GestorFacturas gestorFacturas = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestorFacturas.calculadora.holaMundo());

        // los bean por defecto tiene por defecto el parámetro scope en singleton
        // se crea el objeto y se reutliza
    }
}
