package FichaPraticaExtraCiclos;

public class Ex05_3 {
    public static void main(String[] args) {
        int linhas = 4; // Número de linhas a serem impressas

        for (int i = 1; i <= linhas; i++) {
            // Imprimir espaços em branco antes dos números
            for (int j = 1; j <= linhas - i; j++) {
                System.out.print(" ");
            }

            // Imprimir números crescentes
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Imprimir números decrescentes
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}