package FichaPratica02;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sal;
        double taxa;

        System.out.println("Introduza o Salario: ");
        sal = input.nextInt();

        if (sal < 15000)
            taxa = sal * .2;
        else if (sal < 20000)
            taxa = sal * .3;
        else if (sal < 25000)
            taxa = sal * .35;
        else
            taxa = sal * .40;


        System.out.println("Montante de imposto a pagar: " + taxa);


    }
}
