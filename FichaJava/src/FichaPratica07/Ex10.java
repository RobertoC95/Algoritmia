package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static FichaPratica07.Ex07.contarLinhas;


public class Ex10 {

    public static void menuEx10(String args) throws FileNotFoundException {


        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Insira a opção desejada");
            System.out.println("1- Escolher genero musical");
            System.out.println("2- Escolher Artista");
            System.out.println("3- Musica com maior duração");
            System.out.println("4- Musicas mais longas do que um determinado tempo");
            System.out.println("5- Numero de musicas");
            System.out.println("0- Sair");

            opcao = input.nextInt();


        } while (opcao != 0);

    }

    public static String[][] ficheiroParaMatriz(String caminho) throws FileNotFoundException {

        int numeroFormandos = contarLinhas(caminho) - 1;

        String[][] matrizCompleta = new String[numeroFormandos][5];

        File ficheiro = new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        sc.nextLine();

        int numAtual = 0;

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] linhaseparada = linha.split(",");

            for (int i = 0; i < matrizCompleta[0].length; i++) {
                matrizCompleta[numAtual][i] = linhaseparada[i];
                System.out.print(matrizCompleta[numAtual][i] + "/");

            }
            System.out.println();
            numAtual++;

        }
        return matrizCompleta;
    }

    public static void imprimirFormandos(String matriz[][], String formandos) throws FileNotFoundException {

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][0]);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        String formando = "";
        ficheiroParaMatriz("Ficheiros/exercicio_10.csv");

    }
}