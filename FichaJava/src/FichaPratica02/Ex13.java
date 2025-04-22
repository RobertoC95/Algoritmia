package FichaPratica02;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int hor, min, seg, totalSeg;

        System.out.println("Introduza os minutos da musica 1");

        min = input.nextInt();

        System.out.println("Introduza os segundos da musica 1");

        seg = input.nextInt();

        System.out.println("Introduza os minutos da musica 2");

        min = min + input.nextInt();

        System.out.println("Introduza os segundos da musica 2");

        seg = seg + input.nextInt();

        System.out.println("Introduza os minutos da musica 3");

        min = min + input.nextInt();

        System.out.println("Introduza os segundos da musica 3");

        seg = seg + input.nextInt();

        System.out.println("Introduza os minutos da musica 4");

        min = min + input.nextInt();

        System.out.println("Introduza os segundos da musica 4");

        seg = seg + input.nextInt();

        System.out.println("Introduza os minutos da musica 5");

        min = min + input.nextInt();

        System.out.println("Introduza os segundos da musica 5");

        seg = seg + input.nextInt();

        totalSeg = seg + (min * 60);
        System.out.println(totalSeg);

/*
        hor = totalSeg / 3600;
        min = (totalSeg / 60) - (hor * 60);
        seg = (totalSeg) - (min * 60) - (hor * 3600);

                */
        hor = (min / 60);
        min = (seg / 60) + min % 60;
        seg = seg % 60;


        /*min = (seg / 60) + min % 60 - (hor * 60);
        seg = seg % 60 ; */

        System.out.println("Duração do Album " + hor + "h " + min + "min " + seg + "seg ");

    }
}
