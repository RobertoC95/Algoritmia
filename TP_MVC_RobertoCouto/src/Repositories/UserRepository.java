package Repositories;

import Models.Cliente;
import Models.User;
import Tools.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UserRepository {
    private ArrayList<User> userArray;

    public UserRepository() throws FileNotFoundException {
        FileReader csvFR = new FileReader();
        this.userArray = csvFR.usersFileReader("Files/logins.csv");
    }

    public ArrayList<User> getUserArray() {
        return userArray;
    }
}
