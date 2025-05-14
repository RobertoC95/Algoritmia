package FichaPratica05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[5];
        int[] vetorS = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "]: " + vetor[i]);
        }
        for (int i = 0; i < vetorS.length; i++) {
            System.out.println("Insira no vetorS[" + i + "]: ");
            vetorS[i] = input.nextInt();
        }
        for (int j = 0; j < vetorS.length; j++) {
            System.out.println("vetorS[" + j + "]: " + vetorS[j]);
        }


        int[][] matriz = new int[5][2];

        for (int i = 0; i < matriz.length; i++) {

            matriz[i][0] = vetor[i];
            matriz[i][1] = vetorS[i];
            System.out.println(matriz[i][0] + " " +matriz[i][1] );

        }


    }
}

