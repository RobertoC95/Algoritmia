package Models;

public class Venda {
    private String idVenda;
    private String idExp;
    private String tipoCliente;
    private String ano;
    private String mes;

    public Venda(String idVenda, String idExp, String tipoCliente, String ano, String mes) {
        this.idVenda = idVenda;
        this.idExp = idExp;
        this.tipoCliente = tipoCliente;
        this.ano = ano;
        this.mes = mes;
    }

    public String getIdVenda() {
        return idVenda;
    }

    public String getIdExp() {
        return idExp;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public String getAno() {
        return ano;
    }

    public String getMes() {
        return mes;
    }
}
