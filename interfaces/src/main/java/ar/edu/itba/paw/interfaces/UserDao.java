package ar.edu.itba.paw.interfaces;

import ar.edu.itba.paw.models.User;

public interface UserDao {
    //User create(String email, String password);
    User findById(final long id);
    /**
     * Create a new user.
     *
     * @param username The name of the user.
     * @return The created user.
     */
    User create(String username);
}
