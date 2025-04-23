package FichaPratica02;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaA;

        System.out.println("Introduza nota1: ");
        nota1 = input.nextDouble();

        System.out.println("Introduza nota2: ");
        nota2 = input.nextDouble();

        System.out.println("Introduza nota3: ");
        nota3 = input.nextDouble();

        mediaA = (nota1 * .25) + (nota2 * .35) + (nota3 * .4);

        if (mediaA >= 9.5)
            System.out.println(mediaA + " Aluno Aprovado");
        else
            System.out.println("media: " + mediaA + " " + "Aluno Reprovado");


    }
}
