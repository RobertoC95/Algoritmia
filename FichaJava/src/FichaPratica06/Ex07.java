package FichaPratica06;

import java.util.Scanner;

public class Ex07 {


    public static void quadrado(int linhas, int colunas, String caracter) {

        int[][] matriz = new int[linhas][colunas];
        for (int i = 1; i <= matriz.length; i++) {

            for (int k = 1; k <= matriz[0].length; k++) {
                if (i == 1 || i == matriz.length) {
                    System.out.print(caracter);
                } else if (k == 1 || k == matriz[0].length) {
                    System.out.print(caracter);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int linhas, colunas;
        String caracter;

        Scanner input = new Scanner(System.in);

        System.out.println("Introduza o numero de linhas");
        linhas = input.nextInt();

        System.out.println("Introduza o numero de colunas");
        colunas = input.nextInt();

        System.out.println("Introduza o caracter");
        caracter = input.next();

        quadrado(linhas, colunas, caracter);

    }
}

