package FichaPratica06;

import java.util.Scanner;

public class Ex03 {

    public static boolean parImpar(int num1) {

        Scanner input = new Scanner(System.in);

        num1 = input.nextInt();
        boolean par;
        par = true;

        if (num1 % 2 != 0) {
            par = false;
        }
        if(par){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
        return (par);
    }
    publica
}
