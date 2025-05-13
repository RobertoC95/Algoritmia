package FichasPraticasExtraCiclos;

public class Ex05_2 {
    public static void main(String[] args) {

        int linhas = 5; // Número de linhas a serem impressas
        int espacos = linhas - 1; // Número inicial de espaços em cada linha

        for (int i = 1; i <= linhas; i++) {

            for (int j = 1; j <= espacos; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(i);
            }

            System.out.println();

            espacos--;
        }
    }
}
