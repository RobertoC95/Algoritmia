package Ex_03;

public class IngredientePizza {
    Ingrediente ing;
    private double quant;


    public IngredientePizza(Ingrediente ing, double quant) {
        this.ing = ing;
        this.quant = quant;
    }

    public void setQuant(double quant) {
        this.quant = quant;
    }

    public double getQuant() {
        return quant;
    }

    public Ingrediente getIng() {
        return ing;
    }
}
