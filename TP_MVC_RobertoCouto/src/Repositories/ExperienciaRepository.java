package Repositories;

import Models.Experiencia;
import Tools.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ExperienciaRepository {
    private ArrayList<Experiencia> experienciaArray;

    public ExperienciaRepository() throws FileNotFoundException {
        FileReader csvFr = new FileReader();
        this.experienciaArray = csvFr.experienciaFileReader("Files/experiencias.csv");
    }

    public ArrayList<Experiencia> getExperienciaArray() {
        return experienciaArray;
    }
}
