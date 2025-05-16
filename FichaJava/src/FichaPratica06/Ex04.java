package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03.*;
import static FichaPratica06.Ex03.triangular;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Introduza um numero");
        num = input.nextInt();
        int opcao;

        do {
            System.out.println("escolha uma das opções");
            System.out.println("1- Par ou ìmpar");
            System.out.println("2- Positivo Negativo");
            System.out.println("3- Primo ou não Primo");
            System.out.println("4- Perfeito ou não perfeito");
            System.out.println("5- Triangular ou não triangular");
            System.out.println("6- Todos os resultados");
            System.out.println("7- Trocar de numero");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    if (par(num)) {
                        System.out.println("O numero inserido é Par");
                    } else {
                        System.out.println("O numero inserido é Impar");
                    }
                    break;
                case 2:
                    if (positivo(num)) {

                        System.out.println("O numero inserido é positivo");
                    } else {
                        System.out.println("O numero inserido é negativo");
                    }
                    break;
                case 3:
                    if (primo(num)) {
                        System.out.println("O numero é primo");
                    } else {
                        System.out.println("o número não é primo");
                    }
                    break;
                case 4:
                    if (perfeito(num)) {
                        System.out.println("o numero é perfeito");
                    } else
                        System.out.println("o numero não é perfeito");
                    break;
                case 5:
                    if (triangular(num)) {
                        System.out.println("o numero é triangular");
                    } else
                        System.out.println("o numero não é triangular");
                    break;
                case 6:
                    if (par(num)) {
                        System.out.println("Par");
                    } else {
                        System.out.println("Impar");
                    }
                    if (positivo(num)) {

                        System.out.println("O numero inserido é positivo");
                    } else {
                        System.out.println("O numero inserido é negativo");
                    }
                    if (primo(num)) {
                        System.out.println("O numero é primo");
                    } else {
                        System.out.println("o número não é primo");
                    }
                    if (perfeito(num)) {
                        System.out.println("o numero é perfeito");
                    } else
                        System.out.println("o numero não é perfeito");
                    if (triangular(num)) {
                        System.out.println("o numero é triangular");
                    } else
                        System.out.println("o numero não é triangular");

                    break;
                case 7:
                    trocarNumero(num);
                    break;
                default:
                    System.out.println("Thank you come again");
            }
        } while (opcao == 7);
    }

}
