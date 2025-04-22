package FichaPratica01;

import java.util.Scanner;

public class Ex08 {

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

        totalSeg = (min*60) + seg;

        hor = totalSeg / 3600;
        min = (totalSeg / 60) - (hor * 60);
        seg = (totalSeg) - (min * 60) - (hor * 3600);

        System.out.println("Duração do Album " + hor + "h " + min + "min "+ seg + "seg ");


    }
}
