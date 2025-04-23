package FichaPratica02;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sal;
        double taxa;

        System.out.println("Introduza o Salario: ");
        sal = input.nextInt();

        if (sal < 15.000) {
            taxa = sal * .2;
            System.out.println("Montante de imposto a pagar 20%: " + taxa);
        }else if (sal < 20.000) {
            taxa = sal * .3;
            System.out.println("Montante de imposto a pagar 30%: " + taxa);
        }else if (sal < 25.000) {
            taxa = sal * .35;
            System.out.println("Montante de imposto a pagar 35%: " + taxa);
        }else{
            taxa = sal * .40;
            System.out.println("Montante de imposto a pagar 40%: " + taxa);
        }

        System.out.println("Montante de imposto a pagar: " + taxa);


    }
}
