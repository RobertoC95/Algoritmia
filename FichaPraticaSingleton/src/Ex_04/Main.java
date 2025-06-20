package Ex_04;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileManager fileManager = FileManager.getInstance();
        fileManager.setRootDirectory("/textFiles");
        fileManager.createFile("file.txt");
        fileManager.createFile("ficheiroNovo.txt");
        fileManager.deleteFile("file.txt");
        fileManager.setRootDirectory("/csvFiles");
        fileManager.createFile("tabela.csv");
        fileManager.createFile("filmes.csv");
        fileManager.createFile("jogos.csv");
        fileManager.deleteFile("tabela.csv ");

    }
}
