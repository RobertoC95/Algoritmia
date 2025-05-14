package FichaPratica05;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int somaD = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Insira na matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            somaD += matriz[i][i];
        }
        System.out.println("Soma dos elementos da diagonal principal da matriz é: " + somaD);
    }
}

