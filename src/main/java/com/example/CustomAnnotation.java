package com.example;

import jakarta.ws.rs.HttpMethod;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CustomAnnotation {
        String value();
}
