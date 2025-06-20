package Ex_04;

import Ex_02.Logger;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    private static FileManager instance;
    private String nomeFicheiro;

    public FileManager() {
        this.nomeFicheiro = nomeFicheiro;
    }

    public static FileManager getInstance(){
        if(instance == null){
            instance = new FileManager();
        }
        return instance;
    }

    public void createFile(String string) throws IOException {
        FileWriter fw = new FileWriter(this.nomeFicheiro, true);
        fw.append(string + "\n");
        fw.close();
    }

//    public void setRootDirectory(String nomeFicheiro){
//        System.out.println("File " + nomeFicheiro + " root Directory updated");
//    }
//
//    public void createFile(String nomeFicheiro){
//        System.out.println("New file " + nomeFicheiro + " created");
//    }
//
//    public void deleteFile(String nomeFicheiro){
//        System.out.println("File " + nomeFicheiro + " deleted");
//    }

}
