package Ex_08;

public class Main {

    public static void main(String[] args) {

        Produto p1= new Produto("pao" , 0.15);
        Produto p2= new Produto("arroz" , 1.20);
        Produto p3= new Produto("massa" , .95);

        p1.exibirDetalhes();
        p2.exibirDetalhes();
        p3.exibirDetalhes();

        p1.setStock(100);
        p2.setStock(100);
        p3.setStock(100);
        System.out.println();

        p1.exibirDetalhes();
        p2.exibirDetalhes();
        p3.exibirDetalhes();
        System.out.println();

        p1.venderProduto(20);

        p2.venderProduto(150);

        p3.setPreco(.80);
        p3.venderProduto(15);

        System.out.println();
        p1.exibirDetalhes();
        p2.exibirDetalhes();
        p3.exibirDetalhes();

    }
}
