package ar.edu.itba.paw.interfaces;

import ar.edu.itba.paw.models.User;

public interface UserService {
    /**
     * Create a new user.
     *
     * @param username The name of the user.
     * @return The created user.
     */
    User create(String username);
    User findById(final long id);
}
