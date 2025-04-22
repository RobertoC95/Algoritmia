package FichaPratica02;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Introduza um Numero");

        num = input.nextInt();

        if (num % 2 == 0)
            System.out.println("Numero Par");
        else
            System.out.println("Numero Impar");


    }
}
