package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Ex06 {

    /**
     * função para descobrir o maior elemento de um ficheiro
     *
     * @param seccao ficheiro a prourar
     * @throws FileNotFoundException caso o ficheiro não exista
     */
    public static void maiorElemento(String seccao) throws FileNotFoundException {

        File ficheiro = new File(seccao);
        Scanner in = new Scanner(ficheiro);
        int maior = 0;
        String nome="";

        while (in.hasNextLine()) {
            String linha = in.nextLine();
            String[] itensDaLista = linha.split(",");


            if (Integer.parseInt(itensDaLista[1]) > maior) {
                maior = Integer.parseInt(itensDaLista[1]);
                nome = itensDaLista[0];
            }
        }
        System.out.println("A pessoa mais velha é: " + nome + " e a sua idade é: " + maior);
    }

    public static void main(String[] args) throws FileNotFoundException {
        maiorElemento("Ficheiros/exercicio_06.txt");
    }
}





