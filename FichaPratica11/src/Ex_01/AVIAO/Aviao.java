package Ex_01.AVIAO;

public class Aviao {
    private int numSerie;
    private String modelo;
    private int anoFabrico;
    private double pesoKg;
    private double compFuselagem;
    private double enverAsas;
    private double hCauda;
    private int numMotores;
    private double autonomiaKm;
    private double velMax;
    private double preco;


    public Aviao(int numSerie, String modelo, int anoFabrico, double pesoKg, double compFuselagem, double enverAsas, double hCauda, int numMotores, double autonomiaKm, double velMax, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.pesoKg = pesoKg;
        this.compFuselagem = compFuselagem;
        this.enverAsas = enverAsas;
        this.hCauda = hCauda;
        this.numMotores = numMotores;
        this.autonomiaKm = autonomiaKm;
        this.velMax = velMax;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println(this.modelo + " | " + this.anoFabrico + " | " + this.numSerie + " | Preço: " + this.preco + " €");
        System.out.println("Específicações Técnicas - Peso: " + this.pesoKg + " Kg. | Cmp. Fuselagem: " + this.compFuselagem + " m. | Env. Asas: " + this.enverAsas + " m.");
        System.out.println("Características - Num. Motores: " + this.numMotores + " | Autonomia: " + this.autonomiaKm + " Km. | Vel. Máx: " + this.velMax + " Km/h");

    }

    public double getPreco() {
        return preco;
    }
}
