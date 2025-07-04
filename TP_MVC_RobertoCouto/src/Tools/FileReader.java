package Tools;

import Models.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {


    public ArrayList<Cliente> clientFileReader(String filePath) throws FileNotFoundException {

        File clientFile = new File(filePath);
        Scanner clientScanner = new Scanner(clientFile);

        ArrayList<Cliente> clienteArray = new ArrayList<>();

        clientScanner.nextLine();

        while (clientScanner.hasNextLine()) {

            String linha = clientScanner.nextLine();
            String[] linhaSparada = linha.split(",");

            String id = linhaSparada[0];
            String nome = linhaSparada[1];
            String email = linhaSparada[2];
            String telemovel = linhaSparada[3];
            String dataNascimento = linhaSparada[4];
            boolean consMark = Boolean.parseBoolean(linhaSparada[5]);


            Cliente newCliente = new Cliente(id, nome, email, telemovel, dataNascimento, consMark);
            clienteArray.add(newCliente);
        }
        return clienteArray;
    }

    public ArrayList<User> usersFileReader(String filePath) throws FileNotFoundException {

        File usersFile = new File(filePath);
        Scanner userScanner = new Scanner(usersFile);

        ArrayList<User> usersArray = new ArrayList<>();

        userScanner.nextLine();

        while (userScanner.hasNextLine()) {

            String linha = userScanner.nextLine();

            String[] linhaSeparada = linha.split(",");

            String username = linhaSeparada[0];
            String password = linhaSeparada[1];
            String tipoAcesso = linhaSeparada[2];


            User newUser = new User(username, password, tipoAcesso);

            usersArray.add(newUser);
        }
        return usersArray;
    }

    public ArrayList<Quarto> quartoFileReader(String filePath) throws FileNotFoundException {
        File usersFile = new File(filePath);
        Scanner quartoScanner = new Scanner(usersFile);

        ArrayList<Quarto> quartoArray = new ArrayList<>();

        quartoScanner.nextLine();

        while (quartoScanner.hasNextLine()) {

            String linha = quartoScanner.nextLine();

            String[] linhaSeparada = linha.split(",");

            String numQUarto = linhaSeparada[0];
            String idTipologia = linhaSeparada[1];


            Quarto newQuarto = new Quarto(numQUarto, idTipologia);

            quartoArray.add(newQuarto);
        }
        return quartoArray;
    }

    public ArrayList<Experiencia> experienciaFileReader(String filePath) throws FileNotFoundException {
        File experienciaFile = new File(filePath);
        Scanner experienciaScanner = new Scanner(experienciaFile);

        ArrayList<Experiencia> experienciaArray = new ArrayList<>();

        experienciaScanner.nextLine();

        while (experienciaScanner.hasNextLine()) {

            String linha = experienciaScanner.nextLine();

            String[] linhaSeparada = linha.split(",");

            String id = linhaSeparada[0];
            String nome = linhaSeparada[1];
            String idGuiaExp = linhaSeparada[2];
            int precoA = Integer.parseInt(linhaSeparada[3]);
            int precoC = Integer.parseInt(linhaSeparada[4]);


            Experiencia newExperiencia = new Experiencia(id, nome, idGuiaExp, precoA, precoC);

            experienciaArray.add(newExperiencia);
        }
        return experienciaArray;
    }

    public ArrayList<GuiaExperiencia> guiaFileReader(String filePath) throws FileNotFoundException {
        File guiaExperienciaFile = new File(filePath);
        Scanner guiaExperienciaScanner = new Scanner(guiaExperienciaFile);

        ArrayList<GuiaExperiencia> guiaExperienciaArray = new ArrayList<>();

        guiaExperienciaScanner.nextLine();

        while (guiaExperienciaScanner.hasNextLine()) {

            String linha = guiaExperienciaScanner.nextLine();

            String[] linhaSeparada = linha.split(",");

            String idGuiaExp = linhaSeparada[0];
            String nome = linhaSeparada[1];
            String nacionalidade = linhaSeparada[2];
            String email = linhaSeparada[3];
            String nTelemovel = linhaSeparada[4];


            GuiaExperiencia newGuiaExperiencia = new GuiaExperiencia(idGuiaExp, nome, nacionalidade, email, nTelemovel);

            guiaExperienciaArray.add(newGuiaExperiencia);
        }
        return guiaExperienciaArray;
    }

    public ArrayList<RatingExperiencia> ratingExpFileReader(String filePath) throws FileNotFoundException {
        File ratingExpFileReader = new File(filePath);
        Scanner ratingExperienciaScanner = new Scanner(ratingExpFileReader);

        ArrayList<RatingExperiencia> ratingExperienciaArray = new ArrayList<>();

        ratingExperienciaScanner.nextLine();

        while (ratingExperienciaScanner.hasNextLine()) {

            String linha = ratingExperienciaScanner.nextLine();

            String[] linhaSeparada = linha.split(",");

            String idRating = linhaSeparada[0];
            String idExp = linhaSeparada[1];
            int ratingExp = Integer.getInteger(linhaSeparada[2]);
            int ratingGuia = Integer.getInteger(linhaSeparada[3]);


            RatingExperiencia newRatingExperiencia = new RatingExperiencia(idRating, idExp, ratingExp, ratingGuia);

            ratingExperienciaArray.add(newRatingExperiencia);
        }
        return ratingExperienciaArray;
    }

    public ArrayList<Reserva> reservasFileReader(String filePath) throws FileNotFoundException {
        File reservasFileReader = new File(filePath);
        Scanner reservasScanner = new Scanner(reservasFileReader);

        ArrayList<Reserva> reservaArray = new ArrayList<>();

        reservasScanner.nextLine();

        while (reservasScanner.hasNextLine()) {

            String linha = reservasScanner.nextLine();

            String[] linhaSeparada = linha.split(",");

            String idReserva = linhaSeparada[0];
            String numQuarto = linhaSeparada[1];
            String idCliente = linhaSeparada[2];
            int ano = Integer.getInteger(linhaSeparada[3]);
            int mes = Integer.getInteger(linhaSeparada[4]);
            int semana = Integer.getInteger(linhaSeparada[5]);


            Reserva newReserva = new Reserva(idReserva, numQuarto, idCliente, ano, mes, semana);

            reservaArray.add(newReserva);
        }
        return reservaArray;
    }

    public ArrayList<Tipologia> tipologiaFileReader(String filePath) throws FileNotFoundException {
        File tipologiaFileReader = new File(filePath);
        Scanner tipologiaScanner = new Scanner(tipologiaFileReader);

        ArrayList<Tipologia> tipologiaArray = new ArrayList<>();

        tipologiaScanner.nextLine();

        while (tipologiaScanner.hasNextLine()) {

            String linha = tipologiaScanner.nextLine();

            String[] linhaSeparada = linha.split(",");

            String idTipologia = linhaSeparada[0];
            String descricao = linhaSeparada[1];
            int precoSemana = Integer.getInteger(linhaSeparada[2]);


            Tipologia newTipologia = new Tipologia(idTipologia, descricao, precoSemana);

            tipologiaArray.add(newTipologia);
        }
        return tipologiaArray;
    }

    public ArrayList<Venda> vendaFileReader(String filePath) throws FileNotFoundException {
        File vendaFileReader = new File(filePath);
        Scanner vendaScanner = new Scanner(vendaFileReader);

        ArrayList<Venda> vendaArray = new ArrayList<>();

        vendaScanner.nextLine();

        while (vendaScanner.hasNextLine()) {

            String linha = vendaScanner.nextLine();

            String[] linhaSeparada = linha.split(",");

            String idVenda = linhaSeparada[0];
            String idExp = linhaSeparada[1];
            String tipoCliente = linhaSeparada[2];
            String ano = linhaSeparada[3];
            String mes = linhaSeparada[4];


            Venda newVenda = new Venda(idVenda, idExp, tipoCliente, ano, mes);

            vendaArray.add(newVenda);
        }
        return vendaArray;
    }
}
