package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex05 {

    public static void dividirTextoEspacos(String seccao) throws FileNotFoundException {

        File ficheiro = new File(seccao);
        Scanner in = new Scanner(ficheiro);
        double total = 0;

        while (in.hasNextLine()) {
            String linha = in.nextLine();
            String[] itensDaLista = linha.split(" ");
            for (int i = 0; i < itensDaLista.length; i++) {
                total += Double.parseDouble(itensDaLista[i]);
            }
        }
        System.out.println("A soma dos elementos no ficheiro " + seccao + " é: " + total);
    }

    public static void main(String[] args) throws FileNotFoundException {

        dividirTextoEspacos("Ficheiros/exercicio_05_31.txt");
        dividirTextoEspacos("Ficheiros/exercicio_05_1999.txt");
    }
}
