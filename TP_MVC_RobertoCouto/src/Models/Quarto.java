package Models;

public class Quarto {
    private String numQuarto;
    private String idTipologia;

    public Quarto(String numQuarto, String idTipologia) {
        this.numQuarto = numQuarto;
        this.idTipologia = idTipologia;
    }

    public String getNumQuarto() {
        return numQuarto;
    }

    public String getIdTipologia() {
        return idTipologia;
    }
}
