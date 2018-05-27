package com.example.demoontomanynosql.person;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository
        extends MongoRepository<Person, String> {
}
