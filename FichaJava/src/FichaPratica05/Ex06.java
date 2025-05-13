package FichaPratica05;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int ele = 0;
        boolean maior = true;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[ele] > vetor[i]) {
                maior = false;
            }else {
                ele++;
            }
        }
        if (maior) {
            System.out.println("Elementos por ordem crescente");
        } else
            System.out.println("Os elementos não estão por ordem crescente");
    }
}
