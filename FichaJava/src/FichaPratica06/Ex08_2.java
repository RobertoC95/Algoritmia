package FichaPratica06;

public class Ex08_2 {

    public static int somatorioMatrizes(int[][] matriz1, int[][] matriz2) {

        int somatorio = 0;

        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                somatorio = matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }
        return somatorio;
    }

    public static void somarMatrizes(int[][] matriz1, int[][] matriz2) {

        int[][] matrizSoma = new int[matriz1.length][matriz1[0].length];
        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                matrizSoma[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }

        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                System.out.print(matrizSoma[linha][coluna] + "/t");
            }
            System.out.println();
        }
    }
}
