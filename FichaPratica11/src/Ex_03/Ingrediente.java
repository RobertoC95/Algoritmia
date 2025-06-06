package Ex_03;

import Ex_03.Pizzaria.Enum.UnidadeMedida;

public class Ingrediente {
    private int codigo;
    private UnidadeMedida unMedida;
    private double CalUn;


    public Ingrediente(int codigo, UnidadeMedida unMedida, double calUn) {
        this.codigo = codigo;
        this.unMedida = unMedida;
        this.CalUn = calUn;
    }

    public double getCalUn() {
        return CalUn;
    }

    public int getCodigo() {
        return codigo;
    }
}
