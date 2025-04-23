package FichaPratica02;

import java.util.Scanner;

public class Ex10_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;
        String op;

        System.out.println("Introduza o 1º numero: ");
        num1 = input.nextInt();

        System.out.println("Introduza o 2º numero: ");
        num2 = input.nextInt();

        System.out.println("Qual a operação aritmetica a resolver?" );
        System.out.println("+ para soma");
        System.out.println("- para subtração");
        System.out.println("/ para divisão");
        System.out.println("* para multiplicação");

        op = input.next();

        switch (op) {
            case "+":
                System.out.println("Soma: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Subtração: " + (num1 - num2));
                break;
            case "/":
                System.out.println("Divisão: " + (num1 / num2));
                break;
            case "*":
                System.out.println("Multiplicação: " + (num1 * num2));
                break;
            default:
                System.out.println("Danger Danger Tilt");
        }
    }
}


