package FichaPratica03;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, fac;

        System.out.println("insira um numero");
        num = input.nextInt();
        fac = num;

        while (num > 1) {
            fac = fac * (num - 1);
            num = num - 1;
        }
        System.out.println("factorial: " + fac);
    }
}
