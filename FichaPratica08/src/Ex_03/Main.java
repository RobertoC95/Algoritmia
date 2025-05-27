package Ex_03;

public class Main {

    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo("vermelho", 10, 5);

        System.out.println();
        System.out.println("cor: " + retangulo1.getCor());
        System.out.println("largura: " + retangulo1.getLargura());
        System.out.println("comprimento: " + retangulo1.getComprimento());
        System.out.println("perimetro: " + retangulo1.getPerimetro());
        System.out.println("area: " + retangulo1.getArea());

        retangulo1.setLargura(12);
        retangulo1.setComprimento(6);

        System.out.println();
        System.out.println("cor: " + retangulo1.getCor());
        System.out.println("largura: " + retangulo1.getLargura());
        System.out.println("comprimento: " + retangulo1.getComprimento());
        System.out.println("perimetro: " + retangulo1.getPerimetro());
        System.out.println("area: " + retangulo1.getArea());
    }
}
