package Ex_02;

public class ContaBancaria {

    private String titular;
    private int iban;
    private double saldo = 0;
    private int anoAbertura = 2025;
    private double margemEmprestimo = 0.5;
    private double valorEmDivida = 0;


    public ContaBancaria(String titular, int iban) {
        this.titular = titular;
        this.iban = iban;
    }

    public void depositar(double valor) {

        this.saldo += valor;

    }

    public void levantar(double valor) {

        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println(valor + "€ levantados da conta " + iban);
        } else {
            System.out.println("saldo insufuciente na conta " + iban + ". Levantamento de " + valor + "€ foi recusado");
        }
    }

    public void transferencia(ContaBancaria c2, double valor) {

        if (valor <= this.saldo) {
            this.levantar(valor);
            c2.depositar(valor);
            System.out.println("Transferencia efetuada com sucesso " + valor + "€ depositados na conta " + c2.iban);
        } else {
            System.out.println("Saldo insufuciente na conta " + this.iban + " Transferencia de " + valor + "€ para a conta" + c2.iban + " recusado");
        }


    }

    public void exibirDetalhes() {
        System.out.println("Titular: " + titular);
        System.out.println("iban: " + iban);
        System.out.println("saldo: " + saldo + "€");
        System.out.println("valor em Divivda: " + valorEmDivida + "€");
        System.out.println();
    }

    public void pedirEmprestimo(double valor) {

        if (valorEmDivida > 0) {
            System.out.println("Já tens um emprestimo ativo. Paga o que deves primeiro!");

        } else if (valor > (saldo * margemEmprestimo)) {
            System.out.println(valor + "€ demsaiado alto, emprestimo negado");
        } else {
            saldo += valor;
            valorEmDivida += valor;
        }

    }

    public void amortizarEmprestimo(double valor) {

        if (valor > valorEmDivida && saldo >= valorEmDivida) {
            saldo -= valorEmDivida;
            valorEmDivida = 0;
            System.out.println("Valor maior do que a divida, a divida foi completamneta amortizada e o seu no saldo é " + saldo + "€");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            valorEmDivida -= valor;
            System.out.println(valor + " amortizado na sua divida, divida restante " + valorEmDivida);
        }

    }

}
