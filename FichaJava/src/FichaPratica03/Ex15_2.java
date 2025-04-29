package FichaPratica03;

import java.util.Scanner;

public class Ex15_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, fac, total, num2, num3;

        System.out.println("insira um numero");
        num = input.nextInt();
        total = 0;
        fac = 1;
        num2 = num;
        num3 = 1;

        while (fac < num) {
            if (num3 < num) {
                total = total + num2;
                num3 = num3 + 1;
                System.out.println("total " + total);

            } else {
                num2 = num2 - 1;
                fac = ++fac;
                System.out.println("fac " + fac);
                num3 = num2;
            }
        }
        System.out.println("factorial: " + total);
    }
}

