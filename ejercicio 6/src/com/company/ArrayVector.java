package com.company;

import java.util.Vector;

public class ArrayVector {

    public static void datos(){

        Vector<Integer> numeros = new Vector<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.println("Contenido con los 5 datos: " + numeros);

        numeros.remove(1);
        numeros.remove(1);

        System.out.println("Contenido con solo 3 datos: " + numeros);

        System.out.println("Cual es el problema de utilizar un Vector con la capacidad por defecto?");
        System.out.println("Al utilizar la capacidad por defecto generamos una saturacion en la memoria, porque se esta generando una copia y creacion de nuevo vector");
    }


}
