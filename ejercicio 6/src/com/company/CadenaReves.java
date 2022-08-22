package com.company;

import org.w3c.dom.ls.LSOutput;

public class CadenaReves {



    public static String reverse(String texto) {

        String textoAlReves = "";

        for(int i = texto.length()-1; i >= 0; i--){
            textoAlReves += texto.charAt(i);
        }

        return textoAlReves;
    }
}
