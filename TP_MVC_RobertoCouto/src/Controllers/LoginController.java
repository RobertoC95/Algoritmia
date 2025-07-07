package Controllers;

import Models.User;
import Repositories.UserRepository;

import java.io.FileNotFoundException;

public class LoginController {
    private UserRepository userRepository;


    public LoginController() throws FileNotFoundException {
        this.userRepository = new UserRepository();
    }

    /**
     * Metodo que verifica se o username e a password estão corretos
     * @param usernameInput username inserido pelo membro do staff
     * @param passwordInput password inserido pelo membro do staff
     * @return a validação do processo de login
     */
    public String validateLogin(String usernameInput, String passwordInput){

        for (User userAtual : this.userRepository.getUserArray()){

            if(userAtual.getUsername().equals(usernameInput) && userAtual.getPassword().equals(passwordInput)){
                return userAtual.getTipoAcesso();
            }
        }
        return "Error";
    }
}
