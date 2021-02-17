package com.example.workshop.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserRegisterService {

    @Autowired
    private UserRepository userRepository;

    public User register(UserRequest userRequest) {
        // 1. Check name
        Optional<User> user = userRepository.findByName(userRequest.getName());
        boolean isUserNameDuplicated = user.isPresent();
        if(isUserNameDuplicated) {
            throw new NameDuplicateException("Duplicated with username="+ userRequest.getName());
        }
        // 2. Create
        User newUser = new User();
        newUser.setName(userRequest.getName());
        newUser.setAge(userRequest.getAge());
        newUser = userRepository.save(newUser);
        // 3. return new user
        return newUser;
    }

}
