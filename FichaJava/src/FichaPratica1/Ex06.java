package FichaPratica1;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2, valor3;

        System.out.println("Valor1");

        valor1 = input.nextInt();

        System.out.println("Valor2");

        valor2 = input.nextInt();

        System.out.println("Valor 1 :" + valor1);

        System.out.println("Valor 2 :" + valor2);

        valor3 = valor1;

        valor1 = valor2;

        valor2 = valor3;

        System.out.println("Permuta");

        System.out.println("Valor 1 :" + valor1);

        System.out.println("Valor 2 :" + valor2);


    }
}
