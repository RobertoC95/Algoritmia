package Views;

import Controllers.GestaoController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class GestaoView {
    private GestaoController gestaoController;

    public  GestaoView() throws FileNotFoundException {
        this.gestaoController = new GestaoController();
    }

    public void gestaoMenu() {
        Scanner input = new Scanner(System.in);
        int opcaoCliente;

        do {

            System.out.println("\n\n********** MENU Rececionista **********");
            System.out.println("1.  Consultar Quartos Disponíveis");
            System.out.println("2.  Consultar Quartos Reservados");
            System.out.println("3.  Consultar Reservas Atuais");
            System.out.println("4.  Efetuar uma Reserva");
            System.out.println("5.  Reservar uma Experiência");
            System.out.println("0.  Voltar");

            System.out.print("Opção: ");
            opcaoCliente = input.nextInt();

            switch (opcaoCliente) {
                case 1: // Consultar Quartos Disponíveis
                    System.out.println(this.gestaoController.quartosDisponiveis());
                    break;

                case 2: // Consultar Quartos Reservados
                    System.out.println(this.gestaoController.quartosReservados());
                    break;

                case 3: // Consultar Reservas Atuais
                    System.out.println(this.gestaoController.reservasAtuais());
                    break;

                case 4: // Efetuar uma Reserva
                    this.gestaoController.efetuarReserva();
                    break;

                case 5: // Reservar uma Experiência
                    this.gestaoController.reservarExperiencia();
                    break;

                case 0: // Voltar
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        } while (opcaoCliente != 0);
    }
}
