package FichaPratica03;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        String msg;

        num1 = 1;

        System.out.println("Introduza um numero");
        num2 = input.nextInt();

        input.nextLine();

        msg = input.nextLine();

        while (num1 <= num2) {
            System.out.println(msg);
            num1 = num1 + 1;
        }
    }
}
