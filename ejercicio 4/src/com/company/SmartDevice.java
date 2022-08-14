package com.company;

public class SmartDevice {

    String fabricante;
    String modelo;
    String color;
    String sistemaOper;
    int year;

    public SmartDevice(){

    }

    public SmartDevice(String fabricante, String modelo, String color, String sistemaOper, int year) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.sistemaOper = sistemaOper;
        this.year = year;
    }
}
