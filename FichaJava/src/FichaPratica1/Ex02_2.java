package FichaPratica1;

import java.util.Scanner;

public class Ex02_2 {


    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //Declarar Variaveis
        int numero1, numero2, resultado;

        //ler1
        System.out.println("Introduza o 1º numero");
        numero1 = input.nextInt();

        //ler2
        System.out.println("Introduza o 2º numero");
        numero2 = input.nextInt();

        //Soma
        resultado = numero1 + numero2;
        System.out.println("soma: " + resultado);

        //Subtração
        resultado = numero1 - numero2;
        System.out.println("subtração: " + resultado);

        //Multiplicação
        resultado = numero1 * numero2;
        System.out.println("multiplicação: " + resultado);

        //Divisão
        resultado = numero1 / numero2;
        System.out.println("divisão: " + resultado);
    }
}
