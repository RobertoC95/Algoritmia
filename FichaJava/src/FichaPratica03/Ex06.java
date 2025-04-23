package FichaPratica03;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numI, numF;

        System.out.println("Introduza o limite inferior do intervalo");
        numI = input.nextInt();

        System.out.println("Introduza o limite superior do intervalo");
        numF = input.nextInt();

        if (numI > numF) {
            while (numI <= numF) {
                System.out.println(numI);
                numI = numI + 1;
            }
        } else if (numF > numI) {
            while (numF <= numI) {
                System.out.println(numI);
                numI = numI + 1;
            }
        } else
            System.out.println(numI);
    }
}