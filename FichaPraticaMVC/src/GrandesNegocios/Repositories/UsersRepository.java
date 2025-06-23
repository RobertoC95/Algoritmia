package GrandesNegocios.Repositories;

import GrandesNegocios.Models.User;
import GrandesNegocios.Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UsersRepository {

    private ArrayList<User> usersArray;

    public UsersRepository() throws FileNotFoundException {
        CSVFileReader csvFR = new CSVFileReader();

        this.usersArray = csvFR.usersFileReader("Files/login_grandesNegocios.csv");
    }

    public ArrayList<User> getUsersArray() {
        return usersArray;
    }
}
