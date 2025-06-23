package GrandesNegocios.Tools;

import GrandesNegocios.Models.Sale;
import GrandesNegocios.Models.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVFileReader {

    public ArrayList<Sale> salesFileReader(String filePath) throws FileNotFoundException {

        File salesFile = new File(filePath);
        Scanner salesScanner = new Scanner(salesFile);

        ArrayList<Sale> salesArray = new ArrayList<>();

        salesScanner.nextLine();

        while (salesScanner.hasNextLine()) {

            String linha = salesScanner.nextLine();

            String[] linhaSeparada = linha.split(",");

            String tipoProduto = linhaSeparada[0];
            String produto = linhaSeparada[1];
            Double quantidadeVendida = Double.parseDouble(linhaSeparada[2]);
            Double precoUnitario = Double.parseDouble(linhaSeparada[3]);


            Sale newSale = new Sale(tipoProduto, produto, quantidadeVendida, precoUnitario);

            salesArray.add(newSale);
        }
        return salesArray;
    }

    public ArrayList<User> usersFileReader(String filePath) throws FileNotFoundException {

        File usersFile = new File(filePath);
        Scanner userScanner = new Scanner(usersFile);

        ArrayList<User> usersArray = new ArrayList<>();

        userScanner.nextLine();

        while (userScanner.hasNextLine()) {

            String linha = userScanner.nextLine();

            String[] linhaSeparada = linha.split(";");

            String tipoConta = linhaSeparada[0];
            String username = linhaSeparada[1];
            String password = linhaSeparada[2];


            User newUser = new User(tipoConta, username, password);

            usersArray.add(newUser);
        }
        return usersArray;
    }
}
