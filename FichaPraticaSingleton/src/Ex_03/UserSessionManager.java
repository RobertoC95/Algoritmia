package Ex_03;

import Ex_01.DatabaseConnection;

import java.util.Random;

public class UserSessionManager {
    private static UserSessionManager instance;
    private int sessionToken;
    private String lastAccess;

    Random rd = new Random();
    public UserSessionManager() {
        this.sessionToken = sessionToken = rd.nextInt(0, 555555555);
        this.lastAccess = lastAccess;
    }

    public static UserSessionManager getInstance() {
        if(instance == null){
            instance = new UserSessionManager();
        }
        return instance;
    }

    public static void setInstance(UserSessionManager instance) {
        UserSessionManager.instance = instance;
    }

    public void setSessionToken(int sessionToken) {
        this.sessionToken = sessionToken = rd.nextInt();
    }

    public void setLastAccess(String lastAccess) {
        this.lastAccess = lastAccess;
    }

    public int getSessionToken() {
        return sessionToken;
    }

    public String getLastAccess() {
        return lastAccess;
    }

    public void updateLastAccessTime() {
        lastAccess = String.valueOf(System.currentTimeMillis());
    }

    public String getLastAccessTime() {
        return lastAccess;
    }
}
