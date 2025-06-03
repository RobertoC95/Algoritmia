package Ex_03;

public class Main {

    public static void main(String[] args) {

        Peixe peixe1 = new Peixe("asdasd", 20, 6);
        Peixe peixe2 = new Peixe("gjfgfh", 32.6, 8);
        Peixe peixe3 = new Peixe("dgrdt", 31.982, 9.65);
        Peixe peixe4 = new Peixe("kuigj", 24.5, 12.5);


        Marisco marisco1 = new Marisco("sdadasd", 20.6, 16.5);
        Marisco marisco2 = new Marisco("ghfgh", 15.36, 13);
        Marisco marisco3 = new Marisco("wersdf", 31.2, 10);
        Marisco marisco4 = new Marisco("khj", 50.98, 6.5);


        BarcoPesca barco1 = new BarcoPesca("Boaty Mcboatface", "branco", "1995", 6, 150, Marca.BENTZ);

        barco1.pescarPeixe(peixe2);
        barco1.pescarPeixe(peixe2);
        barco1.pescarPeixe(peixe4);
        barco1.pescarMarisco(marisco3);
        barco1.pescarPeixe(peixe2);
        barco1.pescarMarisco(marisco1);
        barco1.pescarMarisco(marisco2);

        barco1.salarioTripulacao();

        System.out.println();
        barco1.largarMarisco(1);
        barco1.largarPeixe(0);
        barco1.cargaNoBarco();
        barco1.salarioTripulacao();


    }
}
