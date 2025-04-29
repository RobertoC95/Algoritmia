package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, numO;

        System.out.println("Introduza um numero");
        num1 = input.nextInt();
        numO = 2;

        if (num1 <= 2)
            System.out.println("Introduza um numero valido");
        else {
            System.out.println("Numeros pares no intervalo:");
            while (numO <= num1) {

                if (numO % 2 != 0) {
                    numO = numO + 1;
                } else {
                    System.out.println(numO);
                    numO = numO + 1;
                }
            }
        }
    }
}