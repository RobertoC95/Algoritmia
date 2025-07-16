import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EleicaoTest {

    Eleicao eleicaoAutarquica;
    Eleicao eleicaoAssociacaoEstudantes;
    Candidato aut1;
    Candidato aut2;
    Candidato aut3;
    Candidato aut4;
    Candidato ass1;
    Candidato ass2;
    Candidato ass3;
    Candidato ass4;
    Eleitor eleitor1;
    Eleitor eleitor2;
    Eleitor eleitor3;
    Eleitor eleitor4;
    Eleitor eleitor5;
    Eleitor eleitor6;


    @BeforeEach
    void setUp() {
        eleicaoAutarquica = new Eleicao("Eleicoes Autarquicas 2025", 18);
        eleicaoAssociacaoEstudantes = new Eleicao("Associacao de Estudantes - Secundaria Freixo de Espada a Cinta", 14);

        // Candidatos para a eleição autárquica
        aut1 = new Candidato("Joana Almeida", 42, "Trofa");
        aut2 = new Candidato("Ricardo Meireles", 50, "Maia");
        aut3 = new Candidato("Cristiano Ronaldo", 38, "Porto");
        aut4 = new Candidato("Joaquim Alberto", 45, "Gaia");

        // Candidatos para a associação de estudantes
        ass1 = new Candidato("Mariana Costa", 17, "Trofa");
        ass2 = new Candidato("Luis Pereira", 16, "Trofa");
        ass3 = new Candidato("Sofia Matos", 18, "Santo Tirso");
        ass4 = new Candidato("Bruno Gomes", 6, "Maia");

        //eleitores
        eleitor1 = new Eleitor("Fernando Simões", "E020", 23, "fernando@mail.com", "911000020");
        eleitor2 = new Eleitor("Vera Matos", "E017", 15, "vera@mail.com", "911000017");
        eleitor3 = new Eleitor("Pedro Costa", "E010", 21, "pedro@mail.com", "911000010");
        eleitor4 = new Eleitor("Joana Ribeiro", "E011", 38, "joana@mail.com", "911000011");
        eleitor5 = new Eleitor("André Moreira", "E012", 25, "andre@mail.com", "911000012");
        eleitor6 = new Eleitor("Lara Fernandes", "E013", 10, "lara@mail.com", "911000013");

    }

    @Test
    void TestAdicionarCandidatoEleicoesAutarquicas() {

        this.eleicaoAutarquica.adicionarCandidato(aut1);
        assertNotNull(this.eleicaoAutarquica.getCandidatos());
    }

    @Test
    void TestAdicionarCandidatoEleicoesAutarquicasInvalido() {

        assertThrows(IllegalArgumentException.class, () -> this.eleicaoAutarquica.adicionarCandidato(ass4));
    }

    @Test
    void TestAdicionarCandidatoEleicoesAssEstudantes() {

        this.eleicaoAssociacaoEstudantes.adicionarCandidato(ass1);
        assertNotNull(this.eleicaoAssociacaoEstudantes.getCandidatos());

    }

    @Test
    void TestAdicionarCandidatoEleicoesAssEstudantesInvalido() {
        assertThrows(IllegalArgumentException.class, () -> this.eleicaoAssociacaoEstudantes.adicionarCandidato(ass4));


    }

    @Test
    void TestVotarAutMaiorIdade() {
        this.eleicaoAutarquica.adicionarCandidato(aut1);
        this.eleicaoAutarquica.adicionarCandidato(aut2);
        this.eleicaoAutarquica.adicionarCandidato(aut3);
        this.eleicaoAutarquica.adicionarCandidato(aut4);
        Main.votar(eleicaoAutarquica,eleitor1,aut1);

        assertEquals(1, eleicaoAutarquica.contarVotos(aut1));


    }

    @Test
    void TestVotarAutMenorIdade() {

        assertThrows(IllegalArgumentException.class, () -> this.eleicaoAutarquica.votar(eleitor6, ass4));
    }

    @Test
    void TestVotarAssMaiorIdade() {
        this.eleicaoAssociacaoEstudantes.adicionarCandidato(ass1);
        this.eleicaoAssociacaoEstudantes.adicionarCandidato(ass2);
        this.eleicaoAssociacaoEstudantes.adicionarCandidato(ass3);
        this.eleicaoAssociacaoEstudantes.adicionarCandidato(ass4);
        Main.votar(eleicaoAutarquica,eleitor3,ass3);

        assertEquals(1,eleicaoAssociacaoEstudantes.contarVotos(ass3));
    }
    @Test
    void TestVotarAssMenorIdade() {

        assertThrows(IllegalArgumentException.class, () -> this.eleicaoAssociacaoEstudantes.votar(eleitor6, ass4));
    }

    @Test
    void TestEleitorJaVotou() {

        Main.votar(this.eleicaoAutarquica, eleitor1, aut1);

        assertThrows(IllegalArgumentException.class, () -> this.eleicaoAssociacaoEstudantes.votar(eleitor1, aut2));
    }

    @Test
    void TestcontarVotos() {
        this.eleicaoAutarquica.adicionarCandidato(aut1);
        this.eleicaoAutarquica.adicionarCandidato(aut2);
        this.eleicaoAutarquica.adicionarCandidato(aut3);
        this.eleicaoAutarquica.adicionarCandidato(aut4);
        Main.votar(this.eleicaoAutarquica, eleitor2, aut3);
        assertEquals(1, this.eleicaoAutarquica.contarVotos(aut3));

    }

    @Test
    void TestobterVencedor() {
        this.eleicaoAutarquica.adicionarCandidato(aut1);
        this.eleicaoAutarquica.adicionarCandidato(aut2);
        this.eleicaoAutarquica.adicionarCandidato(aut3);
        this.eleicaoAutarquica.adicionarCandidato(aut4);
        Main.votar(this.eleicaoAutarquica, eleitor1, aut1);
        Main.votar(this.eleicaoAutarquica, eleitor2, aut2);
        Main.votar(this.eleicaoAutarquica, eleitor3, aut2);
        Main.votar(this.eleicaoAutarquica, eleitor4, aut2);
        assertEquals(aut2, this.eleicaoAutarquica.obterVencedor().getNome());
    }

    @Test
    void TestEleicaoSemCandidatos(){
        assertThrows(IllegalArgumentException.class, ()-> eleicaoAutarquica.votar(eleitor1,aut1));
    }

    @Test
    void TestVencedorEleicoes(){
        this.eleicaoAutarquica.adicionarCandidato(aut1);
        this.eleicaoAutarquica.adicionarCandidato(aut2);
        this.eleicaoAutarquica.adicionarCandidato(aut3);
        this.eleicaoAutarquica.adicionarCandidato(aut4);
        Main.votar(this.eleicaoAutarquica, eleitor1, aut1);
        Main.votar(this.eleicaoAutarquica, eleitor3, aut1);
        Main.votar(this.eleicaoAutarquica, eleitor4, aut2);
        Main.votar(this.eleicaoAutarquica, eleitor5, aut2);

        assertNull(eleicaoAutarquica.obterVencedor());
    }


}