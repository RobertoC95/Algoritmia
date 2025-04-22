package FichaPratica1;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class EX01 {

    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        //Declarar Variaveis
        int numero1, numero2, soma;

        //ler1
        System.out.println("Introduza o 1º numero");
        numero1= input.nextInt();

        //ler2
        System.out.println("Introduza o 2º numero");
        numero2= input.nextInt();

        //Soma
        soma= numero1 + numero2;
        System.out.println("soma: " + soma) ;
    }
}



