package FichaPratica06;

import java.util.Scanner;

public class Ex01 {

    public static void fazerBarulho(String animal) {


        switch (animal){
            case "cao" :
                System.out.println("au au au ");
                break;
            case "gato" :
                System.out.println("miau");
                break;
            case "peixe" :
                System.out.println("glub glub");
                break;
            case "vaca" :
                System.out.println("muuuu");
                break;
            case "porco" :
                System.out.println("oinc oinc");
                break;
            default:
                System.out.println("Barulho desconhecido");
        }
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String animal;
        System.out.println("insira um animal: ");
        animal= input.next();


        fazerBarulho(animal);

    }
}
