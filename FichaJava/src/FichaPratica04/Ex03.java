package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, tot;

        System.out.println("\nIntroduza um numero sem dexar o teu amigo espreitar");
        num1 = input.nextInt();
        while (num1<0 || num1>100){
            System.out.println("um numero de 0 a 100 por favor");
            num1 = input.nextInt();
        }
        for(int i =0; i<20; i++){
            System.out.println();
        }

        System.out.println("Tenta adivinhar o numero escolhido");
        num2 = input.nextInt();
        tot = 1;

        while (num1 != num2) {
            if (num1>num2){
                System.out.println("Tenta num numero mais alto");
                tot = tot + 1;
                num2 = input.nextInt();
            }else{
                System.out.println("Tenta num numero mais baixo");
                tot = tot + 1;
                num2 = input.nextInt();
            }
        }
        System.out.println("Precisas-te de " + tot+" tentativas.");
    }
}
