package Repositories;

import Models.Cliente;
import Tools.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ClienteRepository {

    private ArrayList<Cliente> clienteArray;

    public ClienteRepository() throws FileNotFoundException {
        FileReader csvFR = new FileReader();
        this.clienteArray = csvFR.clientFileReader("Files/clientes.csv");
    }

    public ArrayList<Cliente> getClienteArray() {
        return clienteArray;
    }
}
