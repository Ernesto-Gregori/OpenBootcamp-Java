package com.company;

public class Main {

    public static void main(String[] args) {

        SmartDevice huaweiDevice = new SmartDevice();
        SmartDevice motoGStylus = new SmartDevice("Motorola", "G Stylus", "negro", "Android", 2021);

        SmartPhone samsungPhone = new SmartPhone();
        SmartPhone iphonePro = new SmartPhone("Apple", "Iphone", "Azul", "IOS", 2021, 3, false, true);
        System.out.println(iphonePro.cantCamaras);
        System.out.println(iphonePro.plegable);
        System.out.println(iphonePro.cargaRapida);

        SmartWatch appleWatch = new SmartWatch();
        SmartWatch miBand6 = new SmartWatch("Xiaomi", "miBand", "Negro", "MIUI", 2021, "Verde", 2.50, true);
        System.out.println(miBand6.colorCorrea);
        System.out.println(miBand6.podometro);
        System.out.println(miBand6.resistenciaAgua);

    }
}
