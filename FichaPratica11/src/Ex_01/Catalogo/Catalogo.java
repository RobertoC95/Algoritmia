package Ex_01.Catalogo;

import Ex_01.AVIAO.Aviao;
import Ex_01.AVIAO.AviaoCombate;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Aviao> catalogo;

    public Catalogo() {
        this.catalogo = new ArrayList<Aviao>();
    }

    public void adicionarAviao(Aviao novoAviao) {
        this.catalogo.add(novoAviao);
    }

    public void venderAviao(Aviao novoAviao) {
        this.catalogo.remove(novoAviao);
    }

    public void valorCatalogo() {
        double total = 0;
        for (Aviao catalogo : this.catalogo) {
            total += catalogo.getPreco();
        }
        System.out.println("\nValor do catálogo: " + total + "€");
    }

    public void listarCatalogo() {
        System.out.println("\n\n*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_* Catálogo de Aviões Disponíveis *_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        for (Aviao aviaoAtual : this.catalogo) {
            System.out.print("\n✈ ");
            aviaoAtual.exibirDetalhes();
        }
    }
    public void imprimirCatalogoCombate(){
        System.out.println("\n\n*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_* \uD83E\uDDE8 Catálogo de Aviões de Combate Disponíveis \uD83E\uDDE8 *_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        for (Aviao aviaoAtual : this.catalogo) {

            if(aviaoAtual instanceof AviaoCombate){
                AviaoCombate ac = (AviaoCombate) aviaoAtual;
                System.out.print("\n✈ ");
                ac.exibirDetalhes();
                ac.demonstrarArsenal();
            }

        }
    }
}
