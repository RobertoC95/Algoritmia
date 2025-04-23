package FichaPratica02;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int salM;

        System.out.println("Introduza o salário médio");
        salM = input.nextInt();

        if (salM < 0)
            System.out.println("You are in debt");
        else if (salM > 0 && salM <= 2000) {
            System.out.println("Saldo médio: " + salM + " Crédito não aprovado");
        } else if (salM > 2000 && salM <= 4000) {
            System.out.println("Saldo médio: " + salM + " Crédito 20%: " + salM * .2);
        } else if (salM > 4000 && salM <= 6000) {
            System.out.println("Saldo médio: " + salM + " Crédito 30%: " + salM * .3);
        } else
            System.out.println("Saldo médio: " + salM + " Crédito 40%: " + salM * .4);

    }

}

