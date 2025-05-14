package FichaPraticaExtraCiclos;

public class Ex05_1 {
    public static void main(String[] args) {

        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
