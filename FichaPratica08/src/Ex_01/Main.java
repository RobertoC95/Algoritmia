package Ex_01;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Roberto", 29, 1.8);
        Pessoa pessoa2 = new Pessoa("Jaime", 54, 1.83);
        Pessoa pessoa3 = new Pessoa("Fátima", 51, 1.57);

        System.out.print(pessoa1.getNome() +" ");
        System.out.print(pessoa1.getIdade()+" ");
        System.out.println(pessoa1.getAltura());
        System.out.print(pessoa2.getNome()+" ");
        System.out.print(pessoa2.getIdade()+" ");
        System.out.println(pessoa2.getAltura());
        System.out.print(pessoa3.getNome()+" ");
        System.out.print(pessoa3.getIdade()+" ");
        System.out.print(pessoa3.getAltura());
    }
}
