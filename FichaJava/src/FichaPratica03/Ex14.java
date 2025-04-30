package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, quant, quant2;

        System.out.println("Introduza um numero");
        num1 = input.nextInt();
        System.out.println("Introduza a quantida de valores a inserir");
        quant2 = input.nextInt();
        quant = 0;
        num2 = 0;

        while (quant < quant2) {
            quant++;
            if (num1 > num2) {
                num2 = num1;
                System.out.println("Introduza um numero");
                num1 = input.nextInt();
            }
        }
        if (num1 >num2){
            System.out.println("Crescente");
        }else {
            System.out.println("Não Crescente");
        }
    }
}

