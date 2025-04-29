package FichaPratica03;

public class Ex07 {

    public static void main(String[] args) {

        int num1, soma;

        num1 = 1;
        soma = 0;

        while (num1 <= 100) {
            System.out.println(num1);
            soma = soma + num1;
            num1 = num1 + 1;
        }

        System.out.println("Somatório: " + soma);


    }
}
