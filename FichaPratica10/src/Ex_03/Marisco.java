package Ex_03;

public class Marisco {
    private String especie;
    private double peso;
    private double precoKG;


    public Marisco(String especie, double peso, double precoKG) {
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
