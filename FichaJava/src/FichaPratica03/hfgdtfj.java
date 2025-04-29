package FichaPratica03;

import java.util.Scanner;

public class hfgdtfj {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, fac, total, soma, num2, num3;

        System.out.println("insira um numero");
        fac = input.nextInt();
        num = 1;
        num2 = 1;
        soma = 0;
        num3 = 0;
        total = 0;

        while (num2 < fac) {
            soma = soma + fac;
            ++num2;
            System.out.println("num2 " + num2);
            System.out.println("num " + num);
            System.out.println("soma " + soma);
            System.out.println("total " + total);
        }
        while (num3 < fac) {
            total = total + soma;
            fac++;
            System.out.println("num3 " + num3);
            System.out.println("total " + total);
        }

        System.out.println("total " + total);
    }
}

