package FichaPratica05;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int maior = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                if (vetor[maior] < vetor[i]) {
                    maior = i;
                }
            }
        }
        if (maior > 0) {
            System.out.println("o elemento par maior é: " + vetor[maior]);
        }else
            System.out.println("Não existem elementos par");
    }
}
