package com.warphotel.authentification.controller;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1")
public class AuthentificationControllerV1 {

    @GetMapping(value = "/checksession")
    public ResponseEntity<HttpStatus> checkSession(HttpRequest httpRequest) {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PostMapping(value = "/authorize", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseLoginPasswordDTO> authorize(@RequestBody(required = true) final RequestLoginPasswordDTO loginPasswordDTO) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("HEADER-NAME", "HEADER-VALUE")
                .contentType(MediaType.APPLICATION_JSON)
                .body(ResponseLoginPasswordDTO.builder()
                        .build());
    }

    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseOauthMethodDTO> login(@RequestBody(required = true) final RequestOauthMethodDTO requestOauthMethodDTO) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("HEADER-NAME", "HEADER-VALUE")
                .contentType(MediaType.APPLICATION_JSON)
                .body(ResponseOauthMethodDTO.builder()
                        .build());
    }

    @DeleteMapping(value = "/logout")
    public ResponseEntity<HttpStatus> logout(HttpRequest httpRequest) {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
