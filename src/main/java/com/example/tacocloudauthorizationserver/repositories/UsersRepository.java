package com.example.tacocloudauthorizationserver.repositories;

import com.example.tacocloudauthorizationserver.entities.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Long> {

    Users findByUsername(String username);

}
