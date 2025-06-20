package Ex_03;

public class Folha_de_Calculo extends Document{

    public Folha_de_Calculo(String autor, String nome, String tipoDocumento) {
        super(autor, nome, tipoDocumento);
    }

    @Override
    public void close() {
        super.close();
        System.out.println("A fechar o documento de " + tipoDocumento);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("A abrir documento de " + tipoDocumento + " " + nome + ".pptx");
    }

    @Override
    public void save() {
        super.save();
        System.out.println("Alterações do " + autor + " gravadas.");

    }
}
