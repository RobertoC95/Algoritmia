package Ex_08;

public class Produto {

    private String nome;
    private double preco;
    private int stock = 0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getStock() {
        return this.stock;
    }

    public void setPreco(double preco) {
        this.stock = stock;
    }

    public void setStock(int stock) {
        this.stock = stock ;
        System.out.println("Stock adicionado com sucesso " + nome +" " + (stock));
    }

    public void venderProduto(int quantidade) {

        if (this.stock >= quantidade) {
            this.stock = stock - quantidade;
            System.out.println("Compra efetuada com sucesso, total da compra " + (preco*quantidade));
        }else{
            System.out.println("Não temos stock para isso tudo por isso nao levas nada");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Stock: " + stock);
        System.out.println();
    }

}
