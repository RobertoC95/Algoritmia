package FichaPratica1;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vBase, sub, dias, codF;
        double iRS, sTrb, sEmp, tot;

        System.out.println("Introduz o código do funcionário");

        codF = input.nextInt();

        System.out.println("Introduz numero de dias de trabalho");

        dias = input.nextInt();

        System.out.println("Código do funcionário " + codF);

        sub = dias *5;
        vBase = dias *40;
        iRS = (vBase + sub) *.10;
        sTrb = (vBase + sub) *.11;
        sEmp = (vBase + sub) *.2375;
        tot = (vBase +sub - iRS -sTrb);

        System.out.println("salario " + vBase);
        System.out.println("Subsidio de Alimentação " + sub);
        System.out.println("Irs " + iRS);
        System.out.println("Segunrança Social Empregado " + sTrb);
        System.out.println("Segunrança Social Entidade Patronal " + sEmp);
        System.out.println("Vencimento Final " + tot);



    }
}
