package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex03 {

    /**
     * função para copiar conteudo de um ficheiro para o outro
     * @param caminho ficheiro de original
     * @param destino ficheiro para onde esta a ser copiado o conteudo
     * @throws FileNotFoundException
     */
    public static void copiarTexto(String caminho, String destino) throws FileNotFoundException {

        File fileOrigem = new File(caminho);
        File fileDestino = new File(destino);

        Scanner sc = new Scanner(fileOrigem);
        PrintWriter printWriter = new PrintWriter(fileDestino);

        while(sc.hasNextLine()){
            String linha = sc.nextLine();
            printWriter.println(linha);
        }
        printWriter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        copiarTexto("Ficheiros/exercicio_03.txt", "Ficheiros/exercicio_03_2.txt");
    }
}

