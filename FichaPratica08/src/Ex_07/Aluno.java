package Ex_07;

public class Aluno {

    private String nome;
    private int idade;
    private String email;
    private String curso;
    private double media;



    public Aluno(String nome, int idade, String email, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.curso = curso;
        this.media = media;
    }

    public void setIdade(int idade) {
        this.idade = idade + 1;
    }

    public void felizAniversario() {

        setIdade(idade);
    }

    public boolean situacaoAprovacao() {
        if (media > 9.4) {
            return true;
        } else {
            return false;
        }

    }


    public void exibirDetalhes(){
        System.out.println("Nome: " + nome );
        System.out.println("Idade: " + idade );
        System.out.println("email: " + email );
        System.out.println("Curso: " + curso );
        System.out.println("Media: " + media );
        System.out.println();
    }


}
