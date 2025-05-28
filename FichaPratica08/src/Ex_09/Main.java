package Ex_09;

public class Main {
    public static void main(String[] args) {

        Funcionario f1  = new Funcionario("Zé","asdasdaw@asdsad.com", "HR", 1000);

        f1.exibirDetalhes();

        f1.aumentarSalario(15);

        f1.exibirDetalhes();

    }
}
