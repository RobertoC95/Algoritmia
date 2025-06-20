package Ex_03;

public class Apresentacao extends Document{
    public Apresentacao(String autor, String nome, String tipoDocumento) {
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
        System.out.println("A abrir documento de " + tipoDocumento + " " + nome + ".xlsx");
    }

    @Override
    public void save() {
        super.save();
        System.out.println("Alterações do " + autor + " gravadas.");

    }

}
