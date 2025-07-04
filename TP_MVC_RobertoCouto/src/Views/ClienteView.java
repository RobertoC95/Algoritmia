package Views;

import Controllers.ClienteController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClienteView {
    private ClienteController clienteController;

    public ClienteView() throws FileNotFoundException {
        this.clienteController = new ClienteController();
    }

    public void clientMenu() {

        Scanner input = new Scanner(System.in);
        int opcaoCliente;

        do {

            System.out.println("\n\n********** MENU CLIENTE **********");
            System.out.println("1. Consultar Quartos Disponíveis");
            System.out.println("2. Consultar Experiências Disponíveis");
            System.out.println("3. Consultar Experiência Favorita");
            System.out.println("4. Consultar Experiência Top-Seller");
            System.out.println("5. Avaliar uma Experiência");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcaoCliente = input.nextInt();

            switch (opcaoCliente) {
                case 1: // Consultar Quartos Disponíveis
                    System.out.println(this.clienteController.quartosDisponiveis());
                    break;

                case 2: // Consultar Experiências Disponíveis
                    System.out.println(this.clienteController.experienciasDisponiveis());
                    break;

                case 3:
                    System.out.println("\n***** Melhor Experiencia *****");
                    System.out.println(this.clienteController.melhorRating());
                    break;

                case 4: // Consultar Experiência Top-Seller
                    System.out.println(this.clienteController.experienciasTopSeller());
                    break;

                case 5: // Avaliar uma Experiência
                    this.clienteController.avaliarExperiencia();
                    break;

                case 0: // Voltar
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        } while (opcaoCliente != 0);
    }

}
