package Controllers;

import Models.*;
import Repositories.*;

import java.io.FileNotFoundException;

public class ClienteController {
    private ExperienciaRepository experienciaRepository;
    private RatingExperienciaRepository ratingExperienciaRepository;
    private TipologiaRepository tipologiaRepository;
    private ReservaRepository reservaRepository;
    private QuartosRepository quartosRepository;

    public ClienteController() throws FileNotFoundException {
        this.experienciaRepository = new ExperienciaRepository();
        this.ratingExperienciaRepository = new RatingExperienciaRepository();
        this.tipologiaRepository = new TipologiaRepository();
        this.reservaRepository = new ReservaRepository();
        this.quartosRepository = new QuartosRepository();
    }

    /**
     * Metodo que calcula os ratings medios de todas as experiencias
     *
     * @return uma string com a melhor experiencia e o seu rating
     */
    public String melhorRating() {


        double melhorRating = 0;
        String melhorExperiencia = "";

        for (Experiencia experienciaAtual : this.experienciaRepository.getExperienciaArray()) {
            double mediaRating = 0;
            int n = 0;
            for (RatingExperiencia ratingAtual : this.ratingExperienciaRepository.getRatingExperienciaArray()) {

                if (experienciaAtual.getIdE().equals(ratingAtual.getIdExp())) {
                    mediaRating += ratingAtual.getRatingExp();
                    n++;
                }
            }
            mediaRating /= n;

            if (mediaRating > melhorRating) {
                melhorRating = mediaRating;
                melhorExperiencia = "Experiência com melhor rating: " + experienciaAtual.getNome() + " | rating médio : " + mediaRating;
            }
        }

        return melhorExperiencia;
    }

    /**
     *  metodo que compara as reservas para uma determinada semana e ve os disponievis
     * @param mes indica o mes que queremos filtrar na nossa consulta
     * @param semana indica a semana que queremos filtrar na nossa consulta
     * @return uma string com o numero do quarto, a tipologia e o preço semanal
     */
    public String quartosDisponiveis(int mes, int semana) {

        String quartos = "";

        for (Tipologia tipologiaAtual : this.tipologiaRepository.getTipologiaArray()) {
            for (Quarto quartoAtual : this.quartosRepository.getQuartoArray()) {
                boolean disponivel = true;
                for (Reserva reservaAtual : this.reservaRepository.getReservaArray()) {
                    if (quartoAtual.getNumQuarto().equals(reservaAtual.getNumQuarto()) && reservaAtual.getMes() == mes && reservaAtual.getSemana() == semana) {
                        disponivel = false;
                    }
                }
                if (disponivel) {
                    quartos = "Numero do quarto: " + quartoAtual.getNumQuarto() + " | Tipologia: " + tipologiaAtual.getDescricao()+ " | Preço por semana: " + tipologiaAtual.getPrecoSemana();
                }
            }
        }

        return quartos;
    }

    /**
     * Metodo que compara a semana e o mes e ve as experiencias disponiveis
     * @param mes indica o mes que queremos filtrar na nossa consulta
     * @param ano indica o ano que queremos filtrar na nossa consulta
     * @return uma string com o nome das experiencias disponiveis
     */
    public String experienciasDisponiveis(int mes, int ano) {
        return null;
    }

    /**
     * Metodo que soma e compara a quantidade de vezes que uma esperiencia foi vendida
     * @return uma string com o nome da experiencia com mais vendas
     */
    public Experiencia experienciasTopSeller() {
        return null;
    }

    /**
     * Metodo que permite avaliar uma experiencia e a regista na BD ou ficheiro
     */
    public void avaliarExperiencia() {

    }
}
