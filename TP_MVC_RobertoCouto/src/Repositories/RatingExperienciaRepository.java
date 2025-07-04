package Repositories;

import Models.RatingExperiencia;
import Tools.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RatingExperienciaRepository {
    private ArrayList<RatingExperiencia> ratingExperienciaArray;

    public RatingExperienciaRepository() throws FileNotFoundException {
        FileReader csvFr= new FileReader();
        this.ratingExperienciaArray = csvFr.ratingExpFileReader("Files/ratings_experiencias.csv");
    }

    public ArrayList<RatingExperiencia> getRatingExperienciaArray() {
        return ratingExperienciaArray;
    }
}
