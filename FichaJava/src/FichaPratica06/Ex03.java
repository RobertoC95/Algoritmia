package FichaPratica06;

import java.util.Scanner;

public class Ex03 {


    /**
     * Função que determina se um numero é par
     * @param num Numero a analisar
     * @return true se par || false se impar
     */
    public static boolean par(int num) {

        boolean par;
        par = true;

        if (num % 2 != 0) {
            return false;
        }
        return true;
    }

    public static boolean positivo(int num) {

        boolean positivo = true;
        if (num < 0) {
            return false;
        }
        return true;
    }

    public static boolean primo(int num) {


        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean perfeito(int num) {

        int soma;
        soma = 0;
        boolean perfeito = true;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        if (soma != num) {
            return false;
        }
        return true;
    }

    public static boolean triangular(int num) {


        int soma;

        soma = 0;
        boolean triangular = true;

        for (int i = 0; soma < num; i++) {
                soma += i;
                if(soma==num) return true;
        }
            return false;
    }

    public static int trocarNumero(int num){
        Scanner input = new Scanner(System.in);
        System.out.println("introduza um novo Numero:");
        num= input.nextInt();
        return(num);
    }
}

