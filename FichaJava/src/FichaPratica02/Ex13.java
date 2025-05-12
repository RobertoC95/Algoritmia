package FichaPratica02;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int hor, min;

        System.out.println("Introduza as horas: ");
        hor = input.nextInt();

        System.out.println("Introduza os minutos: ");
        min = input.nextInt();


        if (hor > 24 || min > 60) {
            System.out.println("Valores introduzidos inválidos");
        } else if (hor <= 12 && min < 10) {
            System.out.println(hor + ":0" + min + " AM");
        } else if (hor > 12 && min < 10) {
            hor = hor - 12;
            System.out.println(hor + ":0" + min + " PM");
        } else if (hor <= 12 && min > 10) {
            System.out.println(hor + ":" + min + " AM");
        } else if (hor > 12 && min > 10) {
            hor = hor - 12;
            System.out.println(hor + ":" + min + " PM");
        }
    }
}
