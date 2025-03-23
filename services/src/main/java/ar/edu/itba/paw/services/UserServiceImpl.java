package ar.edu.itba.paw.services;

import ar.edu.itba.paw.interfaces.UserDao;
import ar.edu.itba.paw.interfaces.UserService;
import ar.edu.itba.paw.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(final UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public User create(final String username) {
        return userDao.create(username);
    }

    @Override
    public User findById(final long id) {
        return userDao.findById(id);
    } //@TODO esto no lo pone en la guia, pero asumo que va.

}
