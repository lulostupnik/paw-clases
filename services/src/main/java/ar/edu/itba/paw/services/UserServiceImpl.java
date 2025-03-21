package ar.edu.itba.paw.services;

import ar.edu.itba.paw.interfaces.UserService;
import ar.edu.itba.paw.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User createUser(String email, String password) {
        return new User(email, password); //OBS: esto deberia estar en la capa de persistencia. Lo hacemos como un dummy para testear.
    }
}
