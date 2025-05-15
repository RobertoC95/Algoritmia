package FichaPratica06;

import java.util.Scanner;

public class Ex02 {

    public static void imprimirAsteriscos(int num1) {

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("insira um numero positivo:");
            num1 = input.nextInt();
        } while (num1 <= 0);

        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

    public static void main(String[] args) {

      int num1;
        num1=0;
       imprimirAsteriscos(num1);
    }
}


