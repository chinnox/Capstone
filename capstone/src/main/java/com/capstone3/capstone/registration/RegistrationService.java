package com.capstone3.capstone.registration;

import com.capstone3.capstone.appuser.AppUser;
import com.capstone3.capstone.appuser.AppUserRepository;
import com.capstone3.capstone.auth.AuthenticationResponse;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RegistrationService {

    private final AppUserRepository appUserRepository;

    public List<AppUser> fetchAllUsers(){
        return appUserRepository.findAll();
    }


    public AppUser register(AppUser user){
        // TODO : encode password
        return appUserRepository.save(user);
    }
}
