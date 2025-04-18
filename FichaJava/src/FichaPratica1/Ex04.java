package FichaPratica1;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int raio;
        double area;

        System.out.println("Introduzir raio");

        raio = input.nextInt();

        area = 3.14159 * raio * raio;

        /* forma alternativa
        area= 3.14159 * Math.pow( raio, 2); */

        System.out.println("área da circunferência:" + area);


    }
}
