package FichaPratica05;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[12];
        int tot = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
            tot += vetor[i];
        }
        System.out.println("Total: " + tot);
    }
}
