package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex07 {

    public static void numeroDeElementos(String todosElementos) throws FileNotFoundException {

        File ficheiro = new File(todosElementos);
        Scanner in = new Scanner(ficheiro);
        int num1 = 0, num2 = 0;

        while (in.hasNextLine()) {
            String linha = in.nextLine();
            num1++;
            String[] itensDaLista = linha.split(" ");
            for (int i = 0; i < itensDaLista.length; i++) {
                num2++;
            }
        }
        System.out.println("o texto contido no ficheiro tem " + num1 + " linhas");
        System.out.println("o texto do ficheiro tem " + num2 + " elementos");
    }

    public static void main(String[] args) throws FileNotFoundException {

        numeroDeElementos("Ficheiros/exercicio_07.txt");

    }
}
