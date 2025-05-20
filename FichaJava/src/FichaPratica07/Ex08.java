package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex08 {

    public static int totalDeVendas(String seccao) throws FileNotFoundException {

        File ficheiro = new File(seccao);
        Scanner sc = new Scanner(ficheiro);
        int total = 0;

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] itensDaLista = linha.split(",");


            if (seccao.equals(itensDaLista[2])) {
                total += (Integer.parseInt(itensDaLista[2]) * Integer.parseInt(itensDaLista[3]));
                System.out.println(total);
            }
        }
        return total;
    }

    public static void main(String[] args) throws FileNotFoundException {
        int total;

        total = totalDeVendas("Ficheiros/exercicio_08.csv");
        System.out.println(total);
    }
}
