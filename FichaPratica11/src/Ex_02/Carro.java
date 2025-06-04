package Ex_02;

public class Carro extends Veiculo {
    private int quantPassageiros;


    public Carro(String marca, String modelo, int anoFabrico, double potencia, double cilindrada, TipoCombustivel combustivel, double consumo) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, combustivel, consumo);
    }

    
}
