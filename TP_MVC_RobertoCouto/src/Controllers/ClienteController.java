package Controllers;

import Models.Experiencia;
import Models.Quarto;
import Models.RatingExperiencia;
import Repositories.*;

import java.io.FileNotFoundException;

public class ClienteController {
    private ClienteRepository clienteRepository;
    private ExperienciaRepository experienciaRepository;
    private GuiaExperienciaRepository guiaExperienciaRepository;
    private QuartosRepository quartosRepository;
    private RatingExperienciaRepository ratingExperienciaRepository;
    private ReservaRepository reservaRepository;
    private TipologiaRepository tipologiaRepository;
    private VendaRepository vendaRepository;

    public ClienteController() throws FileNotFoundException {
        this.clienteRepository = new ClienteRepository();
        this.experienciaRepository = new ExperienciaRepository();
        this.guiaExperienciaRepository = new GuiaExperienciaRepository();
        this.quartosRepository = new QuartosRepository();
        this.ratingExperienciaRepository = new RatingExperienciaRepository();
        this.reservaRepository = new ReservaRepository();
        this.tipologiaRepository = new TipologiaRepository();
        this.vendaRepository = new VendaRepository();
    }

    public String melhorRating() {


        int melhorRating = 0;
        String melhorExperiencia = "";

        for (Experiencia experienciaAtual : this.experienciaRepository.getExperienciaArray()) {
            int mediaRating = 0;
            int n = 0;
            for (RatingExperiencia ratingAtual : this.ratingExperienciaRepository.getRatingExperienciaArray()) {
                mediaRating += ratingAtual.getRatingExp();
                n++;
            }
            mediaRating /= n;

            if (mediaRating > melhorRating) {
                melhorRating = mediaRating;
                melhorExperiencia = experienciaAtual.getNome();
            }
        }

        return melhorExperiencia;
    }

    public Quarto quartosDisponiveis(){
        return null;
    }

    public Experiencia experienciasDisponiveis(){
        return null;
    }

    public Experiencia experienciasTopSeller(){
        return null;
    }
    public void avaliarExperiencia(){

    }
}
