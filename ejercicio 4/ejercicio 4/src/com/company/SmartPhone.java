package com.company;

public class SmartPhone extends SmartDevice{


    int cantCamaras;
    boolean plegable;
    boolean cargaRapida;

    public SmartPhone(){

    }

    public SmartPhone(String fabricante, String modelo, String color, String sistemaOper, int year, int cantCamaras, boolean plegable, boolean cargaRapida) {
        super(fabricante, modelo, color, sistemaOper, year);
        this.cantCamaras = cantCamaras;
        this.plegable = plegable;
        this.cargaRapida = cargaRapida;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "cantCamaras=" + cantCamaras +
                ", plegable=" + plegable +
                ", cargaRapida=" + cargaRapida +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", sistemaOper='" + sistemaOper + '\'' +
                ", year=" + year +
                '}';
    }
}
