package com.example;

import jakarta.ws.rs.container.ContainerRequestContext;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PrintApiPath {
}
