package FichaPratica03;

import java.util.Scanner;

public class Ex14_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, num2 = 0, quant, quant2 = 1;
        boolean crescente = true;

        System.out.println("quantos numeros quer inserir");
        quant = input.nextInt();
        System.out.println("introduza um numero");
        num = input.nextInt();

        while (quant2 < quant) {

            System.out.println("insira um numero: ");
            num2 = input.nextInt();

            if (num < num2) {
                crescente = false;
            }
            num2 = num;
            quant2++;
        }
        if (crescente) { //crescente==true
            System.out.println("Crescente");
        } else
            System.out.println("Não Crescente");
    }
}
