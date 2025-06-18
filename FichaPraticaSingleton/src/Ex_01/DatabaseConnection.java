package Ex_01;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private String connectionString;

    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static DatabaseConnection getInstance(String connectionString) {
       if(instance == null){
           instance = new DatabaseConnection(connectionString);
       }
        return instance;
    }

    public void connect(){
        //Código para connectar à base de dados usando a connectionString
        System.out.println("Conectado à base de dados: " + connectionString);
    }

    public void disconnect(){
        //Códio para desconectar da base de dados
        System.out.println("Desconectado da base de dados: " + connectionString);
    }





}

