package Ex_03;

import static Ex_03.ReinoAnimal.*;

public class Animal {


    private String nome;
    private String especie;
    private String origem;
    private double peso;
    private String[] alimentacao;
    private ReinoAnimal reino;


    public Animal(String nome, String especie, String origem, double peso, String alimentacao, ReinoAnimal reino) {
        this.nome = nome;
        this.especie = especie;
        this.origem = origem;
        this.alimentacao = new String[]{alimentacao};
        this.reino = reino;
    }

    public void fazerBarulho() {
        if (reino == MAMIFERO) {
            System.out.println("Tinoninoninoni");
        }
        if (reino == ANFIBIO) {
            System.out.println("Brrrrrrrrr");
        }
        if (reino == AVE) {
            System.out.println("kwak kwak");
        }
        if (reino == PEIXE) {
            System.out.println("Blub blub splash");
        }
        if (reino == REPTIL) {
            System.out.println("arrrrrrbok");
        }
    }

    public void comer(String alimento, double pesoAlimento) {
        boolean comeu = false;
        for (int i = 0; i < alimentacao.length; i++) {
            if (alimento.equals(alimentacao[i])) {
                comeu = true;
                break;
            }
        }
        if (comeu) {
            fazerBarulho();
            peso = peso + (.001 *pesoAlimento);
            System.out.println("O " + especie + " " + nome + " comeu o " + alimento);
        }else{
            System.out.println("O " + especie + " " + nome + " não comeu o " + alimento);
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Especie: " + especie);
        System.out.println("Origem: " + origem);
        System.out.println("Peso: " + peso);
        System.out.println("Alimentação: " + alimentacao);
        System.out.println("Reino: " + reino);

        System.out.println();
    }

}
