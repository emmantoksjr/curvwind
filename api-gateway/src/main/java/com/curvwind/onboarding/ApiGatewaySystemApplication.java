package com.curvwind.onboarding;

import com.curvwind.onboarding.requests.RegisterRequest;
import com.curvwind.onboarding.services.RegisterService;
import com.curvwind.onboarding.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;

@SpringBootApplication
public class ApiGatewaySystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGatewaySystemApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    CommandLineRunner run(RegisterService registerService) {
        return args -> {
            registerService.register(new RegisterRequest(
                    "Emma",
                    "emma@gmail.com",
                    "1702655705",
                    LocalDate.of(1996,12,30),
                    "http://callback.com",
                    "web",
                    "password"));

        };
    }
}