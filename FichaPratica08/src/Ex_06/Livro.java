package Ex_06;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private int nPaginas;
    private int isbn;

    public Livro(String titulo, String autor, String categoria, int nPaginas, int isbn) {

        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.nPaginas = nPaginas;
        this.isbn = isbn;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo );
        System.out.println("Titulo: " + autor );
        System.out.println("Titulo: " + categoria );
        System.out.println("Titulo: " + nPaginas );
        System.out.println("Titulo: " + isbn );
        System.out.println();
    }
}
