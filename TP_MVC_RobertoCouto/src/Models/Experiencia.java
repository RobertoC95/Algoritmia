package Models;

public class Experiencia {
    private String idE;
    private String nome;
    private String idGuiaExp;
    private int precoA;
    private int precoC;

    public Experiencia(String id, String nome, String idGuiaExp, int precoA, int precoC) {
        this.idE = id;
        this.nome = nome;
        this.idGuiaExp = idGuiaExp;
        this.precoA = precoA;
        this.precoC = precoC;
    }

    public String getIdE() {
        return idE;
    }

    public String getNome() {
        return nome;
    }

    public String getIdGuiaExp() {
        return idGuiaExp;
    }

    public int getPrecoA() {
        return precoA;
    }

    public int getPrecoC() {
        return precoC;
    }
}
