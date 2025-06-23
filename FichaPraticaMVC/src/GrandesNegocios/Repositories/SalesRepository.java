package GrandesNegocios.Repositories;

import GrandesNegocios.Models.Sale;
import GrandesNegocios.Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SalesRepository {

    private ArrayList<Sale> salesArray;


    public SalesRepository() throws FileNotFoundException {
        CSVFileReader csvFr = new CSVFileReader();
        this.salesArray = csvFr.salesFileReader("Files/minimercado.csv");
    }

    public ArrayList<Sale> getSalesArray(){
        return salesArray;
    }


}
