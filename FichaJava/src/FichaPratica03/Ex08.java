package FichaPratica03;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduza um numero: ");
        num1 = input.nextInt();
        num2 = num1 - 5;

        while (num2 < num1) {
            System.out.println(num2);
            num2 = num2 + 1;
        }
        num2 = num2 + 1;

        while (num2 <= (num1 + 5)) {
            System.out.println(num2);
            num2 = num2 + 1;
        }

    }
}
