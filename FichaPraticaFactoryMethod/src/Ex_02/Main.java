package Ex_02;

import java.util.Scanner;

import static Ex_02.Factory.fazerTaco;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Welcome to TacoSiren:");
            System.out.println("1- Frango");
            System.out.println("2- Vaca");
            System.out.println("3- Veggie");
            System.out.println("Insira o tipo de taco desejado: ");
            opcao = input.nextInt();
            String descricao = "";

            switch (opcao) {

                case 1:
                    descricao = "frango";
                    fazerTaco(opcao, descricao).Prepare();
                    Thread.sleep(1000);
                    fazerTaco(opcao, descricao).Bake();
                    Thread.sleep(1000);
                    fazerTaco(opcao, descricao).Box();
                    Thread.sleep(1000);
                    System.out.println();
                    System.out.println("** Ready **");
                    break;

                case 2:
                    descricao = "vaca";
                    fazerTaco(opcao, descricao).Prepare();
                    Thread.sleep(1000);
                    fazerTaco(opcao, descricao).Bake();
                    Thread.sleep(1000);
                    fazerTaco(opcao, descricao).Box();
                    Thread.sleep(1000);
                    System.out.println();
                    System.out.println("** Ready **");
                    break;

                case 3:
                    descricao = "veggie";
                    fazerTaco(opcao, descricao).Prepare();
                    Thread.sleep(1000);
                    fazerTaco(opcao, descricao).Bake();
                    Thread.sleep(1000);
                    fazerTaco(opcao, descricao).Box();
                    Thread.sleep(1000);
                    System.out.println();
                    System.out.println("** Ready **");
                    break;

            }
        } while (opcao < 1 || opcao > 3);
    }
}
