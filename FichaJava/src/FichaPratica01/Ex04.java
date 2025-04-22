package FichaPratica01;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio, area;

        System.out.println("Introduzir raio");

        raio = input.nextDouble();

        area = 3.14159 * raio * raio;

        /* forma alternativa
        area= 3.14159 * Math.pow( raio, 2); */

        System.out.println("área da circunferência:" + area);


    }
}
