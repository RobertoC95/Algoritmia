package Ex_03;


public class Factory {

    public static Document criarDocument(String autor, String nome, int TipoDocumento) {

        switch (TipoDocumento) {
            case 1:

                return new Texto(autor, nome, "Texto");
            case 2:
                return new Apresentacao(autor, nome, "Apresentação" );
            case 3:
                return new Folha_de_Calculo(autor, nome, "Folha de Calculo" );

            default:
                throw new IllegalArgumentException("Tipo de Produto não reconhecido");
        }

    }
}
