package com.warphotel.authentification.model;


import lombok.*;

import java.time.Duration;
import java.time.ZonedDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class RefreshToken {

    private String token;

    private ZonedDateTime creatingTime;

    private Duration lifeDuration;

}
