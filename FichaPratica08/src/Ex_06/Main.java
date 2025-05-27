package Ex_06;

public class Main {
    public static void main(String[] args) {

        Livro liv1 =new Livro("Harry Potter and the philosopher's phone", "J.K. Rowling", "fiction", 352,7);
        Livro liv2 =new Livro("The Fellowship of the ring", "J.R.R. Tolkien", "fiction", 423,20);

        liv1.exibirDetalhes();
        liv2.exibirDetalhes();
    }
}
