package FichaPratica04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcao;
        System.out.println("\n**** Menu de Opções ****");
        do {
            do {
                System.out.println("Escolha uma opção:");
                System.out.println("opção 1: Criar");
                System.out.println("opção 2: Atualizar");
                System.out.println("opção 3: Eliminar");
                System.out.println("opção 4:Sair");
                opcao = input.nextInt();
            } while (opcao < 1 || opcao > 4);
            switch (opcao) {
                case 1:
                    System.out.println("Escolheu a opção 1");
                    break;
                case 2:
                    System.out.println("Escolheu a opção 2");
                    break;
                case 3:
                    System.out.println("Escolheu a opção 3");
                    break;
                case 4:
                    System.out.println("Escolheu a opção 4");
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
                    break;
            }
        } while (opcao != 4) ;

    }
}

