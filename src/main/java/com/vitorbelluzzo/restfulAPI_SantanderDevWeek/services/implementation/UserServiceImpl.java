package com.vitorbelluzzo.restfulAPI_SantanderDevWeek.services.implementation;
import com.vitorbelluzzo.restfulAPI_SantanderDevWeek.model.User;
import com.vitorbelluzzo.restfulAPI_SantanderDevWeek.repository.UserRepository;
import com.vitorbelluzzo.restfulAPI_SantanderDevWeek.services.UserService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchFieldError::new);
    }

    public User createUser(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("Account already exist!");
        }
        if (userRepository.existsByCardNumber(userToCreate.getCard().getNumber())) {
            throw new IllegalArgumentException("Cardholder already exist!");

        }
        return userRepository.save(userToCreate);
    }



}
