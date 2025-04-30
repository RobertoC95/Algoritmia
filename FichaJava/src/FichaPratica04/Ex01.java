package FichaPratica04;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int v1, v2, x = 0;
        String op, cont;

        do {
            System.out.println("Introduza um numero");
            v1 = input.nextInt();

            System.out.println("Introduza um numero");
            v2 = input.nextInt();

            System.out.println("Escolha a operação");
            op = input.next();
            switch (op) {
                case "+":
                    System.out.println("Soma: " + (v1 + v2));
                    break;
                case "-":
                    System.out.println("Subtração: " + (v1 - v2));
                    break;
                case "/":
                    System.out.println("Divisão: " + (v1 / v2));
                    break;
                case "*":
                    System.out.println("Multiplicação: " + (v1 * v2));
                    break;
                default:
                    System.out.println("Operação inválida");
            }
            System.out.println("Deseja Continuar? s/n");
            cont = input.next();
            switch (cont) {
                case "s":
                    System.out.println("Opção selecionada: Sim");
                    break;
                case "n":
                    x++;
                    System.out.println("Opção selecionada: Não");
                    break;
            }
        } while (x != 1);
    }
}