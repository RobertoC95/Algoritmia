package FichaPratica06;

import java.util.Scanner;

public class Ex05 {
    public static int maior(int num) {

        Scanner input = new Scanner(System.in);
        int linhas, maior;

        System.out.println("introduza o numero de linhas do seu vetor");
        linhas = input.nextInt();

        int[] vetor = new int[linhas];
        for (int i = 0; i < vetor.length; i++) {


            System.out.print("Insira na matriz[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {

            if (maior < vetor[i]) {
                maior = vetor[i];
            }
        }

        return maior;
    }
    public static int menor(int num) {

        Scanner input = new Scanner(System.in);
        int linhas, menor;

        System.out.println("introduza o numero de linhas do seu vetor");
        linhas = input.nextInt();

        int[] vetor = new int[linhas];
        for (int i = 0; i < vetor.length; i++) {


            System.out.print("Insira na matriz[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        menor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {

            if (menor > vetor[i]) {
                menor = vetor[i];
            }
        }
        return menor;
    }
    public static boolean crescente(int num) {

        Scanner input = new Scanner(System.in);
        int linhas, maior;

        System.out.println("introduza o numero de linhas do seu vetor");
        linhas = input.nextInt();

        int[] vetor = new int[linhas];
        for (int i = 0; i < vetor.length; i++) {


            System.out.print("Insira na matriz[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        maior = vetor[0];
        for (int i = 0; i <= vetor.length; i++) {

            if (maior > vetor[i]) {
                return false;
            }
        }
        return true;
    }
}
