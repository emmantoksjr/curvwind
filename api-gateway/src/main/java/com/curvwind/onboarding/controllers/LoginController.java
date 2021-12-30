//package com.curvwind.onboarding.controllers;
//
//import com.curvwind.onboarding.requests.LoginRequest;
//import com.curvwind.onboarding.resources.LoginResource;
//import com.curvwind.onboarding.services.UserService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.DisabledException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//
//@RestController
//@Slf4j
//@CrossOrigin(origins = "*", maxAge = 3600)
//@RequestMapping("/api/v1")
//public class LoginController {
//    @Autowired
//    private UserService userDetailsService;
//
//    @PostMapping("/login")
//    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) throws Exception {
//
//        authenticate(loginRequest.getUserName(), loginRequest.getPassword());
//
//        final UserDetails userDetails = userDetailsService.loadUserByUsername(loginRequest.getUserName());
//
//        final String token = jwtTokenUtil.generateToken(userDetails);
//
//        return ResponseEntity.ok(
//                new LoginResource(token,userDetails)
//        );
//    }
//
//    private void authenticate(String username, String password) throws Exception {
//        try {
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
//        } catch (DisabledException e) {
//            throw new Exception("USER_DISABLED", e);
//        } catch (BadCredentialsException e) {
//            throw new Exception("INVALID_CREDENTIALS", e);
//        }
//    }
//}
//
