package com.UpperFasster.Postman.domain.User;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            User user = new User(
                    1,
                    "Test",
                    "TestLast",
                    "fisrt@test.com",
                    "123123123",
                    LocalDateTime.now()
            );
            repository.saveAll(
                    List.of(user)
            );
        };
    }
}
