package Ex_09;

public class Funcionario {

    private String nome;
    private String email;
    private String departamento;
    private double salario;


    public Funcionario(String nome, String email, String departamento, double salario) {
        this.nome = nome;
        this.email = email;
        this.departamento = departamento;
        this.salario = salario;
    }


    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public double getSalario() {
        return this.salario;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("email: " + email);
        System.out.println("departamento: " + departamento);
        System.out.println("salario: " + salario);
        System.out.println();
    }

    public void aumentarSalario(double aumento) {
        this.salario = salario * (1 + (aumento / 100));
    }

}
