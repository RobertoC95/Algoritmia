package FichaPratica01;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //Declarar Variaveis
        int numero1, numero2, soma, subt, mult, div;

        //ler1
        System.out.println("Introduza o 1º numero");
        numero1 = input.nextInt();

        //ler2
        System.out.println("Introduza o 2º numero");
        numero2 = input.nextInt();

        //Soma
        soma = numero1 + numero2;
        System.out.println("soma: " + soma);

        //Subtração
        subt = numero1 - numero2;
        System.out.println("subtração: " + subt);

        //Multiplicação
        mult = numero1 * numero2;
        System.out.println("multiplicação: " + mult);

        //Divisão
        div = numero1 / numero2;
        System.out.println("divisão: " + div);

    }
}
