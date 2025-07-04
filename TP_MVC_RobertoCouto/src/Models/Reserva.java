package Models;

public class Reserva {
    private String idReserva;
    private String numQuarto;
    private String idCliente;
    private int ano;
    private int mes;
    private int semana;

    public Reserva(String idReserva, String numQuarto, String idCliente, int ano, int mes, int semana) {
        this.idReserva = idReserva;
        this.numQuarto = numQuarto;
        this.idCliente = idCliente;
        this.ano = ano;
        this.mes = mes;
        this.semana = semana;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public String getNumQuarto() {
        return numQuarto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getSemana() {
        return semana;
    }
}
