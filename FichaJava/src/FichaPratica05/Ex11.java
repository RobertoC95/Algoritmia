package FichaPratica05;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maior1 = 0, maior2 = 0, menor1 = 0, menor2 = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Insira na matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[maior1][maior2] < matriz[i][j]) {
                    maior1 = i;
                    maior2 = j;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[menor1][menor2] > matriz[i][j]) {
                    menor1 = i;
                    menor2 = j;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print( matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("O elmento maior da matriz é " + matriz[maior1][maior2] + " e está na linha [" + maior1 + "] e na coluna [" + maior2 + "]");
        System.out.println("O elmento menoror da matriz é " + matriz[menor1][menor2] + " e está na linha [" + menor1 + "] e na coluna [" + menor2 + "]");
    }
}
