package FichaPratica05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        double media,total = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            total+=vetor[i];
        }
        media=total/ vetor.length;
        System.out.println("A média do elementos do vetor é: " + media);
    }
}

