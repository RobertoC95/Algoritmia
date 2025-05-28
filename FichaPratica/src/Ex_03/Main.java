package Ex_03;

public class Main {

    public static void main(String[] args) {

        String[] alimentacao={"pão", "queijo", "fiambre", "bolachas","maçã"};
        Animal a1= new Animal("bobi", "cao", "portugal",2, alimentacao[0], ReinoAnimal.MAMIFERO );
        Animal a2= new Animal("Freedom eagle", "cao", "portugal",2, alimentacao[1], ReinoAnimal.AVE );
        Animal a3= new Animal("hypno frog", "cao", "portugal",2, alimentacao[2], ReinoAnimal.ANFIBIO );
        Animal a4= new Animal("Mr. Fish", "cao", "portugal",2, alimentacao[3], ReinoAnimal.PEIXE );
        Animal a5= new Animal("arbok", "cao", "portugal",2, alimentacao[4], ReinoAnimal.REPTIL );

        a1.exibirDetalhes();
        a1.comer("pão",50);
        a1.exibirDetalhes();
    }
}
