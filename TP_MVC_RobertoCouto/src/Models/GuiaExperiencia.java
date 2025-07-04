package Models;

public class GuiaExperiencia {
    private String idGuiaExp;
    private String nome;
    private String nacionalidade;
    private String email;
    private String nTelemovel;

    public GuiaExperiencia(String id, String nome, String nacionalidade, String email, String nTelemovel) {
        this.idGuiaExp = idGuiaExp;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.email = email;
        this.nTelemovel = nTelemovel;
    }

    public String getIdGuiaExp() {
        return idGuiaExp;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getEmail() {
        return email;
    }

    public String getnTelemovel() {
        return nTelemovel;
    }
}
