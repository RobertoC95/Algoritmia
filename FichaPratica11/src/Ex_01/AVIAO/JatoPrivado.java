package Ex_01.AVIAO;

import Ex_01.ENUMERACAO.CategoriaJato;
import Ex_01.ENUMERACAO.InstalacaoJato;

import java.util.ArrayList;

public class JatoPrivado extends Aviao {

    private int lotacao;
    private double capacidadeBagagem;
    private CategoriaJato categoria;
    private ArrayList<InstalacaoJato> comodidades;


    public JatoPrivado(int numSerie, String modelo, int anoFabrico, double pesoKg, double compFuselagem, double enverAsas, double hCauda, int numMotores, double autonomiaKm, double velMax, double preco, int lotacao, double capacidadeBagagem, CategoriaJato categoria) {
        super(numSerie, modelo, anoFabrico, pesoKg, compFuselagem, enverAsas, hCauda, numMotores, autonomiaKm, velMax, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.comodidades = new ArrayList<InstalacaoJato>();
    }

    public void adicionarInstalacao(InstalacaoJato instalacaoNova) {
        this.comodidades.add(instalacaoNova);
    }

    public void removerInstalacao(InstalacaoJato instalacaoRemover) {
        this.comodidades.remove(instalacaoRemover);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("lotacao: " + this.lotacao + " | capacidadeBagagem: " + this.capacidadeBagagem);
        System.out.println("comodidades: " + this.comodidades);
    }
}
