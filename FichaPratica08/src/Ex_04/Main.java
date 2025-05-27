package Ex_04;

public class Main {

    public static void main(String[] args) {


        Circulo circulo1 =new Circulo(10, "vermelho");

        System.out.println();
        System.out.println("cor: " + circulo1.getCor());
        System.out.println("raio: " + circulo1.getRaio());
        System.out.println("perimetro: " + circulo1.getPerimetro());
        System.out.println("area: " + circulo1.getArea());

        circulo1.setRaio(12);

        System.out.println();
        System.out.println("cor: " + circulo1.getCor());
        System.out.println("raio: " + circulo1.getRaio());
        System.out.println("perimetro: " + circulo1.getPerimetro());
        System.out.println("area: " + circulo1.getArea());
    }
}
