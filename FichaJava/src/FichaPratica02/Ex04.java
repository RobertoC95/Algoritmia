package FichaPratica02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pos;

        System.out.println("Introduza o posição final da corrida: ");
        pos = input.nextInt();

        switch (pos) {
            case 1:
                System.out.println("Ganhou 25 pontos");
                break;
            case 2:
                System.out.println("Ganhou 18 pontos");
                break;
            case 3:
                System.out.println("Ganhou 15 pontos");
                break;
            case 4:
                System.out.println("Ganhou 12 pontos");
                break;
            case 5:
                System.out.println("Ganhou 10 pontos");
                break;
            case 6:
                System.out.println("Ganhou 8 pontos");
                break;
            case 7:
                System.out.println("Ganhou 6 pontos");
                break;
            case 8:
                System.out.println("Ganhou 4 pontos");
                break;
            case 9:
                System.out.println("Ganhou 2 pontos");
                break;
            case 10:
                System.out.println("Ganhou 1 pontos");
                break;
            default:
                System.out.println("Não Ganhou pontos");


        }


    }
}
