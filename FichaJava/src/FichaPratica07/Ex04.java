package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex04 {

    /**
     * lê e divide o conteudo em um vetor e imprime cada elemento na consola
     * @param seccao
     * @throws FileNotFoundException
     */
    public static void lerFicheiroCSV(String seccao) throws FileNotFoundException {

        File ficheiro = new File (seccao);
        Scanner in = new Scanner(ficheiro);

        while (in.hasNextLine()){
            String linha = in.nextLine();
            String[] itensDaLista = linha.split(";");
            for (int i = 0; i < itensDaLista.length; i++) {
                System.out.println(itensDaLista[i]);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        lerFicheiroCSV("Ficheiros/exercicio_04.csv");
    }
}
