package FichaPratica03;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduza o limite inferior do intervalo");
        num1 = input.nextInt();

        System.out.println("Introduza o limite superior do intervalo");
        num2 = input.nextInt();

        if (num1 < num2) {

            while (num1 % 5 != 0) {
                num1 = num1 + 1;
            }
            while (num1 % 5 <= 0 && num1 < num2) {

                System.out.println(num1);
                num1 = num1 + 5;
            }
            System.out.println(num2);
        } else if (num2 < num1) {

            while (num2 % 5 != 0) {
                num2 = num2 + 1;
            }
            while (num2 % 5 <= 0 && num2 < num1) {

                System.out.println(num2);
                num2 = num2 + 5;
            }
            System.out.println(num1);
        }
    }
}
