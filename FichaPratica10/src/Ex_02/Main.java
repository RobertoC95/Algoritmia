package Ex_02;

public class Main {
    public static void main(String[] args) {

        Pessoa participante1 = new Pessoa("Roberto", 29,987654321, "sladksd@gmail.com");
        Pessoa participante2 = new Pessoa("Jaime", 54,946513579, "dasfdsf@gmail.com");
        Pessoa participante3 = new Pessoa("Fatima", 51,964879584, "freyjytgh@gmail.com");
        Pessoa participante4 = new Pessoa("Cecília", 26,932154789, "gtjgjh@gmail.com");
        Pessoa participante5 = new Pessoa("Gabriel", 2,987654891, "weryrt@gmail.com");
        Pessoa participante6 = new Pessoa("Mara", 12,932145898, "iuredfg@gmail.com");
        Pessoa participante7 = new Pessoa("Maria", 13,965478512, "sdfregfgh@gmail.com");

        Sorteio sorteioP = new Sorteio("Totobola",3265487.35);

        System.out.println();
        sorteioP.inscreverParticipante(participante1);
        sorteioP.inscreverParticipante(participante2);
        sorteioP.inscreverParticipante(participante3);
        sorteioP.inscreverParticipante(participante4);
        sorteioP.inscreverParticipante(participante5);
        sorteioP.inscreverParticipante(participante6);
        sorteioP.inscreverParticipante(participante7);

        System.out.println();
        sorteioP.imprimirDetalhesForEach();

        System.out.println();
        sorteioP.sortear().exibirDetalhes();




    }
}
