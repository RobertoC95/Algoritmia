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

        while (num1 != -1) {
            soma = soma + num1;
            valI = valI + 1;
            System.out.println("Introduza um numero");
            num1 = input.nextInt();
        }

        med = soma / valI;
        System.out.println("Média: " + med);

    }
}
