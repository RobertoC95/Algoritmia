package FichaPratica02;

import java.util.Scanner;

public class Ex16_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mt;

        System.out.println("Introduza o valor em euros");
        mt = input.nextInt();

        System.out.println("Notas de 200: " + (mt / 200));
        mt = mt % 200;

        System.out.println("Notas de 200: " + (mt / 100));
        mt = mt % 100;

        System.out.println("Notas de 200: " + (mt / 50));
        mt = mt % 50;

        System.out.println("Notas de 200: " + (mt / 20));
        mt = mt % 20;

        System.out.println("Notas de 200: " + (mt / 10));
        mt = mt % 10;

        System.out.println("Notas de 200: " + (mt / 5));
        mt = mt % 5;

        System.out.println("troco: " + mt + "€");

    }

}

