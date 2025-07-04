package Controllers;

import Models.User;
import Repositories.UserRepository;

import java.io.FileNotFoundException;

public class LoginController {
    private UserRepository userRepository;

    public LoginController() throws FileNotFoundException {
        this.userRepository = new UserRepository();
    }

    public String validateLogin(String usernameInput, String passwordInput){

        for (User userAtual : this.userRepository.getUserArray()){

            if(userAtual.getUsername().equals(usernameInput) && userAtual.getPassword().equals(passwordInput)){
                return userAtual.getTipoAcesso();
            }
        }
        return "Error";
    }
}
