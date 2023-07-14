package com.example.security.jwt;

import io.smallrye.jwt.build.Jwt;

import java.util.Arrays;
import java.util.HashSet;

public class GenerateJwtToken {

    public String generateToken() {
        return Jwt.issuer("https://example.com/issuer")
                .upn("prabininwork@gmail.com")
                .groups(new HashSet<>(Arrays.asList("User", "Admin")))
                .sign();
    }
}