package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t;
        System.out.println("defina p tamanho do vetor");
        t= input.nextInt();

        int[] vetor = new int[t];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o elemento na posição [" + i + "] :");
            vetor[i] = input.nextInt();
        }
        for (int i = vetor.length -1; i >= 0; i--) {
            System.out.println("Elemento na posição [" + (i) + "] : " + vetor[i]);
        }
    }
}
