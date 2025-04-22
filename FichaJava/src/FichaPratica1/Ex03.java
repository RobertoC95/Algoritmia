package FichaPratica1;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        //scanner

        Scanner input = new Scanner(System.in);

        //Declarar variaveis

        int ladoA, ladoB, area, perimetro;

        System.out.println("LadoA:");

        ladoA = input.nextInt();

        System.out.println("LadoB:");

        ladoB = input.nextInt();


        //area e perimetro retangulo

        area = ladoA * ladoB;

        perimetro = (ladoA * 2) + (ladoB * 2);

        System.out.println("Area:" + area);

        System.out.println("Perimetro:" + perimetro);


    }
}
