package FichaPratica05;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int maior = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[maior] < vetor[i]) {
                maior = i;
            }
        }
        System.out.println("o vetor com o maior elemento é : " + vetor[maior] + " e está no vetor [" + maior + "]");
    }
}
