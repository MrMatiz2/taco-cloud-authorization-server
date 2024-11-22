package com.example.tacocloudauthorizationserver.configuration;

import com.example.tacocloudauthorizationserver.entities.Users;
import com.example.tacocloudauthorizationserver.repositories.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

@Profile({"!prod", "!qa"})
@EnableConfigurationProperties
@Configuration
public class DevelopmentConfig {

    @Bean
    public CommandLineRunner dataLoader(UsersRepository userRepo, PasswordEncoder encoder) {
        return args -> {
            userRepo.save(new Users("alejandro", encoder.encode("123"), "ROLE_ADMIN"));
        };
    }

}
