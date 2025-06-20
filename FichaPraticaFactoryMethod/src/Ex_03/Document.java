package Ex_03;

public abstract class Document {
    protected String autor;
    protected String nome;
    protected String tipoDocumento;



    public Document(String autor, String nome, String tipoDocumento) {
        this.autor = autor;
        this.nome = nome;
        this.tipoDocumento = tipoDocumento;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getAutor() {
        return autor;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void open() {


    }

    public void save() {

    }

    public void close(){

    }

}
