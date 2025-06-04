package Ex_01.AVIAO;

import Ex_01.ENUMERACAO.Arma;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {

    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Arma> arsenal;


    public AviaoCombate(int numSerie, String modelo, int anoFabrico, double pesoKg, double compFuselagem, double enverAsas, double hCauda, int numMotores, double autonomiaKm, double velMax, double preco, String paisOrigem, boolean camuflagem) {
        super(numSerie, modelo, anoFabrico, pesoKg, compFuselagem, enverAsas, hCauda, numMotores, autonomiaKm, velMax, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal = new ArrayList<Arma>();

    }

    public void adicionarArma(Arma armaNova){
        if (this.arsenal.size() < 3){
            this.arsenal.add(armaNova);
        }else
            System.out.println("Cada avião apenas pode ter 3 armas equipadas");

    }

    public void removerArmas(Arma armaRemover ){
        this.arsenal.remove(armaRemover);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("País Origem: " + this.paisOrigem + " | Camuflagem: " + this.camuflagem);
        System.out.println("Arsenal: " + this.arsenal);
    }

    public void demonstrarArsenal(){
        System.out.println("\uD83E\uDDE8\uD83E\uDDE8\uD83E\uDDE8\uD83E\uDDE8\uD83E\uDDE8\uD83E\uDDE8\uD83E\uDDE8\uD83E\uDDE8");
    }

}
