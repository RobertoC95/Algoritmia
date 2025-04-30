package FichaPratica03;

import java.util.Scanner;

public class Ex14_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, num2 = 0, quant, quant2 = 1, x = 0;

        System.out.println("quantos numeros quer inserir");
        quant = input.nextInt();
        System.out.println("introduza um numero");
        num = input.nextInt();

        while (quant2 < quant) {
            if (num2 < num) {
                quant2++;
                num2 = num;
                System.out.println("introduza um numero");
                num = input.nextInt();
                x++;
            } else {
                quant2++;
                num2 = num;
                System.out.println("introduza um numero");
                num = input.nextInt();
                x--;
            }
        }
        if (x>=quant2){
            System.out.println("Crescente");
        } else
            System.out.println("Não Crescente");

    }
}