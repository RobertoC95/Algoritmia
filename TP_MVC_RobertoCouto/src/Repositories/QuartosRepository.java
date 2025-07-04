package Repositories;

import Models.Quarto;
import Tools.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class QuartosRepository {

    private ArrayList<Quarto> quartoArray;


    public QuartosRepository() throws FileNotFoundException {
        FileReader csvFr = new FileReader();
        this.quartoArray = csvFr.quartoFileReader("Files/quartos.csv");
    }

    public ArrayList<Quarto> getQuartoArray() {
        return quartoArray;
    }
}
