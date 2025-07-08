package parteA.tempo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelogioTest {

    Relogio relogio1;
    Relogio relogio2;
    Relogio relogio3;

    @BeforeEach
    void setUp() {

        relogio1 = new Relogio("Timberland", 11, 30, 30, 2000);
        relogio2 = new Relogio("Rolex", 12, 0, 30, 2010);
        relogio3 = new Relogio("asd", 1, 1, 30, 2015);
    }

    @Test
    void testAjustarHora() {
        assertEquals(11, relogio1.getHora());
        relogio1.ajustarHora(23);
        assertEquals(23, relogio1.getHora());

        //controlo
        assertEquals(12, relogio2.getHora());
        relogio2.ajustarHora(25);
        assertEquals(12, relogio2.getHora());

    }
    @Test
    void testAjustarHoraAcima60() {

        assertEquals(30, relogio1.getHora());
        relogio1.ajustarHora(65);
        assertEquals(30, relogio1.getHora());

        //controlo
        assertEquals(0, relogio2.getHora());
        relogio2.ajustarHora(85);
        assertEquals(0, relogio2.getHora());
    }

    @Test
    void testAjustarHorasAbaixo60() {

        assertEquals(30, relogio1.getHora());
        relogio1.ajustarMinutos(-56);
        assertEquals(30, relogio1.getMinuto());

        //controlo
        assertEquals(0, relogio2.getMinuto());
        relogio2.ajustarMinutos(-36);
        assertEquals(0, relogio2.getMinuto());
    }

    @Test
    void testAjustarMinutos() {
        assertEquals(30, relogio1.getMinuto());
        relogio1.ajustarMinutos(57);
        assertEquals(57, relogio1.getMinuto());

        //controlo
        assertEquals(0, relogio2.getMinuto());
        relogio2.ajustarMinutos(39);
        assertEquals(39, relogio2.getMinuto());

    }

    @Test
    void testAjustarMinutosAcima60() {

        assertEquals(30, relogio1.getMinuto());
        relogio1.ajustarMinutos(65);
        assertEquals(30, relogio1.getMinuto());

        //controlo
        assertEquals(0, relogio2.getMinuto());
        relogio2.ajustarMinutos(85);
        assertEquals(0, relogio2.getMinuto());
    }

    @Test
    void testAjustarMinutosAbaixo60() {

        assertEquals(30, relogio1.getMinuto());
        relogio1.ajustarMinutos(-56);
        assertEquals(30, relogio1.getMinuto());

        //controlo
        assertEquals(0, relogio2.getMinuto());
        relogio2.ajustarMinutos(-36);
        assertEquals(0, relogio2.getMinuto());
    }

    @Test
    void testPassarSegundos() {

        assertEquals(11, relogio1.getHora());
        assertEquals(30, relogio1.getMinuto());
        assertEquals(30, relogio1.getSegundo());
        relogio1.passarSegundos(3600);

        assertEquals(30, relogio1.getSegundo());
        assertEquals(30, relogio1.getMinuto());
        assertEquals(12, relogio1.getHora());

        //controlo

        assertEquals(30, relogio2.getSegundo());
        assertEquals(0, relogio2.getMinuto());
        assertEquals(12, relogio2.getHora());

        relogio2.passarSegundos(3600);

        assertEquals(30, relogio2.getSegundo());
        assertEquals(0, relogio2.getMinuto());
        assertEquals(13, relogio2.getHora());

    }

    @Test
    void testPassarSegundosInvalidos() {

        assertEquals(11, relogio1.getHora());
        assertEquals(30, relogio1.getMinuto());
        assertEquals(30, relogio1.getSegundo());

        assertThrows(IllegalArgumentException.class, () -> relogio1.passarSegundos(-150));
    }


    @Test
    void testConverterParaSegundos() {

        relogio3.converterParaSegundos();
        assertEquals(5430, relogio3.converterParaSegundos());
    }

    @Test
    void testGerarDescricaoRelogio() {

        assertEquals("Marca: " + "Timberland, " + "Ano: " + 2000 + ", Hora: " + 11 + ", Minuto: " + 30 + ", Segundo: " + 30, relogio1.gerarDescricaoRelogio());


        //controlo

        assertEquals("Marca: " + "Rolex, " + "Ano: " + 2010 + ", Hora: " + 12 + ", Minuto: " + 0 + ", Segundo: " + 30, relogio2.gerarDescricaoRelogio());
    }
}







































