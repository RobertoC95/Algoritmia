package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, esp1, esp2, esp3, esp4;


        System.out.println("Introduza um numero");
        num1 = input.nextInt();
        esp1 = 0;
        esp2 = 0;
        esp3 = 0;
        esp4 = 0;

        while (num1 >= 0) {
            if (num1 > -1 && num1 <= 25) {
                esp1 = esp1 + 1;
            } else if (num1 > 25 && num1 <= 50) {
                esp2 = esp2 + 1;
            }else if (num1 > 50 && num1 <= 75) {
                esp3 = esp3 + 1;
            }else if (num1 > 75 && num1 <= 100) {
                esp4 = esp4 + 1;
            }
            System.out.println("Introduza um numero");
            num1 = input.nextInt();
        }
        System.out.println("[00,25]: "+esp1);
        System.out.println("[26,50]: "+esp2);
        System.out.println("[51,75]: "+esp3);
        System.out.println("[76,100]: "+esp4);

    }
}
