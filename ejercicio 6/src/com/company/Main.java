package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Funcion que devuelve una cadena al revés.
        //String invertirLetra = CadenaReves.reverse("Hola mundo");
        //System.out.println(invertirLetra);

        //Array unidimensional
        //Array.getArray();

        //Array bidimensional
        //ArrayBi.getCoordenadas();

        //Vector y respuesta a la pregunta
        //ArrayVector.datos();

        //ArrayList y LinkedList
        //ListLinked.Mudanza();

        //Funcion de bucle con numeros que imprima un ArrayList con numeros impares
        //Bucle.numeros();

        //Manejo de excepciones
        //try{
            //Excepciones.dividePorCero() ;
        //} catch (ArithmeticException e) {
            //System.out.println("Esto no puede hacerse");
        //} finally {
            //System.out.println("Demo de codigo");
        //}

        //InputStream y PrintStream
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el fichero de origen: ");
        String fileIn = scanner.nextLine();
        System.out.println("Introduce el fichero de destino: ");
        String fileOut = scanner.nextLine();
        EntradaSalida.copiaFichero(fileIn, fileOut);
    }


}
