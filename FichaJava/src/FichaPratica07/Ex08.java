package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex08 {

    public static void totalDeVendas(String seccao) throws FileNotFoundException {

        File ficheiro = new File(seccao);
        Scanner sc = new Scanner(ficheiro);
        double total = 0;
        String linha = sc.nextLine();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLista = linha.split(",");

            total += (Double.parseDouble(itensDaLista[2]) * Double.parseDouble(itensDaLista[3]));

        }
        System.out.println("O total de vendas é: " + total);
    }

    public static void main(String[] args) throws FileNotFoundException {
        double total;

        totalDeVendas("Ficheiros/exercicio_08.csv");
    }
}
