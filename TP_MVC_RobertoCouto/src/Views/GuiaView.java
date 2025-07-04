package Views;

import Controllers.GestaoController;
import Controllers.GuiaController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class GuiaView {
    private GuiaController guiaController;

    public GuiaView() throws FileNotFoundException {
        this.guiaController = new GuiaController();
    }

    public void guiaMenu(String username) {
        Scanner input = new Scanner(System.in);
        int opcaoCliente;

        do {

            System.out.println("\n\n********** MENU Guia **********");
            System.out.println("1.  Consultar Histórico de Experiências");
            System.out.println("0.  Voltar");

            System.out.print("Opção: ");
            opcaoCliente = input.nextInt();

            switch (opcaoCliente) {
                case 1:
                    System.out.println(guiaController.historicoExperiencias(username));
                    break;

                case 0: // Voltar
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        } while (opcaoCliente != 0);
    }
}
