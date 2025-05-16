package FichaPratica06;

import java.util.Scanner;

public class Ex08 {

    /**
     * função para fazer o somatorio de duas matrizes
     *
     * @param matriz1
     * @param matriz2
     * @param matriz3
     */
    public static void somarMatrizes(int[][] matriz1, int[][] matriz2, int[][] matriz3) {

        Scanner input = new Scanner(System.in);
        int l, c;

        for (int i = 0; i < matriz1.length; i++) {

            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("Insira na matriz1[" + i + "][" + j + "]: ");
                matriz1[i][j] = input.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < matriz1.length; i++) {

            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("Insira na matriz2[" + i + "][" + j + "]: ");
                matriz2[i][j] = input.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < matriz1.length; i++) {

            for (int j = 0; j < matriz1.length; j++) {

                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(matriz3[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int somarElementosMatriz(int num) {

        Scanner input = new Scanner(System.in);
        int l, c;

        System.out.println("Introduza o numero de linhas do seu vetor");
        l = input.nextInt();
        System.out.println("Introduza o numero de colunas do seu vetor");
        c = input.nextInt();
        int[][]matriz1 = new int[l][c];
        int[][]matriz2 = new int[l][c];
        int[][]matriz3 = new int[l][c];
        num = 0;

        somarMatrizes(matriz1, matriz2, matriz3);

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[0].length; j++) {
                num += matriz3[i][j];
            }
        }

        return num;
    }

    public static void main(String[] args) {

        int l = 0, c = 0, num = 0;
        int[][] matriz1 = new int[l][c];
        int[][] matriz2 = new int[l][c];
        int[][] matriz3 = new int[l][c];
        somarMatrizes(matriz1, matriz2, matriz3);
        System.out.println("A soma dos dois vetores é: " + somarElementosMatriz(num));
    }
}