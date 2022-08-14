package com.company;

public class SmartWatch extends SmartDevice{

    String colorCorrea;
    double podometro;
    boolean resistenciaAgua;

    public SmartWatch(){

    }

    public SmartWatch(String fabricante, String modelo, String color, String sistemaOper, int year, String colorCorrea, double podometro, boolean resistenciaAgua) {
        super(fabricante, modelo, color, sistemaOper, year);
        this.colorCorrea = colorCorrea;
        this.podometro = podometro;
        this.resistenciaAgua = resistenciaAgua;
    }
}
