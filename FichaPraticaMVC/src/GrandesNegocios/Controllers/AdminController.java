package GrandesNegocios.Controllers;

import GrandesNegocios.Models.Sale;
import GrandesNegocios.Repositories.SalesRepository;

import java.io.FileNotFoundException;

public class AdminController {
    private SalesRepository salesRepository;

    public AdminController() throws FileNotFoundException {
        this.salesRepository = new SalesRepository();
    }

    public double totalSalesValue() {

        double totalSalesValue = 0;

        for (Sale saleAtual : this.salesRepository.getSalesArray()) {

            totalSalesValue += saleAtual.getQuantidadeVendida() * saleAtual.getPrecoUnitario();

        }
        return totalSalesValue;
    }


    public void mostSales() {


        String nomeProduto = "";
        double nVendasTotal = 0;

        for (Sale saleAtual : this.salesRepository.getSalesArray()) {

            double nVendas = saleAtual.getQuantidadeVendida();
            nomeProduto = saleAtual.getProduto();

            for (Sale saleAtual2 : this.salesRepository.getSalesArray()) {

                if (nomeProduto.equals(saleAtual2.getProduto())) {
                    nVendas += saleAtual2.getQuantidadeVendida();
                }

            }
            if (nVendas > nVendasTotal) {
                nVendasTotal = nVendas;

            }

        }

       // System.out.println("O produto com o maior numero de vendas é " + nomeProduto + " com " + nVendasTotal + " unidades vendidas.");
    }

    public void mostMoneyMade() {

        String nomeProduto = "";
        double valorVendas = 0;
        double valorVendasTotal = 0;

        for (Sale saleAtual : this.salesRepository.getSalesArray()) {

            nomeProduto = saleAtual.getProduto();
            valorVendas = 0;

            for (Sale saleAtual2 : this.salesRepository.getSalesArray()) {

                if (nomeProduto.equals(saleAtual2.getProduto())) {
                    valorVendas += saleAtual.getPrecoUnitario() * saleAtual.getQuantidadeVendida();
                }

            }
            if (valorVendas > valorVendasTotal) {
                valorVendasTotal = valorVendas;

            }

        }

        System.out.println("O produto com o maior valor em vendas é " + nomeProduto + " com " + valorVendasTotal + "€.");
    }

}
