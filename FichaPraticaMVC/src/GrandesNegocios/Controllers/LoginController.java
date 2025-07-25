package GrandesNegocios.Controllers;

import GrandesNegocios.Models.User;
import GrandesNegocios.Repositories.UsersRepository;

import java.io.FileNotFoundException;

public class LoginController {
    private UsersRepository usersRepository;


    public LoginController() throws FileNotFoundException {
        this.usersRepository = new UsersRepository();
    }

    public String validateLogin(String usernameInput, String passwordInput) {

        for (User userAtual : this.usersRepository.getUsersArray()) {

            if (userAtual.getUsername().equals(usernameInput) && userAtual.getPassword().equals(passwordInput)) {
                return userAtual.getTipoConta();
            }
        }
        return "ERROR";
    }


}
