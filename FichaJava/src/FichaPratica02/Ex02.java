package FichaPratica02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int sal;
        double taxa;

        System.out.println("Introduza o salario: ");
        sal= input.nextInt();

        if ( sal > 15000 )
            taxa = sal * .3;
        else
            taxa = sal * .2;

        if ( sal > 15000 )
            System.out.println("Paga taxa de 30%: " + taxa);
        else
            System.out.println("Paga taxa de 20%: " + taxa);

    }
}
