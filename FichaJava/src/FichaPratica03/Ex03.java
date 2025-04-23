package FichaPratica03;

public class Ex03 {

    public static void main(String[] args) {

        int num;
        num = 0;

        while (num <= 750) {
            if (num < 530) {
                num = num + 1;
            } else if (num % 2 == 1) {
                System.out.println(num);
                num = num + 1;
            } else
                num = num + 1;

        }
    }
}
