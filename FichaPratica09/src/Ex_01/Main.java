package Ex_01;

public class Main {

    public static void main(String[] args) {

        Carro c1 = new Carro("Ford", "fiesta", "preto", 1990, 100, 1.2, TipoCombustivel.Diesel, 7.5);
        Carro c2 = new Carro("Ford", "S-Max", "cinza", 1990, 100, 1.5, TipoCombustivel.Gasolina, 7.5);
        Carro c3 = new Carro("Lancia", "idk", "preto", 2020, 220, 1.2, TipoCombustivel.Diesel, 7.5);
        Carro c4 = new Carro("VW", "up", "cinzento", 2020, 250, 1.2, TipoCombustivel.Diesel, 7.5);

        System.out.println();
        c1.ligar();
        System.out.println();
        c2.ligar();
        System.out.println();
        c3.ligar();
        System.out.println();
        c4.ligar();

        System.out.println();
        Carro vencedor1 = c1.corrida(c2);
        System.out.println();
        Carro vencedor2 = c3.corrida(c4);
        System.out.println();
        vencedor1.corrida(vencedor2);

        vencedor1.corrida(vencedor2).exibirDetlhes();

        System.out.println();
        (vencedor1.corrida(vencedor2)).calcularConsumo(65);
    }
}
