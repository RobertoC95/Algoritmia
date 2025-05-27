package Ex_04;

public class Circulo {

    private double raio;
    private String cor;

    public Circulo(double raio, String cor) {

        this.raio = raio;
        this.cor = cor;
    }

    public double getRaio() {
        return this.raio;
    }

    public String getCor() {
        return this.cor;
    }

    public double getArea() {
        return 3.14159 * (raio * raio);
    }

    public double getPerimetro() {
        return 2 * 3.14159 * raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
