package Models;

public class Cliente {
    private String idC;
    private String nome;
    private String email;
    private String telemovel;
    private String dataNascimento;
    private boolean consMark;


    public Cliente(String id, String nome, String email, String telemovel, String dataNascimento, boolean consMark) {
        this.idC = idC;
        this.nome = nome;
        this.email = email;
        this.telemovel = telemovel;
        this.dataNascimento = dataNascimento;
        this.consMark = consMark;
    }

    public String getIdC() {
        return idC;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public boolean isConsMark() {
        return consMark;
    }
}
