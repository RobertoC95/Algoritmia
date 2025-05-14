package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[14];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o elemento na posição [" + i + "] :");
            vetor[i]= input.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento na posição [" + i + "] : " + vetor[i]);
        }
    }
}
