package Ex_03;

import Ex_03.Pizzaria.Enum.Tamanho;
import Ex_03.Pizzaria.Enum.UnidadeMedida;

public class Main {

    public static void main(String[] args) {

        Pizza p1 = new Pizza(12345, "dasd", "asda", 13.50, Tamanho.GRANDE);

        Ingrediente ig1 = new Ingrediente(10, UnidadeMedida.GRAMAS, 10);

        p1.addIngrediente(ig1, 150);


        p1.nCalorias();

        p1.removeIngrediente(10);
        p1.nCalorias();
    }
}
