package com.company;

public class ArrayBi {

    public static void getCoordenadas() {

        int[][] coordenadas = new int[2][3];

        coordenadas[0][0] = 1;
        coordenadas[0][1] = 2;
        coordenadas[0][2] = 3;

        coordenadas[1][0] = 20;
        coordenadas[1][1] = 30;
        coordenadas[1][2] = 40;

        for(int i = 0; i < coordenadas.length; i++) {
            for(int j =0; j < coordenadas[i].length; j++) {
                System.out.println("Coordenadas: [" + i + "][" + j + "]  contiene el valor " + coordenadas[i][j]);
            }
        }
    }
}
