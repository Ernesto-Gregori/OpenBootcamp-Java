package com.company;

import java.util.ArrayList;

public class Bucle {

    public static void numeros(){

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            int numero = i;

            if(numero % 2 != 0){
                int entero = numero;
                lista.add(entero);
            }

        }
        System.out.println("El ArrayList nuevo es: " + lista);
    }
}
