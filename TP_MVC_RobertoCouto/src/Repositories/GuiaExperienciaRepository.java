package Repositories;

import Models.Experiencia;
import Models.GuiaExperiencia;
import Tools.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GuiaExperienciaRepository {
    private ArrayList<GuiaExperiencia> guiaExperienciaArray;

    public GuiaExperienciaRepository() throws FileNotFoundException {
        FileReader csvFr = new FileReader();
        this.guiaExperienciaArray = csvFr.guiaFileReader("Files/guias_experiencias.csv");
    }

    public ArrayList<GuiaExperiencia> getGuiaExperienciaArray() {
        return guiaExperienciaArray;
    }
}
