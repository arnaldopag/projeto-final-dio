package me.dio.demo.services.implementation;

import me.dio.demo.models.user.User;
import me.dio.demo.repository.UserReposity;
import me.dio.demo.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {


    private final UserReposity userReposity;

    public UserServiceImpl(UserReposity userReposity) {
        this.userReposity = userReposity;
    }

    @Override
    public Optional<User> findByID(UUID id) {
        return userReposity.findById(id);
    }

    @Override
    public User create(User user) {
        if(user.getId() != null && userReposity.existsById(user.getId())){
            throw new IllegalArgumentException("This User ID already exists. userID: " + user.getId() );
        }
        return userReposity.save(user);
    }
}
