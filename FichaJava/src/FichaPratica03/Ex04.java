package FichaPratica03;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, imp;

        num = 0;

        System.out.println("Introduza um numero");
        imp = input.nextInt();

        while (num <= imp) {
            System.out.println(num);
            num = num + 1;
        }

    }
}
