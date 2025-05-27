package Ex_02;

public class Main {
    public static void main(String[] args) {

        Edificio edificio1 = new Edificio("principal", "pinheiro", "porto", "vermelho", 10, true );

        System.out.println(edificio1.getNome() +" ");
        System.out.println(edificio1.getRua() +" ");
        System.out.println(edificio1.getCidade() +" ");
        System.out.println(edificio1.getCor() +" ");
        System.out.println(edificio1.getAndares() +" ");
        System.out.println(edificio1.getGaragem() +" ");


        edificio1.setCor("Azul");
        System.out.println();

        System.out.println(edificio1.getNome() +" ");
        System.out.println(edificio1.getRua() +" ");
        System.out.println(edificio1.getCidade() +" ");
        System.out.println(edificio1.getCor() +" ");
        System.out.println(edificio1.getAndares() +" ");
        System.out.println(edificio1.getGaragem() +" ");




    }
}
