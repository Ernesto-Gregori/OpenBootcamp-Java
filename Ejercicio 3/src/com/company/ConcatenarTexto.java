package com.company;

public class ConcatenarTexto {

    public static void main(String[] args) {

        String[] nombres = {"Jose", "Ernesto", "Mario", "Auron"};

        concatTexto(nombres);
    }

    static void concatTexto(String[] nombres) {

        String cadena = " ";

        for (String nombre : nombres) {
            //System.out.println(nombre);

            cadena = nombre + " " + cadena;

        }

        System.out.println(cadena);
    }
}
