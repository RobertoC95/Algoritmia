package Ex_02;

public class Main {
    public static void main(String[] args) {

        ContaBancaria c1 =new ContaBancaria("Roberto", 12345);
        ContaBancaria c2= new ContaBancaria("Francisco", 67890);
        ContaBancaria c3= new ContaBancaria("O estupido", 46546);



        c1.depositar(20000);
        c2.depositar(12000);
        c3.depositar(3000);

        c1.exibirDetalhes();
        c2.exibirDetalhes();
        c3.exibirDetalhes();

        c3.pedirEmprestimo(2000);
        c1.pedirEmprestimo(7000);

        c1.exibirDetalhes();
        c3.exibirDetalhes();

        c1.levantar(13000);
        c1.exibirDetalhes();

        c1.amortizarEmprestimo(8000);
        c1.exibirDetalhes();
    }
}
