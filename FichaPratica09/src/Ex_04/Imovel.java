package Ex_04;

public class Imovel {

    private String rua;
    private int numeroPorta;
    private String cidade;
    private TipoImovel tipo;
    private TipoAcabamento acabamento;
    private double areaC;
    private int numeroQuartos;
    private int numeroCB;
    private double areaP;


    public Imovel(String rua, int numeroPorta, String cidade, TipoImovel tipo, TipoAcabamento acabamento, double areaC, int numeroQuartos, int numeroCB, double areaP) {
        this.rua = rua;
        this.numeroPorta = numeroPorta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.areaC = areaC;
        this.numeroQuartos = numeroQuartos;
        this.numeroCB = numeroCB;
        this.areaP = areaP;

    }

    public void exibirDetalhes() {
        System.out.println("rua: " + rua);
        System.out.println("numero da Porta: " + numeroPorta);
        System.out.println("cidade: " + cidade);
        System.out.println("tipo: " + tipo);
        System.out.println("acabamento: " + acabamento);
        System.out.println("area do imovel: " + areaC);
        System.out.println("numero de Quartos: " + numeroQuartos);
        System.out.println("numero de Casas de banho: " + numeroCB);
        calcularValor();

    }

    public double calcularValor() {

        double total = 0;

        if (this.tipo.equals(TipoImovel.APARTAMENTO)) {
            total = (this.areaC * 1000) + (this.numeroQuartos * 7500) + (this.numeroCB * 10500);

            if (this.acabamento.equals(TipoAcabamento.PARA_RESTAURO)) {
                System.out.println("Valor do apartamento : " + (total * 0.5) + "€");
            }
            if (this.acabamento.equals(TipoAcabamento.USADA)) {
                System.out.println("Valor do apartamento : " + (total * 0.9) + "€");
            }
            if (this.acabamento.equals(TipoAcabamento.NOVA)) {
                System.out.println("Valor do apartamento : " + total + "€");
            }
            if (this.acabamento.equals(TipoAcabamento.NOVA_COM_ALTO_ACABAMENTO)) {
                System.out.println("Valor do apartamento : " + (total * 1.25) + "€");
            }
        }


        if (this.tipo.equals(TipoImovel.CASA)) {
            total = (this.areaC * 1000) + (this.numeroQuartos * 7500) + (this.numeroCB * 10500) + (this.areaP * 1000);

            if (this.acabamento.equals(TipoAcabamento.PARA_RESTAURO)) {
                System.out.println("Valor da casa : " + (total * 0.5) + "€");
            }
            if (this.acabamento.equals(TipoAcabamento.USADA)) {
                System.out.println("Valor da casa : " + (total * 0.9) + "€");
            }
            if (this.acabamento.equals(TipoAcabamento.NOVA)) {
                System.out.println("Valor da casa : " + total + "€");
            }
            if (this.acabamento.equals(TipoAcabamento.NOVA_COM_ALTO_ACABAMENTO)) {
                System.out.println("Valor da casa : " + (total * 1.25) + "€");
            }
        }
        if (this.tipo.equals(TipoImovel.MANSAO)) {
            total = (this.areaC * 1000) + (this.numeroQuartos * 7500) + (this.numeroCB * 10500) + (this.areaP * 1000);

            if (this.acabamento.equals(TipoAcabamento.PARA_RESTAURO)) {
                System.out.println("Valor da mansão : " + (total * 0.5) + "€");
            }
            if (this.acabamento.equals(TipoAcabamento.USADA)) {
                System.out.println("Valor do mansão : " + (total * 0.9) + "€");
            }
            if (this.acabamento.equals(TipoAcabamento.NOVA)) {
                System.out.println("Valor do mansão : " + total + "€");
            }
            if (this.acabamento.equals(TipoAcabamento.NOVA_COM_ALTO_ACABAMENTO)) {
                System.out.println("Valor do mansão : " + (total * 1.25) + "€");
            }
        }
        return total;

    }


    public void setAcabamento(TipoAcabamento acabamento) {
        this.acabamento = acabamento;
    }


    public void compararImoveis(Imovel i1) {
        if (calcularValor() > i1.calcularValor()) {
            exibirDetalhes();
        }else {
            i1.exibirDetalhes();
        }
    }


}
