package com.curvwind.onboarding.controllers;

import com.curvwind.onboarding.requests.RegisterRequest;
import com.curvwind.onboarding.resources.UserResource;
import com.curvwind.onboarding.services.RegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/v1")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping("/register")
    public ResponseEntity<UserResource> registerUser(@Valid @RequestBody RegisterRequest request) {
        log.info("Registration flow got to register user method in RegisterController.");

        UserResource savedUser = registerService.register(request);

        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
