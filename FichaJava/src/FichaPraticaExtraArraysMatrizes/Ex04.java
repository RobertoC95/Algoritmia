package FichaPraticaExtraArraysMatrizes;

import java.util.Scanner;

public class Ex04 {
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
        int numP, numE = 0;


        System.out.println("Insira o numero que quer procurar: ");
        numP = input.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (numP == vetor[i]) {
                System.out.println("vetor ["+i+"]");
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            if (numP == vetor[i]) {
                numE++;
                System.out.println("vetor ["+i+"]");
            }
        }
        if (numE <= 0) {
            System.out.println(numP + " não existe no Vetor");
        }
    }
}
