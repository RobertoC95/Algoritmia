package Repositories;

import Models.Venda;
import Tools.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class VendaRepository {
    private ArrayList<Venda> vendaArray;

    public VendaRepository() throws FileNotFoundException {
        FileReader csvFR = new FileReader();
        this.vendaArray = csvFR.vendaFileReader("Files/vendas_experiencias.csv");
    }

    public ArrayList<Venda> getVendaArray() {
        return vendaArray;
    }
}
