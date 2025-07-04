package Repositories;

import Models.Tipologia;
import Tools.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TipologiaRepository {
    private ArrayList<Tipologia> tipologiaArray;

    public TipologiaRepository() throws FileNotFoundException {
        FileReader csvFR = new FileReader();
        this.tipologiaArray = csvFR.tipologiaFileReader("Files/tipologia.csv");
    }

    public ArrayList<Tipologia> getTipologiaArray() {
        return tipologiaArray;
    }
}
