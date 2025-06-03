package Ex_03;

public class Peixe {
    private String especie;
    private double peso;
    private double precoKG;

    public Peixe(String especie, double peso, double precoKG) {
        this.especie = especie;
        this.peso = peso;
        this.precoKG = precoKG;
    }

    public double getPeso(){
        return this.peso;
    }

    public double getPrecoKG(){
        return this.precoKG;
    }

}

