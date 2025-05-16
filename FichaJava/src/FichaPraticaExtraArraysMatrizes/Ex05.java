package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t;
        System.out.println("defina o tamanho do vetor :");
        t = input.nextInt();

        int[] vetor = new int[t];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o elemento na posição [" + i + "] :");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            boolean repetido = false;
            for (int j = 0 ; j < i; j++) {
                if (vetor[j] == vetor[i]) {
                    repetido=true;
                }
            }
            if(!repetido){
                System.out.println(vetor[i]);
            }
        }
    }
}

