package FichaPratica03;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, soma, valI;
        double med;

        System.out.println("Introduza um numero");
        num1 = input.nextInt();
        valI = 1;
        soma = num1;

        while (num1 < 0) {
            System.out.println("Não comece com um valor negativo");
            System.out.println("Introduza um numero");
            num1 = input.nextInt();
            soma = num1;
        }

        while (num1 != -1) {
            soma = soma + num1;
            valI++;

            System.out.println("Introduza um numero");
            num1 = input.nextInt();
        }

        med = soma / valI;
        System.out.println("Média: " + med);

    }
}
