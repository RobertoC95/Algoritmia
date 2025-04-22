package FichaPratica02;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sld, mov, sldA;

        System.out.println("Introduza o Saldo da conta: ");
        sld = input.nextInt();

        System.out.println("Introduza o valor a movimentar ");
        mov = input.nextInt();

        sldA = sld + mov;

        if (sldA >= 0) {
            System.out.println("-Saldo Inicial: " + sld + "€");
            System.out.println("-Valor a Movimentar: " + mov + "€");
            System.out.println("-Saldo Atual: "+sldA+"€");
        }
        else {
            System.out.println("-Saldo Inicial: " + sld + "€");
            System.out.println("-Valor a Movimentar: " + mov + "€");
            System.out.println("-Operação Inválida. Saldo Insuficiente. ");
            System.out.println("-Saldo Atual: "+sld+"€");
        }


    }
}
