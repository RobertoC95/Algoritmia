package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex05_2 {

    /**
     * função que calcula a soma dos numeros inteiros num ficheiro
     * @param caminho caminho para um ficheiro a analisar
     * @return soma dos numeros presentes no ficheiro
     * @throws FileNotFoundException caso não encontre ficheiro
     */
    public static int somarFicheiro(String caminho) throws FileNotFoundException {

        File ficheiro= new File(caminho);
        Scanner sc = new Scanner(ficheiro);

        int soma=0;

        while (sc.hasNextInt()){
            soma+=sc.nextInt();
        }
        return soma;
    }

    public static void main(String[] args) throws FileNotFoundException {

        int somaFicheiro1, somaFicheiro2;

        somaFicheiro1= somarFicheiro("Ficheiros/exercicio_05_31.txt");
        somaFicheiro2= somarFicheiro("Ficheiros/exercicio_05_1999.txt");

        if(somaFicheiro1<somaFicheiro2){
            System.out.println(somaFicheiro2);
        }else
            System.out.println(somaFicheiro1);
    }
}
