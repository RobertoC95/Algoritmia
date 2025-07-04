package Models;

public class User {
    private String username;
    private String password;
    private String tipoAcesso;

    public User(String username, String password, String tipoAcesso) {
        this.username = username;
        this.password = password;
        this.tipoAcesso = tipoAcesso;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTipoAcesso() {
        return tipoAcesso;
    }
}
