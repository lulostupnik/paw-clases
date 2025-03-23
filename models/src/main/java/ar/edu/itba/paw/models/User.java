package ar.edu.itba.paw.models;

public class User {
    private final String username;
    private final long userId;

    public User (final String username, final long userId ){
        this.username = username;
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public long getUserId() {
        return userId;
    }


}
