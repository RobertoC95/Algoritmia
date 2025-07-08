package parteA.gestaoBancaria;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class ContaBancariaTest {

    ContaBancaria conta1;
    ContaBancaria conta2;

    @BeforeEach
    void setUp() {
        conta1 = new ContaBancaria("Roberto", 1000, 2020, "Portugal", "somtehing");
        conta2 = new ContaBancaria("Jaime", 1500, 2020, "Portugal", "something else");
    }

    @Test
    void testDepositar() {
        assertEquals(1000, conta1.consultarSaldo());
        conta1.depositar(500);
        assertEquals(1500, conta1.consultarSaldo());

        //controlo
        assertEquals(1500, conta2.consultarSaldo());
        conta2.depositar(50);
        assertEquals(1550, conta2.consultarSaldo());

    }

    @Test
    void testLevantarValorMenor() {

        assertEquals(1000, conta1.consultarSaldo());
        conta1.levantar(500);
        assertEquals(500, conta1.consultarSaldo());

        //controlo
        assertEquals(1500, conta2.consultarSaldo());
        conta2.levantar(100);
        assertEquals(1400, conta2.consultarSaldo());
    }

    @Test
    void testLevantarValorMaior() {
        assertEquals(1000, conta1.consultarSaldo());
        conta1.levantar(1100);
        assertEquals(1000, conta1.consultarSaldo());

        //controlo
        assertEquals(1500, conta2.consultarSaldo());
        conta2.levantar(2000);
        assertEquals(1500, conta2.consultarSaldo());
    }

    @Test
    void testLevantarValorIgual() {
        assertEquals(1000, conta1.consultarSaldo());
        conta1.levantar(1000);
        assertEquals(0, conta1.consultarSaldo());

        //controlo
        assertEquals(1500, conta2.consultarSaldo());
        conta2.levantar(1500);
        assertEquals(0, conta2.consultarSaldo());
    }

    @Test
    void testLevantarValorInvalido() {
        assertThrows(IllegalArgumentException.class, () -> conta1.levantar(-1000));

        //controlo
        assertThrows(IllegalArgumentException.class, () -> conta1.levantar(-1500));
    }

    @Test
    void testTransferirValorMenor() {

        assertEquals(1000, conta1.consultarSaldo());
        assertEquals(1500, conta2.consultarSaldo());
        conta1.transferir(conta2, 500);
        assertEquals(500, conta1.consultarSaldo());
        assertEquals(2000, conta2.consultarSaldo());
    }

    @Test
    void testTransferirValorMaior() {

        assertEquals(1000, conta1.consultarSaldo());
        assertEquals(1500, conta2.consultarSaldo());
        conta2.transferir(conta1, 100);
        assertEquals(1400, conta2.consultarSaldo());
        assertEquals(1100, conta1.consultarSaldo());
    }

    @Test
    void testTransferirValorIgual() {

        assertEquals(1000, conta1.consultarSaldo());
        assertEquals(1500, conta2.consultarSaldo());
        conta1.transferir(conta2, 1000);
        assertEquals(0, conta1.consultarSaldo());
        assertEquals(2500, conta2.consultarSaldo());
    }

    @Test
    void testTransferirValorInvalido() {

        assertThrows(IllegalArgumentException.class, () -> conta1.transferir(conta2, -1500));

        //controlo

        assertThrows(IllegalArgumentException.class, ()-> conta2.transferir(conta1, -3562));
    }

    @Test
    void aplicarRendimentoMensal() {
    }

    @Test
    void consultarSaldo() {
    }

    @Test
    void gerarResumoConta() {
    }
}