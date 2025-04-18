package FichaPratica1;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2, valor3;
        double media, mediaPonderada;

        System.out.println("Introduzir valor 1");

        valor1 = input.nextInt();

        System.out.println("Introduzir valor 2");

        valor2 = input.nextInt();

        System.out.println("Introduzir valor 3");

        valor3 = input.nextInt();

        System.out.println("Media:");

        media = (valor1 + valor2 + valor3) / 3;

        System.out.println("Media:" + media);

        mediaPonderada = ((valor1 * .2) + (valor2 * .3) + (valor3 * .5));

        System.out.println("Media Ponderada:" + mediaPonderada);


    }
}
