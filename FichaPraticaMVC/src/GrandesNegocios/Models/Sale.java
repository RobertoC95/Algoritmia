package GrandesNegocios.Models;

public class Sale {
    private String tipoProduto;
    private String produto ;
    private Double quantidadeVendida ;
    private Double precoUnitario;

    public Sale(String tipoProduto, String produto, Double quantidadeVendida, Double precoUnitario) {
        this.tipoProduto = tipoProduto;
        this.produto = produto;
        this.quantidadeVendida = quantidadeVendida;
        this.precoUnitario = precoUnitario;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public String getProduto() {
        return produto;
    }

    public Double getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }
}
