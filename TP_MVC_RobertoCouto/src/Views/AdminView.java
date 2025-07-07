package Views;

import Controllers.AdminController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminView {
    private AdminController adminController;

    public AdminView() throws FileNotFoundException {
        this.adminController = new AdminController();
    }

    public void adminMenu() {
        Scanner input = new Scanner(System.in);
        int opcaoCliente;

        do {

            System.out.println("\n\n********** MENU Admin **********");
            System.out.println("1.  Consultar Total de Reservas");
            System.out.println("2.  Consultar Total de Receitas");
            System.out.println("3.  Consultar Reservas/Receitas Mensais");
            System.out.println("4.  Consultar Tipologia de Quarto Mais Reservada (metodo desenvolvido)");
            System.out.println("5.  Consultar Experiência Mais Procurada (Adultos)");
            System.out.println("6.  Consultar Experiência Mais Procurada (Crianças)");
            System.out.println("7.  Consultar Experiência Mais Lucrativa");
            System.out.println("8.  Consultar Experiência Menos Lucrativa");
            System.out.println("9.  Consultar Quarto com Melhor Preço/Semana");
            System.out.println("10. Adicionar Novo Login");
            System.out.println("0.  Voltar");

            System.out.print("Opção: ");
            opcaoCliente = input.nextInt();

            switch (opcaoCliente) {
                case 1: System.out.println(this.adminController.totalReservas());
                    break;

                case 2: // Consultar Total de Receitas
                    System.out.println(this.adminController.totalReceitas());
                    break;

                case 3: // Consultar Reservas/Receitas Mensais
                    int ano = input.nextInt();
                    int mes= input.nextInt();
                    System.out.println(this.adminController.resRecMensais(ano, mes));
                    break;

                case 4: // Consultar tipologia do quarto mais reservado
                    System.out.println(this.adminController.quartoMaisReservado());
                    break;

                case 5: // Consultar Experiência Mais Procurada (Adultos)
                    System.out.println(this.adminController.ExpAdultos());
                    break;

                case 6: // Consultar Experiência Mais Procurada (Crianças)
                    System.out.println(this.adminController.ExpCrianca());
                    break;

                case 7: // Consultar Experiência Mais Lucrativa
                    System.out.println(this.adminController.expMaisLucrativas());
                    break;

                case 8: // Consultar Experiência Menos Lucrativa
                    System.out.println(this.adminController.expMenosLucrativas());
                    break;

                case 9: // Consultar Quarto com Melhor Preço/Semana
                    System.out.println(this.adminController.melhorPrecoSemana());
                    break;

                case 10: // Adicionar Novo Login
                    String usernameNovo=input.nextLine();
                    String passNova = input.nextLine();
                    this.adminController.adicionarLogin(usernameNovo, passNova);
                    break;

                case 0: // Voltar
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        } while (opcaoCliente != 0);
    }


}
