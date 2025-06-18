package Ex_03;

import java.util.Random;

public class UserSessionManager {
    private static UserSessionManager instance;
    private int sessionToken;
    private String lastAccess;


    public UserSessionManager(int sessionToken, String lastAccess) {
        this.sessionToken = sessionToken;
        this.lastAccess = lastAccess;
    }


    Random rd = new Random();






}
