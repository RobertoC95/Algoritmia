package FichaPratica04;

import java.util.Scanner;

public class Ex04_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        boolean primo;

        primo = true;

        System.out.println("Introduza um numero");
        n = input.nextInt();

        if (n <= 1) {
            primo = false;
        }
        for (int divisor = 2; divisor < n; divisor++) {
            if (n % divisor == 0) {
                primo = false;
            }
        }
        if(primo){
            System.out.println(primo);
            System.out.println("primo");
        }else{
            System.out.println("nao primo");
        }
    }
}
