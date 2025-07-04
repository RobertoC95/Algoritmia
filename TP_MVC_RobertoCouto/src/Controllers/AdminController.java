package Controllers;

import Models.*;
import Repositories.*;

import java.io.FileNotFoundException;

public class AdminController {
    private ClienteRepository clienteRepository;
    private ExperienciaRepository experienciaRepository;
    private GuiaExperienciaRepository guiaExperienciaRepository;
    private QuartosRepository quartosRepository;
    private RatingExperienciaRepository ratingExperienciaRepository;
    private ReservaRepository reservaRepository;
    private TipologiaRepository tipologiaRepository;
    private VendaRepository vendaRepository;

    public AdminController() throws FileNotFoundException {
        this.clienteRepository = new ClienteRepository();
        this.experienciaRepository = new ExperienciaRepository();
        this.guiaExperienciaRepository = new GuiaExperienciaRepository();
        this.quartosRepository = new QuartosRepository();
        this.ratingExperienciaRepository = new RatingExperienciaRepository();
        this.reservaRepository = new ReservaRepository();
        this.tipologiaRepository = new TipologiaRepository();
        this.vendaRepository = new VendaRepository();
    }

    public String quartoMaisReservado() {

        int reservas = 0;
        int maisReservas = 0;
        String tip = "";
        String tipFinal = "";
        for (Quarto quartoAtual : this.quartosRepository.getQuartoArray()) {
            for (Reserva reservaAtual : this.reservaRepository.getReservaArray()) {

                if (quartoAtual.getNumQuarto().equals(reservaAtual.getNumQuarto())) {
                    reservas++;
                }

            }

            if (reservas > maisReservas) {
                for(Tipologia tipologiaAtual : this.tipologiaRepository.getTipologiaArray()){
                    if(tipologiaAtual.getIdTipologia().equals(quartoAtual.getIdTipologia())){
                        tip= tipologiaAtual.getDescricao();
                    }
                }

            }

        }
        return tip;
    }

    public String totalReservas(){
        return null;
    }

    public String totalReceitas(){
        return null;
    }

    public String resRecMensais(){
        return null;
    }

    public String ExpAdultos(){
        return null;
    }

    public String ExpCrianca(){
        return null;
    }

    public String expMaisLucrativas(){return null;}

    public String expMenosLucrativas(){return null;}

    public String melhorPrecoSemana(){return null;}

    public void adicionarLogin(){}
}
