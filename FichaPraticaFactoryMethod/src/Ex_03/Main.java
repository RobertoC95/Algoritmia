package Ex_03;

import java.util.Scanner;

import static Ex_02.Factory.fazerTaco;
import static Ex_03.Factory.criarDocument;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Criar documento");
            System.out.println("1- texto");
            System.out.println("2- apresentação");
            System.out.println("3- folha de calculo");
            System.out.println("Insira o tipo de documento desejado: ");
            opcao = input.nextInt();
            String descricao = "";

            System.out.println("Insira o nome do autor: ");
            input.nextLine();
            String autor = input.nextLine();
            System.out.println();
            System.out.println("Insira o nome do ficheiro: ");
            String nome = input.nextLine();


            switch (opcao) {

                case 1:
                    criarDocument(autor, nome, 1);
                    Thread.sleep(500);
                    criarDocument(autor, nome, 1).open();
                    Thread.sleep(500);
                    criarDocument(autor, nome, 1).save();
                    Thread.sleep(500);
                    criarDocument(autor, nome, 1).close();
                    System.out.println();
                    System.out.println("** Ready **");
                    break;

                case 2:
                    criarDocument(autor, nome, 2);
                    Thread.sleep(500);
                    criarDocument(autor, nome, 2).open();
                    Thread.sleep(500);
                    criarDocument(autor, nome, 2).save();
                    Thread.sleep(500);
                    criarDocument(autor, nome, 2).close();
                    System.out.println();
                    System.out.println("** Ready **");
                    break;

                case 3:
                    criarDocument(autor, nome, 3);
                    Thread.sleep(500);
                    criarDocument(autor, nome, 3).open();
                    Thread.sleep(500);
                    criarDocument(autor, nome, 3).save();
                    Thread.sleep(500);
                    criarDocument(autor, nome, 3).close();
                    System.out.println();
                    System.out.println("** Ready **");
                    break;

            }
        } while (opcao < 1 || opcao > 3);
    }
}
