package Ex_10;

public class ContaBancaria {

    private String titular;
    private int iban;
    private double saldo = 0;


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
        System.out.println();
    }


}
