package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, lim, inc;

        num = 0;
        System.out.println("introduza um numero");
        lim = input.nextInt();
        System.out.println("introduza o valor do incremento desejado");
        inc = input.nextInt();

        while (num <= lim) {
            System.out.println(num);
            num=num+inc;
        }


    }
}
