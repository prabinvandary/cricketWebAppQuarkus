package com.example.security.jwt;

import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;

import org.eclipse.microprofile.jwt.Claims;

import io.smallrye.jwt.build.Jwt;

public class GenerateJwtToken {

    public String generateToken() {
        return Jwt.issuer("https://example.com/issuer")
                .upn("prabininwork@gmail.com")
                .groups(new HashSet<>(Arrays.asList("User", "Admin")))
                .issuedAt(Instant.now())
                .expiresAt(Instant.now().plusSeconds(8000))
                .subject("token to access api")
                .sign();
    }
}