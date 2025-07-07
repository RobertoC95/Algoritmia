package Controllers;

import Models.*;
import Repositories.*;

import java.io.FileNotFoundException;

public class AdminController {
    private QuartosRepository quartosRepository;
    private ReservaRepository reservaRepository;
    private TipologiaRepository tipologiaRepository;

    public AdminController() throws FileNotFoundException {
        this.quartosRepository = new QuartosRepository();
        this.reservaRepository = new ReservaRepository();
        this.tipologiaRepository = new TipologiaRepository();
    }

    /**
     * metodo que contabiliza as reservas de cada tipologia de quarto através da comparação dos ficheiros de reserva, quarto e tipologia
     * @return  uma String com a tipologia mais reservada e o numero de reservas
     */
    public String quartoMaisReservado() {


        int maisReservas = 0;
        String tip = "";
        String tipFinal = "";
        for (Tipologia tipologiaAtual : this.tipologiaRepository.getTipologiaArray()) {
            int reservas = 0;
            for (Quarto quartoAtual : this.quartosRepository.getQuartoArray()) {
                for (Reserva reservaAtual : this.reservaRepository.getReservaArray()) {

                    if (quartoAtual.getNumQuarto().equals(reservaAtual.getNumQuarto()) && quartoAtual.getIdTipologia().equals(tipologiaAtual.getIdTipologia())) {
                        reservas++;
                    }

                }

                if (reservas > maisReservas) {
                    maisReservas =reservas;

                    tip = "Tipologia do quarto mais procurado: " + tipologiaAtual.getDescricao() + " | Reservas: " + maisReservas;

                }


            }
        }

        return tip;
    }

    /**
     * Metodo que contabiliza o numero total de reservas no ficheiro reservas
     * @return uma String indicando a soma total
     */
    public String totalReservas() {
        return null;
    }

    /**
     * Metodo que através da comparação entre ficheiros vendas e reservas faz a soma do total arrecadado por ambos os setores
     * @return um string que contem esse valor
     */
    public String totalReceitas() {
        return null;
    }

    /**
     * Metodos que através dos parametros recebidos e analisando os ficheiros vendas e reservas, soma o total de receitas no periodo determinado
     * @param ano indica o ano que queremos filtrar na nossa consulta
     * @param mes indica o mes que queremos filtrar na nossa consulta
     * @return um String com a receita obtida naquele periodo
     */
    public String resRecMensais(int ano, int mes) {
        return null;
    }

    /**
     * Metodo que soma o numero de bilhetes vendidos para adultos numa determinada experiència
     * @return uma string com o nome da experiencia e o total de bilhetes vendidos
     */
    public String ExpAdultos() {
        return null;
    }

    /**
     * Metodo que soma o numero de bilhetes vendidos para crianças numa determinada experiência
     * @return uma string com o nome da experiencia e o total de bilhetes vendidos
     */
    public String ExpCrianca() {
        return null;
    }

    /**
     * Metodo que soma o preço dos bilhetes vendidos para cada experiência
     * @return uma string com o nome da experiencia com maior e o valor arrecadado
     */
    public String expMaisLucrativas() {
        return null;
    }

    /**
     * Metodo que soma o preço dos bilhetes vendidos para cada experiência
     * @return uma string com o nome da experiencia com menor e o valor arrecadado
     */
    public String expMenosLucrativas() {
        return null;
    }

    /**
     * Metodo que verifica a tipologia com o preço por semana mais barato e guarda o nome dos quartos com essa tipologia
     * @return uma string com o nomes dos quartos e o seu preço/semana
     */
    public String melhorPrecoSemana() {
        return null;
    }

    /**
     * Metodo que nos permite criar uma novo login e regista os dados na nossa BD ou Ficheiro
     * @param username username do novo login
     * @param password password do novo login
     */
    public void adicionarLogin(String username,String password) {
    }
}
