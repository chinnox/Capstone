package com.capstone3.capstone.appuser;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@Builder
@Document
@AllArgsConstructor
@NoArgsConstructor
public class AppUser implements UserDetails {

    public AppUser(String username,
                   String password,
                   String confirmPassword,
                   String fullName,
                   String email,
                   String address,
                   Integer mobile,
                   Boolean isActive,
                   AppUserRole appUserRole) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.mobile = mobile;
        this.isActive = isActive;
        this.appUserRole = appUserRole;
    }

    @Id
    private String id;
    @Indexed(unique = true)
    private String username;
    private String password;
    private String confirmPassword;
    private String fullName;
    @Indexed(unique = true)
    private String email;
    private String address;
    private Integer mobile;
    private Boolean isActive;

    private AppUserRole appUserRole;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(appUserRole.name()));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
