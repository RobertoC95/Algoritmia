package Ex_01;

import static Ex_01.TipoCombustivel.Diesel;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabrico;
    private int potencia;
    private double cilindrada;
    private TipoCombustivel combustivel;
    private double consumo100km;


    public Carro(String marca, String modelo, String cor, int anoFabrico, int potencia, double cilindrada, TipoCombustivel combustivel, double consumo100km) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.consumo100km = consumo100km;
    }

    public void ligar() {

        if (this.anoFabrico < 1995) {
            if (this.combustivel == Diesel) {
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            } else {
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }
        } else {
            if (this.potencia < 250) {
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmmmmmmmmmmm");
            } else {
                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMMMMMMMMMMMMM");
                System.out.println("PARECE UM IBIZA");
            }
        }

    }

    public Carro corrida(Carro c1) {


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
        double consumo = (consumo100km * distancia) / 100;
        System.out.println("Numa viagem de " + distancia + "km o carro consome " + consumo + "l");
    }

    public void exibirDetlhes(){

        System.out.println(this.marca + " " + this.modelo + " " + this.cor);
    }

}
