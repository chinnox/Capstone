package com.capstone3.capstone.registration;

import com.capstone3.capstone.appuser.AppUser;
import com.capstone3.capstone.auth.AuthenticationRequest;
import com.capstone3.capstone.auth.AuthenticationResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class RegistrationController {

    private final RegistrationService registrationService;


    @PostMapping("/register")
    public AppUser register(@RequestBody AppUser request){
        return registrationService.register(request);
    }

    @GetMapping ("/users")
    public ResponseEntity<List> getAllUsers() {
        return ResponseEntity.ok(registrationService.fetchAllUsers());
    }

}
