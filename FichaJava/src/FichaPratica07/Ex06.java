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
        int maior = 0, number;
        String nome="";

        while (in.hasNextLine()) {
            String linha = in.nextLine();
            String[] itensDaLista = linha.split(",");

            number = Integer.parseInt(itensDaLista[1]);
            if (number > maior) {
                maior = number;
                nome = itensDaLista[0];
            }
        }
        System.out.println("O maior elemento do ficheiro é: " + maior + " e o seu nome é: " + nome);
    }

    public static void main(String[] args) throws FileNotFoundException {
        maiorElemento("Ficheiros/exercicio_06.txt");
    }
}





