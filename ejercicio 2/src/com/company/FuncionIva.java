package com.company;

public class FuncionIva {

    public static void main(String[] args) {

        double total = precioIva(100);
        System.out.println(total);
    }

    static double precioIva(double precio) {
        return precio * 1.13; //IVA del 13% en El Salvador
    }
}
