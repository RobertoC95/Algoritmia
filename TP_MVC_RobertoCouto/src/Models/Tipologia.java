package Models;

public class Tipologia {
    private String idTipologia;
    private String descricao;
    private int precoSemana;


    public Tipologia(String idTipologia, String descricao, int precoSemana) {
        this.idTipologia = idTipologia;
        this.descricao = descricao;
        this.precoSemana = precoSemana;
    }

    public String getIdTipologia() {
        return idTipologia;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPrecoSemana() {
        return precoSemana;
    }
}
