package Ex_02;

public class Edificio {


    private String nome;
    private String rua;
    private String cidade;
    private String cor;
    private int andares;
    private boolean garagem;

    public Edificio(String nome, String rua, String cidade, String cor, int andares, boolean garagem) {
        this.nome = nome;
        this.rua = rua;
        this.cidade = cidade;
        this.cor = cor;
        this.andares = andares;
        this.garagem = garagem;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRua() {
        return this.rua;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getCor() {
        return this.cor;
    }

    public int getAndares() {
        return this.andares;
    }

    public boolean getGaragem() {
        return this.garagem;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}


