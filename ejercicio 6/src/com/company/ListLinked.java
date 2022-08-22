package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListLinked {

    public static void Mudanza(){

        ArrayList<String> objetos = new ArrayList<>();

        objetos.add("televisor");
        objetos.add("sillon");
        objetos.add("comedor");
        objetos.add("plantas");

        System.out.println("ArrayList de objetos para mudar: " + objetos);

        LinkedList<String> nuevaLista = new LinkedList<>(objetos);

        System.out.println("LinkedList de objetos para mudar: " + nuevaLista);

    }
}
