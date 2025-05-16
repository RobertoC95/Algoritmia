package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03.*;
import static FichaPratica06.Ex03.par;
import static FichaPratica06.Ex03.perfeito;
import static FichaPratica06.Ex03.positivo;
import static FichaPratica06.Ex03.primo;
import static FichaPratica06.Ex03.triangular;
import static FichaPratica06.Ex03.trocarNumero;
import static FichaPratica06.Ex05.*;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 0, opcao, linhas;

        System.out.println("Escolha uma opcao :");
        System.out.println("1- maior elemento");
        System.out.println("2- menor elemento");
        System.out.println("3- verificação de vetor crescente");
        System.out.println("4- quero saber tudo e mais alguma coisa");
        System.out.println("any other key- sair");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("o maior elemento do vetor é " + maior(num));
                break;
            case 2:
                System.out.println("o menor elemento do vetor é " + menor(num));
                break;
            case 3:
                if (crescente(num)) {
                    System.out.println("O vetor tem os elementos por ordem crescente");
                } else {
                    System.out.println("O vetor tem os elementos por ordem decrescente");
                }
                break;
            case 4:
                System.out.println("o maior elemento do vetor é " + maior(num));

                System.out.println("o menor elemento do vetor é " + menor(num));

                if (crescente(num)) {
                    System.out.println("O vetor tem os elementos por ordem crescente");
                } else {
                    System.out.println("O vetor tem os elementos por ordem não crescente");
                }
                break;
            default:
                System.out.println("Thank you come again");
        }
    }
}
