package Ex_02;

public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabrico;
    private double potencia;
    private double cilindrada;
    private TipoCombustivel combustivel;
    private double consumo;


    public Veiculo(String marca, String modelo, int anoFabrico, double potencia, double cilindrada, TipoCombustivel combustivel, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.consumo = consumo;
    }

    public double getConsumo() {
        return consumo;
    }

    public TipoCombustivel getCombustivel() {
        return combustivel;
    }

    public void ligar() {
        System.out.println("vrumm");
    }

    public Veiculo corrida(Veiculo c1) {
        if (this.potencia > c1.potencia) {

            return this;
        } else if (this.potencia == c1.potencia && this.cilindrada > c1.cilindrada) {

            return this;
        } else if (this.potencia == c1.potencia && this.cilindrada > c1.cilindrada && this.anoFabrico > c1.anoFabrico) {

            return this;
        } else if (this.potencia == c1.potencia && this.cilindrada == c1.cilindrada && this.anoFabrico == c1.anoFabrico) {

            return null;
        } else

            return c1;
    }

    public void calcularConsumo(double distancia) {

        double consumo = (this.getConsumo() * distancia) / 100;

    }



}



