package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t;
        System.out.println("defina p tamanho do vetor :");
        t = input.nextInt();

        int[] vetor = new int[t];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o elemento na posição [" + i + "] :");
            vetor[i] = input.nextInt();
        }

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] == vetor[i - 1]) {
                System.out.println("valor do dublicado " + vetor[i]);
            }
        }//nao esta completo
    }
}
