package Ex_03;

import Ex_02.Pessoa;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome;
    private String cor;
    private String anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscoPescado;
    private Marca marca;


    public BarcoPesca(String nome, String cor, String anoFabrico, int tripulacao, double capacidadeCarga, Marca marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.peixesPescados = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
        this.marca = marca;
    }

    public double cargaNoBarco() {
        double pesoTotal = 0;
        for (Peixe peixePescado : this.peixesPescados) {

            pesoTotal += peixePescado.getPeso();

        }
        for (Marisco mariscoPescado : this.mariscoPescado) {

            pesoTotal += mariscoPescado.getPeso();

        }
        System.out.println(pesoTotal + "kg");
        return pesoTotal;
    }


    public void pescarPeixe(Peixe novoPeixe) {
        if (cargaNoBarco() < capacidadeCarga && cargaNoBarco() + novoPeixe.getPeso() < capacidadeCarga) {
            this.peixesPescados.add(novoPeixe);
            System.out.println("what a catch");
        } else
            System.out.println("The boat has reach full capacity, no space for that fish");
    }

    public void pescarMarisco(Marisco novoMarisco) {
        if (cargaNoBarco() < capacidadeCarga && cargaNoBarco() + novoMarisco.getPeso() < capacidadeCarga) {
            this.mariscoPescado.add(novoMarisco);
            System.out.println("what a catch");
        } else
            System.out.println("The boat has reach full capacity, no space for that fish");
    }

    public void largarPeixe(int indiceRemover) {
        this.peixesPescados.remove(indiceRemover);
    }

    public void largarMarisco(int indiceRemover) {
        this.mariscoPescado.remove(indiceRemover);
    }

    public double calcularTotal() {
        double valorTotal = 0;
        for (Peixe peixePescado : this.peixesPescados) {

            valorTotal += (peixePescado.getPeso() * peixePescado.getPrecoKG());
        }
        for (Marisco mariscoPescado : this.mariscoPescado) {

            valorTotal += (mariscoPescado.getPeso() * mariscoPescado.getPrecoKG());
        }
        return valorTotal;
    }

    public void salarioTripulacao() {

        double salario = (calcularTotal() * .6) / tripulacao;

        System.out.println("O salário de cada membro da tripulação é: " + salario + "€");
    }

}