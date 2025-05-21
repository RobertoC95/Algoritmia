package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Ex07 {

    public static void numeroDeElementos(String todosElementos) throws FileNotFoundException {

        File ficheiro = new File(todosElementos);
        Scanner in = new Scanner(ficheiro);
        int numl = 0, nump = 0;

        while (in.hasNextLine()) {
            String linha = in.nextLine();
            numl++;
            String[] itensDaLista = linha.split(" ");
            for (int i = 0; i < itensDaLista.length; i++) {
                nump++;
            }
        }
        System.out.println("o texto contido no ficheiro tem " + numl + " linhas");
        System.out.println("o texto do ficheiro tem " + nump + " elementos");
    }

    public static int contarLinhas(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        Scanner in = new Scanner(ficheiro);
        int numl = 0;

        while (in.hasNextLine()) {
            in.nextLine();
            numl++;
            }
        return numl;
        }


    public static void main(String[] args) throws FileNotFoundException {

        numeroDeElementos("Ficheiros/exercicio_07.txt");

    }
}
