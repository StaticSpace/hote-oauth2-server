package com.warphotel.authentification.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UserAuthModel {

    private AccessToken accessToken;

    private RefreshToken refreshToken;

    private Role role;

    private String login;

    private String password;

    private Boolean isBlocked;

    private Boolean isDeleted;

}
