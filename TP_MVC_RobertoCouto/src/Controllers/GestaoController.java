package Controllers;

import Models.*;
import Repositories.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GestaoController {
    private QuartosRepository quartosRepository;
    private ReservaRepository reservaRepository;
    private TipologiaRepository tipologiaRepository;

    public GestaoController() throws FileNotFoundException {
        this.quartosRepository = new QuartosRepository();
        this.reservaRepository = new ReservaRepository();
        this.tipologiaRepository = new TipologiaRepository();
    }

    /**
     * Metodo que compara as reservas para uma determinada semana e ve os disponievis
     * @param mes indica o mes que queremos filtrar na nossa consulta
     * @param semana indica o ano que queremos filtrar na nossa consulta
     * @return uma string com o numero do quarto, a tipologia e o preço semanal dos quartos disponiveis
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
     * Metodo que verifica as resevervas feitas e guarda os quartos reservados
     * @return uma string com o numero do quarto, a tipologia, o ID do cliente, o nome, o email, a nacionalidade , o mes, ano e semana da reserva
     */
    public ArrayList<Quarto> quartosReservados() {
        return null;
    }

    /**
     * Metodo
     * @return uma string com o numero do quarto, a tipologia, o ID do cliente, o nome, o email, a nacionalidade , e as reservas da semana atual
     */
    public ArrayList<Reserva> reservasAtuais() {
        return null;
    }

    /**
     * Metodo que verifica se o quarto está disponivél e se sim permite efetuar uma reserva e a regista na BD ou ficheiro
     */
    public void efetuarReserva() {
    }

    /**
     * Metodo que permite reservar uma experiencia na BD ou ficheiro
     * @param idCliente identificação do cliente
     * @param idReserva identificação da reserva
     * @param nAdultos numero de adultos a participar na experiencia
     * @param nCriancas numero de crianças a participar na experiencia
     */
    public void reservarExperiencia(String idCliente, String idReserva, int nAdultos, int nCriancas) {
    }
}
