package FichaPratica03;

import java.util.Scanner;

public class Ex15_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int fac, total, soma, num2, num3;

        System.out.println("insira um numero");
        fac = input.nextInt();
        num2 = 1;
        soma = 0;
        num3 = 1;
        total = 0;

        while (num2 < fac) {
            soma += fac;
            num2++;
        }
        fac = fac - 2;
        total = total + soma;
        while (fac > 1) {
            if (num3 < fac) {
                num3++;
                total = total + soma;

            } else {
                fac--;
                num3 = 1;
                soma = total;
            }
        }
        System.out.println("total " + total);
    }
}

