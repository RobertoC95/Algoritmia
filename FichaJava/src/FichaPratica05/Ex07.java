package FichaPratica05;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        int maior = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {

                if (maior % 2 != 0) {
                    maior = vetor[i];
                }
                if (vetor[i] > maior) {
                    maior = vetor[i];
                }
            }
        }
        if (maior % 2 == 0) {
            System.out.println("o elemento par maior é: " + maior);
        } else
            System.out.println("Não existem elementos par");
    }
}
