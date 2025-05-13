package FichaPratica05;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        int num, tot = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Insira na matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println("Introduza um numero:");
        num = input.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == num) {
                    tot++;
                }
            }
        }
        System.out.println("Este numero aparece " + tot + " vezes");
    }
}