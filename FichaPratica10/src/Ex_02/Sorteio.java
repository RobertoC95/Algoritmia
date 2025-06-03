package Ex_02;

import Ex_01.Musica;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private String nome;
    private double premio;
    private ArrayList<Pessoa> participante;

    public Sorteio(String nome, double premio) {
        this.nome = nome;
        this.premio = premio;
        this.participante = new ArrayList<Pessoa>();
    }

    public void inscreverParticipante(Pessoa novoParticipante){
        if(novoParticipante.getIdade() > 17){
            this.participante.add(novoParticipante);
            System.out.println("Participante inscrito com sucesso");
        }else
            System.out.println("Sorteio apenas para maiores de idade");
    }

    public Pessoa sortear(){

        Random rd = new Random();
        return participante.get(rd.nextInt(this.participante.size()));
    }

    public void imprimirDetalhesForEach() {
        for (Pessoa novoParticipante : this.participante) {
            novoParticipante.exibirDetalhes();
        }
    }

}

