package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex02 {

    /**
     * função para escrever uma mensagem num novo ficheiro
     * @param caminho indica onde vai atuar o printwriter
     * @param mensagem indica o que vai ser escrito no ficheiro
     * @throws FileNotFoundException caso o ficheiro não exista
     */
    public static void escreverFicheiro(String caminho, String mensagem) throws FileNotFoundException {

        File ficheiro = new File(caminho);
        PrintWriter printWriter = new PrintWriter(ficheiro);

        printWriter.println(mensagem);

        printWriter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        escreverFicheiro("Ficheiros/exercicio_02.txt", "du du dudu MAX VERSTAPPEN");
    }
}
