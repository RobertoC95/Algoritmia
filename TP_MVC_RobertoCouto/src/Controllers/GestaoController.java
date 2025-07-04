package Controllers;

import Models.*;
import Repositories.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GestaoController {
    private ClienteRepository clienteRepository;
    private ExperienciaRepository experienciaRepository;
    private GuiaExperienciaRepository guiaExperienciaRepository;
    private QuartosRepository quartosRepository;
    private RatingExperienciaRepository ratingExperienciaRepository;
    private ReservaRepository reservaRepository;
    private TipologiaRepository tipologiaRepository;
    private VendaRepository vendaRepository;

    public GestaoController() throws FileNotFoundException {
        this.clienteRepository = new ClienteRepository();
        this.experienciaRepository = new ExperienciaRepository();
        this.guiaExperienciaRepository = new GuiaExperienciaRepository();
        this.quartosRepository = new QuartosRepository();
        this.ratingExperienciaRepository = new RatingExperienciaRepository();
        this.reservaRepository = new ReservaRepository();
        this.tipologiaRepository = new TipologiaRepository();
        this.vendaRepository = new VendaRepository();
    }

    public ArrayList<Quarto> quartosDisponiveis() {

        ArrayList<Quarto> arrayQuartos = new ArrayList<>();
        String semana = "1";
        String mes = "7";

        for (Quarto quartoAtual : this.quartosRepository.getQuartoArray()) {
            boolean disponivel = true;
            for (Reserva reservaAtual : this.reservaRepository.getReservaArray()) {
                if (quartoAtual.getNumQuarto().equals(reservaAtual.getNumQuarto())) {
                    disponivel = false;
                }
            }
            if(disponivel){
                arrayQuartos.add(quartoAtual);
            }
        }
        return arrayQuartos;
    }

    public ArrayList<Quarto> quartosReservados(){
        return null;
    }

    public ArrayList<Reserva> reservasAtuais(){
        return null;
    }

    public void efetuarReserva(){}

    public void reservarExperiencia(){}
}
