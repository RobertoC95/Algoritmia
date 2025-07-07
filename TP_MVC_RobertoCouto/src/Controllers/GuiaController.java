package Controllers;

import Models.*;
import Repositories.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GuiaController {
    private ClienteRepository clienteRepository;
    private ExperienciaRepository experienciaRepository;
    private GuiaExperienciaRepository guiaExperienciaRepository;
    private QuartosRepository quartosRepository;
    private RatingExperienciaRepository ratingExperienciaRepository;
    private ReservaRepository reservaRepository;
    private TipologiaRepository tipologiaRepository;
    private VendaRepository vendaRepository;

    public GuiaController() throws FileNotFoundException {
        this.clienteRepository = new ClienteRepository();
        this.experienciaRepository = new ExperienciaRepository();
        this.guiaExperienciaRepository = new GuiaExperienciaRepository();
        this.quartosRepository = new QuartosRepository();
        this.ratingExperienciaRepository = new RatingExperienciaRepository();
        this.reservaRepository = new ReservaRepository();
        this.tipologiaRepository = new TipologiaRepository();
        this.vendaRepository = new VendaRepository();
    }

    /**
     * Metodo que permite consultar para o utlizador atual qual o histórico das experiências a seu cargo
     * @param username é igual ao ID para permitir a consulta apenas desse elemento
     * @return uma string com o nome da experiência, o seu ID, o numero de adultos e crainças que a realizaram, e o total de vendas
     */
    public String historicoExperiencias(String username) {
        String data = "";
        int nAdultos = 0;
        int nCriancas = 0;
        int totalVendas = 0;

        for (Experiencia experienciaAtual : this.experienciaRepository.getExperienciaArray()) {
            for (Venda vendaAtual : this.vendaRepository.getVendaArray()) {

                if (experienciaAtual.getIdGuiaExp().equals(username)) {
                    if (vendaAtual.getTipoCliente().equals("adulto")) {
                        nAdultos++;
                        totalVendas += experienciaAtual.getPrecoA();
                    }
                    if (vendaAtual.getTipoCliente().equals("crianca")) {
                        nCriancas++;
                        totalVendas += experienciaAtual.getPrecoC();
                    }
                }
            }
            if (experienciaAtual.getIdGuiaExp().equals(username)) {
                data += experienciaAtual.getNome() + " | " + experienciaAtual.getIdE() + " | Bilhetes Adulto: " + nAdultos + " | Bilhetes Criança: " + nCriancas + " | Total de Vendas: " + totalVendas + "€  *|*|* ";
            }
        }
        return data;
    }


}
