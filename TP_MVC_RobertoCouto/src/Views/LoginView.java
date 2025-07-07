package Views;

import Controllers.LoginController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginView {
    private LoginController loginController;

    public LoginView() throws FileNotFoundException {
        this.loginController = new LoginController();
    }

    public void mainMenu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcaoLogin;

        do {
            System.out.println("\n\n********** Bem-vindo/a ao Programa do Hotel Temático da Programação **********\n");
            System.out.println("1. Cliente");
            System.out.println("2. Staff");
            System.out.println("\n0. Terminar Programa");

            System.out.print("\nOpção: ");
            opcaoLogin = input.nextInt();

            switch (opcaoLogin) {
                case 1:
                    // CLIENTE
                    ClienteView cv = new ClienteView();
                    cv.clientMenu();
                    break;

                case 2:
                    // MEMBRO DA EQUIPA
                    this.loginMenu();
                    break;

                case 0:
                    System.out.println("\nObrigado por utilizar o nosso programa... Até à próxima!");
                    break;

                default:
                    System.out.println("\nOpção Inválida");
            }
        } while (opcaoLogin != 0);
    }

    public void loginMenu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.print("\nUsername: ");
        String usernameInput = input.next();

        System.out.print("Password: ");
        String passwordInput = input.next();

        String accessType = this.loginController.validateLogin(usernameInput, passwordInput);

        switch (accessType) {
            case "ADMIN":
                AdminView av = new AdminView();
                av.adminMenu();
                break;

            case "GUIA":
                GuiaView gv = new GuiaView();
                gv.guiaMenu(usernameInput);
                break;

            case "GESTAO":
                GestaoView sv = new GestaoView();
                sv.gestaoMenu();
                break;

            case "ERROR":
                System.out.println("Acessos inválidos");
                break;
        }
    }

}
