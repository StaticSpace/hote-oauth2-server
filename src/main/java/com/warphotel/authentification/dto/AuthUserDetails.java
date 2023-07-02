package com.warphotel.authentification.dto;

import com.warphotel.authentification.model.UserAuthModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthUserDetails implements UserDetails {

    private UserAuthModel userAuthModel;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return userAuthModel.getPassword();
    }

    @Override
    public String getUsername() {
        return userAuthModel.getLogin();
    }

    @Override
    public boolean isAccountNonExpired() {
        return !(userAuthModel.getIsBlocked() || userAuthModel.getIsDeleted());
    }

    @Override
    public boolean isAccountNonLocked() {
        return !(userAuthModel.getIsBlocked());
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
