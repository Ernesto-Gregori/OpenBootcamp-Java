package com.company;

import java.util.Scanner;

public class Excepciones {

    public static void dividePorCero() throws ArithmeticException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce dos números: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        try {
            int resultado = numeroA / numeroB;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}
