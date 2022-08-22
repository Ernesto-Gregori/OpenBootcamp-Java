package com.company;

public class Array {

    public static void getArray(){

        String[] compras = new String[5];

        compras[0] = "Arroz";
        compras[1] = "Carne";
        compras[2] = "Aceite";
        compras[3] = "zanahoria";
        compras[4] = "Papa";

        for(String compra : compras) {
            System.out.println(compra);
        }

    }


}
