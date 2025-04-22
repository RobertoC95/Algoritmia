package FichaPratica01;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double p1, p2, p3, pT;

        System.out.println("Preço Produto 1");

        p1 = input.nextDouble();

        System.out.println("Preço Produto 2");

        p2 = input.nextDouble();

        System.out.println("Preço Produto 3");

        p3 = input.nextDouble();

        System.out.println("Preço Total");

        pT = (p1 + p2 + p3) *.9;

        System.out.println("A Pagar:" + pT);

    }
}
