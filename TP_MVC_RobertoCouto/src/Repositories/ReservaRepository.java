package Repositories;

import Models.Reserva;
import Tools.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ReservaRepository {
    private ArrayList<Reserva> reservaArray;

    public ReservaRepository() throws FileNotFoundException {
        FileReader csvFR = new FileReader();
        this.reservaArray = csvFR.reservasFileReader("Files/reservas_quartos.csv");
    }

    public ArrayList<Reserva> getReservaArray() {
        return reservaArray;
    }
}
