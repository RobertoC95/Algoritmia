package Ex_02;

public class Factory {


    public static Taco fazerTaco(int opcao, String descricao) {

            switch (opcao) {
                case 1:
                    return new Chicken(descricao);
                case 2:
                    return new Vaca(descricao);
                case 3:
                    return new Veggie(descricao);

                default:
                    throw new IllegalArgumentException("Tipo de Produto não reconhecido");
            }

    }
}


