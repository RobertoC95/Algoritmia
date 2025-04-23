package FichaPratica02;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mt, nt200, nt100, nt50, nt20, nt10, nt5;

        System.out.println("Introduza o valor em euros");
        mt = input.nextInt();

        nt200 = mt / 200;
        System.out.println("Notas de 200: " + nt200);
        mt = mt % 200;

        nt100 = mt / 100;
        System.out.println("notas de 100: " + nt100);
        mt = mt % 100;

        nt50 = mt / 50;
        System.out.println("notas de 50: " + nt50);
        mt = mt % 50;

        nt20 = mt / 20;
        System.out.println("notas de 20: " + nt20);
        mt = mt % 20;

        nt10 = mt / 10;
        System.out.println("notas de 10: " + nt10);
        mt = mt % 10;

        nt5 = mt / 5;
        System.out.println("notas de 5: " + nt5);
        mt = mt % 5;

        System.out.println("troco: " + mt + "€");





        /*if (mt >= 200) {
            nt200 = mt / 200;
            System.out.println("Notas de 200: " + nt200);
        }
        if (mt >= 100 && mt < 200) {
            nt100 = (mt % 200) / 100;
            System.out.println("Notas de 100: " + nt100);
        }
        if (mt >= 100 && mt < 200) {
            nt50 = (nt100 % 100) / 50;
            System.out.println("Notas de 50: " + nt50);
        }
        if (mt >= 100 && mt < 200) {
            nt100 = (mt % 200) / 100;
            System.out.println("Notas de 200: " + nt100);
        }
        if (mt >= 100 && mt < 200) {
            nt100 = (mt % 200) / 100;
            System.out.println("Notas de 200: " + nt100);
        }
        if (mt >= 100 && mt < 200) {
            nt100 = (mt % 200) / 100;
            System.out.println("Notas de 200: " + nt100);
        }
        if (mt >= 100 && mt < 200) {
            nt100 = (mt % 200) / 100;
            System.out.println("Notas de 200: " + nt100);
        }*/


    }
}
