package Ex_10;

public class Main {

    public static void main(String[] args) {

        ContaBancaria c1 =new ContaBancaria("Roberto", 12345);
        ContaBancaria c2= new ContaBancaria("Francisco", 67890);

        c1.exibirDetalhes();
        c2.exibirDetalhes();

        c1.depositar(2000);
        c1.exibirDetalhes();
        c2.exibirDetalhes();


        c1.levantar(50);

        c1.exibirDetalhes();
        c2.exibirDetalhes();

        c1.levantar(2500);

        c1.exibirDetalhes();
        c2.exibirDetalhes();

        c1.transferencia(c2,3544);
        c1.exibirDetalhes();
        c2.exibirDetalhes();

        c1.transferencia(c2,250);
        c1.exibirDetalhes();
        c2.exibirDetalhes();


    }


}
