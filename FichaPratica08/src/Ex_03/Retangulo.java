package Ex_03;

public class Retangulo {

    private String cor;
    private double largura;
    private double comprimento;


    public Retangulo(String cor, double largura, double comprimento) {

        this.cor = cor;
        this.largura = largura;
        this.comprimento = comprimento;

    }

    public String getCor() {
        return this.cor;
    }

    public double getLargura() {
        return this.largura;
    }

    public double getComprimento() {
        return this.comprimento;
    }

    public double getPerimetro() {
        return (largura * 2) + (comprimento * 2);
    }

    public double getArea() {
        return  largura * comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

}
