package Ex_04;

public class Main {

    public static void main(String[] args) {

        Imovel imovel1 = new Imovel("rua do pinheiro", 9, "Esposende", TipoImovel.CASA, TipoAcabamento.NOVA, 600, 4, 4, 50);
        Imovel imovel2 = new Imovel("rua do pinheiro", 9, "Esposende", TipoImovel.APARTAMENTO, TipoAcabamento.NOVA, 600, 4, 4, 0);




        imovel2.setAcabamento(TipoAcabamento.NOVA_COM_ALTO_ACABAMENTO);

        System.out.println();
        imovel1.compararImoveis(imovel2);



    }
}
