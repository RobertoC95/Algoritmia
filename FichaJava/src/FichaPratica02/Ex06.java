package FichaPratica02;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduza o 1º numero");
        num1 = input.nextInt();

        System.out.println("Introduza o 2º numero");
        num2 = input.nextInt();

        if (num1>num2)
            System.out.println(num1 + "   "+num2);
        else
            System.out.println(num2 + "    "+num1);
    }
}
