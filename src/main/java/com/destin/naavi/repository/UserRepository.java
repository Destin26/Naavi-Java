package com.destin.naavi.repository;

import com.destin.naavi.documents.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository  extends ReactiveMongoRepository<User, String> {
    Mono<User> findByEmail(String email);
}
