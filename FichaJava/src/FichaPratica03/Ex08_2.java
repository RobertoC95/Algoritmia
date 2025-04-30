package FichaPratica03;

import java.util.Scanner;

public class Ex08_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, antecessor, sucessor;

        System.out.println("Introduza um numero: ");
        num = input.nextInt();

        antecessor = num - 5;
        sucessor = num + 5;

        while (antecessor <= sucessor) {
            if (antecessor != num) {
                System.out.println(antecessor);
            }
            antecessor++;
        }
    }
}
