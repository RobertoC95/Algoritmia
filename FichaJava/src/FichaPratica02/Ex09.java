package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Introduza o 1ºnumero");
        num1 = input.nextInt();

        System.out.println("Introduza o 2ºnumero");
        num2 = input.nextInt();

        System.out.println("Introduza o 3ºnumero");
        num3 = input.nextInt();

        if (num1 < num2 && num1 < num3)
            System.out.println("Numero menor: " + num1);
        else if (num2 < num1 && num2 < num3)
            System.out.println("Numero menor: " + num2);
        else
            System.out.println("Numero menor: " + num3);

    }
}
