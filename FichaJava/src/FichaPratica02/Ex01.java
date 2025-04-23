package FichaPratica02;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Introduz numero 1: ");

        numero1 = input.nextInt();

        System.out.println("Introduz numero 2: ");

        numero2 = input.nextInt();

        if (numero1 > numero2) {
            System.out.println("Maior: " + numero1);
        } else {

            if (numero1 < numero2) {
                System.out.println("maior: " + numero2);
            } else {
                System.out.println("os numeros sao iguais");
            }
        }

    }
}