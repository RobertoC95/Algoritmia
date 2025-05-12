package FichaPratica04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, divisores;

        System.out.println("introduza um numero");

        n = input.nextInt();
        divisores = 0;


        for (int t = 1; t <= n; t++) {
            if (n % t == 0) {
                divisores ++;
            }
        }
        if (divisores > 2) {
            System.out.println("O numero " + n + " não é primo");
        } else
            System.out.println("O numero " + n + " é primo");
    }
}
