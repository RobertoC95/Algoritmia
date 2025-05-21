package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex09 {

    public static void generoMusical(String Genero) throws FileNotFoundException {

        File ficheiro = new File(Genero);
        Scanner sc = new Scanner(ficheiro);
        Scanner input = new Scanner(System.in);
        String linha = sc.nextLine();

        System.out.println("Introduza o genero muscial que pretende ouvir:");
        String genero = input.nextLine();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLista = linha.split(",");

            if (genero.equals(itensDaLista[2].toLowerCase())) {

                System.out.println(itensDaLista[0]);
            }

        }
    }

    public static void artista(String Genero) throws FileNotFoundException {

        File ficheiro = new File(Genero);
        Scanner sc = new Scanner(ficheiro);
        Scanner input = new Scanner(System.in);
        String linha = sc.nextLine();

        System.out.println("Introduza o artista que pretende ouvir:");
        String genero = input.nextLine();

        System.out.println("As musicas do artista que pretende ouvir são:");

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLista = linha.split(",");

            if (genero.equals(itensDaLista[1].toLowerCase())) {

                System.out.println(itensDaLista[0]);
            }

        }
    }

    public static void maiorDuracao(String seccao) throws FileNotFoundException {

        File ficheiro = new File(seccao);
        Scanner sc = new Scanner(ficheiro);
        double maior = 0, number;
        String musica = "";
        String artista = "";
        String linha = sc.nextLine();
        String maiorMusica = "";

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLista = linha.split(",");
            String duracao = itensDaLista[3];
            String[] tempoT = duracao.split(":");

            number = (Double.parseDouble(tempoT[0]) * 60) + Double.parseDouble(tempoT[1]);
            if (number > maior) {
                maior = number;
                maiorMusica = itensDaLista[3];
                musica = itensDaLista[0];
                artista = itensDaLista[1];
            }
        }
        System.out.println("O maior elemento do ficheiro é: " + musica + " by " + artista + "e a sua duração é : " + maiorMusica);
    }

    public static void duracaoEspecifica(String seccao) throws FileNotFoundException {

        File ficheiro = new File(seccao);
        Scanner sc = new Scanner(ficheiro);
        Scanner input = new Scanner(System.in);

        String linha = sc.nextLine();

        System.out.println("insira os minutos da musica:");
        double min = input.nextInt();
        System.out.println("insira os segundos da musica:");
        double seg = input.nextInt();
        double tempo = (min * 60) + seg;
        double tempoM = 0;

        System.out.println("Musicas com a duração pretendida: ");

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String[] itensDaLista = linha.split(",");
            String duracao = itensDaLista[3];
            String[] tempoT = duracao.split(":");
            tempoM = (Double.parseDouble(tempoT[0]) * 60) + Double.parseDouble(tempoT[1]);

            if (tempo < tempoM) {
                System.out.println(itensDaLista[0] + " by " + itensDaLista[1]);
            }
        }

    }

    public static void numeroDeMusicas(String todosElementos) throws FileNotFoundException {

        File ficheiro = new File(todosElementos);
        Scanner in = new Scanner(ficheiro);
        int numM = 0;
        String linha = in.nextLine();

        while (in.hasNextLine()) {
            linha = in.nextLine();
            numM++;
        }
        System.out.println("O ficheiro contém " + numM + " musicas");
    }

    public static void menu(String args) throws FileNotFoundException {


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

            switch (opcao) {
                case 1:
                    generoMusical("Ficheiros/exercicio_09.csv");
                    break;
                case 2:
                    artista("Ficheiros/exercicio_09.csv");
                    break;
                case 3:
                    maiorDuracao("Ficheiros/exercicio_09.csv");
                    break;
                case 4:
                    duracaoEspecifica("Ficheiros/exercicio_09.csv");
                    break;
                case 5:
                    numeroDeMusicas("Ficheiros/exercicio_09.csv");
                    break;
                case 0:
                    System.out.println("***A encerrar***");
                    break;
                default:
                    System.out.println("***opção inválida***");

            }

        } while (opcao != 0);

    }

    public static void main(String[] args) throws FileNotFoundException {

        menu("Ficheiros/exercicio_09.csv");
    }
}