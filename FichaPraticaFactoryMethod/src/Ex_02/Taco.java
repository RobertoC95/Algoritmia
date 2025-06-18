package Ex_02;

public abstract class Taco {
    protected String descricao;

    public Taco(String descricao) {
        this.descricao = descricao;
    }

    public void Prepare(){
        System.out.println("A preparar taco de " + descricao);
    }

    public void Bake(){
        System.out.println("A cozinhar taco de " + descricao);
    }

    public void Box(){
        System.out.println("A embalar taco de " + descricao);
    }




}

