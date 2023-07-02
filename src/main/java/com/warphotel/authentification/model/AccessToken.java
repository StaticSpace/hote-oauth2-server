package com.warphotel.authentification.model;

import lombok.*;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AccessToken {

    private UUID id;

    private String token;

    private ZonedDateTime creatingTime;

    private Duration lifeDuration;
}

