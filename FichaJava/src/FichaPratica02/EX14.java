package FichaPratica02;

import java.util.Scanner;

public class EX14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("Introduza um numero");
        num1 = input.nextDouble();

        System.out.println("Outro");
        num2 = input.nextDouble();

        System.out.println("E mais um só pra ver");
        num3 = input.nextDouble();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Ordem crescente : " + num1 + ">" + num2 + ">" + num3);
        }
        else if (num1 < num3 && num3 < num2) {
            System.out.println("Ordem crescente : " + num1 + ">" + num3 + ">" + num2);
        }
        else if (num2 < num1 && num1 < num3) {
            System.out.println("Ordem crescente : " + num2 + ">" + num1 + ">" + num3);
        }
        else if (num2 < num3 && num3 < num1) {
            System.out.println("Ordem crescente : " + num2 + ">" + num3 + ">" + num1);
        }
        else if (num3 < num1 && num1 < num2) {
            System.out.println("Ordem crescente : " + num3 + ">" + num1 + ">" + num2);
        }
        else if (num3 < num2 && num2 < num1) {
            System.out.println("Ordem crescente : " + num3 + ">" + num2 + ">" + num1);
        } else {
            System.out.println("No repeting number PLS");

        }
    }
}
