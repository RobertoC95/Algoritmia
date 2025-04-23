package FichaPratica02;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dias, cdt;
        double vBase, segT, segE, irs, subA, vLiq;
        String cargo;

        System.out.println("Insira o código do trabalhador");
        cdt = input.nextInt();

        System.out.println("Insira o numero de dias trabalhados");
        dias = input.nextInt();

        System.out.println("Introduza o cargo do trabalhador (E A C)");
        System.out.println("A- Administrador");
        System.out.println("C- Chefe");
        System.out.println("E- Empregado");

        cargo = input.next();

        switch (cargo) {

            case "a":
                vBase = dias * 80;
                subA = dias * 7.5;
                segT = vBase * .09;
                segE = vBase * .21;
                if (vBase < 1000) {
                    irs = vBase * .10;
                    vLiq = (vBase + subA - irs - segT);
                    System.out.println("Codigo do funcionário: " + cdt);
                    System.out.println("Salário Bruto: " + vBase);
                    System.out.println("sub Alimentação: " + subA);
                    System.out.println("IRS: " + irs);
                    System.out.println("Segurança Social Trabalhador: " + segT);
                    System.out.println("Segurança Social Empresa: " + segE);
                    System.out.println("Salário: " + vLiq);
                } else {
                    irs = vBase * .20;
                    vLiq = (vBase + subA - irs - segT);
                    System.out.println("Codigo do funcionário: " + cdt);
                    System.out.println("Salário Bruto: " + vBase + "€");
                    System.out.println("sub Alimentação: " + subA + "€");
                    System.out.println("IRS: " + irs + "€");
                    System.out.println("Segurança Social Trabalhador: " + segT + "€");
                    System.out.println("Segurança Social Empresa: " + segE + "€");
                    System.out.println("Salário: " + vLiq + "€");
                }
                break;
            case "c":
                vBase = dias * 60;
                subA = dias * 7.5;
                segT = vBase * .11;
                segE = vBase * .2375;
                if (vBase < 1000) {
                    irs = vBase * .10;
                    vLiq = (vBase + subA - irs - segT);
                    System.out.println("Codigo do funcionário: " + cdt);
                    System.out.println("Salário Bruto: " + vBase + "€");
                    System.out.println("sub Alimentação: " + subA + "€");
                    System.out.println("IRS: " + irs + "€");
                    System.out.println("Segurança Social Trabalhador: " + segT + "€");
                    System.out.println("Segurança Social Empresa: " + segE + "€");
                    System.out.println("Salário: " + vLiq + "€");
                } else {
                    irs = vBase * .20;
                    vLiq = (vBase + subA - irs - segT);
                    System.out.println("Codigo do funcionário: " + cdt);
                    System.out.println("Salário Bruto: " + vBase + "€");
                    System.out.println("sub Alimentação: " + subA + "€");
                    System.out.println("IRS: " + irs + "€");
                    System.out.println("Segurança Social Trabalhador: " + segT + "€");
                    System.out.println("Segurança Social Empresa: " + segE + "€");
                    System.out.println("Salário: " + vLiq + "€");
                }
                break;
            case "e":
                vBase = dias * 40;
                subA = dias * 5;
                segT = vBase * .11;
                segE = vBase * .2375;
                if (vBase < 1000) {
                    irs = vBase * .10;
                    vLiq = (vBase + subA - irs - segT);
                    System.out.println("Codigo do funcionário: " + cdt + "€");
                    System.out.println("Salário Bruto: " + vBase + "€");
                    System.out.println("sub Alimentação: " + subA + "€");
                    System.out.println("IRS: " + irs + "€");
                    System.out.println("Segurança Social Trabalhador: " + segT + "€");
                    System.out.println("Segurança Social Empresa: " + segE + "€");
                    System.out.println("Salário: " + vLiq + "€");
                } else {
                    irs = vBase * .20;
                    vLiq = (vBase + subA - irs - segT);
                    System.out.println("Codigo do funcionário: " + cdt);
                    System.out.println("Salário Bruto: " + vBase + "€");
                    System.out.println("sub Alimentação: " + subA + "€");
                    System.out.println("IRS: " + irs + "€");
                    System.out.println("Segurança Social Trabalhador: " + segT + "€");
                    System.out.println("Segurança Social Empresa: " + segE + "€");
                    System.out.println("Salário: " + vLiq + "€");
                }
                break;
            default:
                System.out.println("Introduza uma opção válida!");


        }


    }
}
