package com.warphotel.authentification.model;

import lombok.*;

import java.time.ZonedDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Role {

    private String name;

    private String description;

    private ZonedDateTime creatingTime;

    private ZonedDateTime blockingTime;

    private ZonedDateTime deleteTime;
}
