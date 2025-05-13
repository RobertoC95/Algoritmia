package FichaPratica05;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int menor = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[menor] > vetor[i]) {
                menor = i;
            }
        }
        System.out.println("o vetor com o menor elemento é : " + vetor[menor] + " e está no vetor " + menor);
    }
}
