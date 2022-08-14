package com.company;

public class Main {

    public static void main(String[] args) {

        SmartDevice huaweiDevice = new SmartDevice();
        SmartDevice motoGStylus = new SmartDevice("Motorola", "G Stylus", "negro", "Android", 2021);
        System.out.println(motoGStylus);

        SmartPhone samsungPhone = new SmartPhone();
        SmartPhone iphonePro = new SmartPhone("Apple", "Iphone", "Azul", "IOS", 2021, 3, false, true);
        System.out.println("El Iphone Pro tiene las siguientes caracteristicas: " + iphonePro);

        SmartWatch appleWatch = new SmartWatch();
        SmartWatch miBand6 = new SmartWatch("Xiaomi", "miBand", "Negro", "MIUI", 2021, "Verde", 2.50, true);
        System.out.println("La miBand 6 tiene las siguientes caracteristicas: " + miBand6);

    }
}
