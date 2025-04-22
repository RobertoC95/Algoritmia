package FichaPratica02;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int escolha;

        System.out.println("Opções do Menu: ");
        System.out.println("1- Criar ");
        System.out.println("2- Atualizar ");
        System.out.println("3- Eliminar ");
        System.out.println("4- Sair ");
        System.out.println("Escolha uma opção");
        escolha= input.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Opção escolhida: Criar");
                break;
            case 2:
                System.out.println("Opção escolhida: Atualizar");
                break;
            case 3:
                System.out.println("Opção escolhida: Eliminar");
                break;
            case 4:
                break;
            default:
                System.out.println("Opção Inválida! You had one Job!!");
                break;

        }

    }
}
