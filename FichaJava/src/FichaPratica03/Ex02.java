package FichaPratica03;

public class Ex02 {

    public static void main(String[] args) {

        int num;
        num = 0;

        while (num <= 400) {
            if ((num) % 2 == 0) {
                System.out.println(num);
                num = num + 1;
            }else {
                num = num + 1;
            }
        }
    }
}
