package Ex_03;

import Ex_01.AVIAO.Aviao;
import Ex_03.Pizzaria.Enum.Tamanho;

import java.util.ArrayList;

public class Pizza {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private Tamanho tamanho;
    private ArrayList<IngredientePizza> listaIng;

    public Pizza(int codigo, String nome, String descricao, double preco, Tamanho tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.listaIng = new ArrayList<IngredientePizza>();
    }

    public void addIngrediente(Ingrediente ingNovo, double quant) {

        if (this.listaIng.size() < 5) {
            IngredientePizza ip = new IngredientePizza(ingNovo, quant);
            this.listaIng.add(ip);
        }

    }

    public void editarIngrediente(IngredientePizza ing, double quant) {
        for(IngredientePizza ingAtual : this.listaIng){
            if(ingAtual.getIng().equals(ing)){
                ing.setQuant(quant);
            }
        }

    }

    public void removeIngrediente(int removerIng) {
        for (IngredientePizza ing : this.listaIng){
            if(ing.getIng().getCodigo() == removerIng){
                this.listaIng.remove(ing);
                return;
            }
        }
    }

    public void nCalorias() {
        double nCal = 0;
        for (IngredientePizza ing : this.listaIng){

            nCal += ing.getQuant() * ing.getIng().getCalUn();
        }
        System.out.println(nCal);
    }

    public void exibirDetalhes(){
        System.out.println("*** " + this.nome);
    }


}
