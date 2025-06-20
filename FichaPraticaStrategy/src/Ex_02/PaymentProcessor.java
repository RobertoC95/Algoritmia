package Ex_02;

public class PaymentProcessor {
    private DiscoutStrategy descontoAplicado;

    public PaymentProcessor(DiscoutStrategy descontoAplicado) {
        this.descontoAplicado = descontoAplicado;
    }



    public DiscoutStrategy getDescontoAplicado() {
        return descontoAplicado;
    }


    public void setDescontoAplicado(DiscoutStrategy descontoAplicado) {
        this.descontoAplicado = descontoAplicado;
    }

    public double calculateTotal(double valor){
        return this.descontoAplicado.calculateTotal(valor);
    }

}
