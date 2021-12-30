package com.curvwind.onboarding.services;

import com.curvwind.onboarding.models.User;
import com.curvwind.onboarding.requests.RegisterRequest;
import com.curvwind.onboarding.repositories.UserRepository;
import com.curvwind.onboarding.resources.UserResource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class RegisterService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserResource register(RegisterRequest request) {
        log.info("Registration flow gotten to register method in RegisterService");

        User user = User.builder()
                .userName(request.userName)
                .email(request.email)
                .phone(request.phone)
                .dob(request.dob)
                .password(passwordEncoder.encode(request.password))
                .build();

        User savedUser = userRepository.save(user);

        return UserResource.builder()
                .id(savedUser.getId())
                .userName(savedUser.getUserName())
                .email(savedUser.getEmail())
                .phone(savedUser.getPhone())
                .dob(savedUser.getDob())
                .build();
    }

}
