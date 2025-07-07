package Views;

import Controllers.GestaoController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class GestaoView {
    private GestaoController gestaoController;

    public GestaoView() throws FileNotFoundException {
        this.gestaoController = new GestaoController();
    }

    public void gestaoMenu() {
        Scanner input = new Scanner(System.in);
        int opcaoCliente;

        do {

            System.out.println("\n\n********** MENU Rececionista **********");
            System.out.println("1.  Consultar Quartos Disponíveis (Metodo desenvolvido)");
            System.out.println("2.  Consultar Quartos Reservados");
            System.out.println("3.  Consultar Reservas Atuais");
            System.out.println("4.  Efetuar uma Reserva");
            System.out.println("5.  Reservar uma Experiência");
            System.out.println("0.  Voltar");

            System.out.print("Opção: ");
            opcaoCliente = input.nextInt();

            switch (opcaoCliente) {
                case 1: // Consultar Quartos Disponíveis
                    System.out.println("Insira mes da visita:");
                    int mes = input.nextInt();
                    System.out.println("Insira semana da visita:");
                    int semana = input.nextInt();
                    System.out.println("Quartos Disponíveis esta semana: ");
                    System.out.println(this.gestaoController.quartosDisponiveis(mes, semana));
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
                    System.out.println("ID novo Cliente:");
                    String idCliente = input.nextLine();
                    System.out.println("Id nova Reserva:");
                    String idReserva = input.nextLine();
                    System.out.println("Numero de adultos a participar na experiencia: ");
                    System.out.println("Insira mes da visita:");
                    int nAdultos = input.nextInt();
                    System.out.println("Numero de criancas a participar na experiencia: ");
                    int nCriancas = input.nextInt();
                    System.out.println("Quartos Disponíveis esta semana: ");
                    this.gestaoController.reservarExperiencia(idCliente,idReserva,nAdultos,nCriancas);
                    break;

                case 0: // Voltar
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        } while (opcaoCliente != 0);
    }
}
