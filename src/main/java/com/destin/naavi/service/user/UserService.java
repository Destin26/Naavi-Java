package com.destin.naavi.service.user;

import com.destin.naavi.documents.User;
import com.destin.naavi.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    UserRepository userRepository;
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Mono<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Mono<User> createUser(User user) {
        return userRepository.save(user);
    }
}