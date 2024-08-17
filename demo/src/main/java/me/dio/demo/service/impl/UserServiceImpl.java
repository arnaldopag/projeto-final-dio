package me.dio.demo.service.impl;

import me.dio.demo.models.User;
import me.dio.demo.repository.UserReposity;
import me.dio.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {


    private final UserReposity userReposity;

    public UserServiceImpl(UserReposity userReposity) {
        this.userReposity = userReposity;
    }

    @Override
    public User findByID(UUID id) {
        return userReposity.findById(id)
                .orElseThrow(NoSuchElementException::new);

    }

    @Override
    public User create(User user) {
        if(user.getId() != null && userReposity.existsById(user.getId())){
            throw new IllegalArgumentException("This User ID already exists. userID: " + user.getId() );
        }
        return userReposity.save(user);
    }
}
