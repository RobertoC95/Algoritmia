package Ex_03;

public class Texto extends Document{


    public Texto(String autor, String nome, String tipoDocumento) {
        super(autor, nome, tipoDocumento);
    }

    @Override
    public void close() {
        super.close();
        System.out.println("A fechar o documento de " + tipoDocumento + ".");
    }

    @Override
    public void open() {
        super.open();
        System.out.println("A abrir documento de " + tipoDocumento + " " + nome + "docx.");
    }

    @Override
    public void save() {
        super.save();
        System.out.println("Alterações do " + autor + " gravadas.");

    }

}
