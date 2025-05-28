package Ex_07;

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Zé", 25,"asdsad@sda", "softDev", 15);
        Aluno a2 = new Aluno("Manel", 25,"fdghyj@sda", "Data analyst", 7.5);

        System.out.println(a1.situacaoAprovacao());
        System.out.println(a2.situacaoAprovacao());

    }
}
