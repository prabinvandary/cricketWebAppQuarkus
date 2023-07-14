package com.example.security;

import com.example.exception.AppException;
import io.smallrye.jwt.auth.principal.JWTParser;
import io.smallrye.jwt.auth.principal.ParseException;
import jakarta.inject.Inject;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.PreMatching;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.ext.Provider;
import lombok.SneakyThrows;

@Provider
@PreMatching
public class RequestFilter implements ContainerRequestFilter {
    @Inject
    JWTParser parser;

    public RequestFilter() {
        System.out.println("From container request filter constructor");
    }

    @SneakyThrows
    @Override
    public void filter(ContainerRequestContext containerRequestContext) {
        MultivaluedMap<String, String> headers = containerRequestContext.getHeaders();
        headers.add("Access-Control-Allow-Origin", "http://localhost:5173");
        if (containerRequestContext.getUriInfo().getAbsolutePath().toString().equals("http://localhost:5050/webapp/token")) {
            String userName = containerRequestContext.getHeaderString("userName");
            String password = containerRequestContext.getHeaderString("password");
            if (userName == null || password == null)
                throw new AppException("Please provide username and password");
            if (!(userName.contentEquals("prabininwork@gmail.com") && password.contentEquals("prabin12#$%")))
                throw new AppException("Username or password does not matched");
            return;
        }
        if (containerRequestContext.getUriInfo().getAbsolutePath().toString().equals("http://localhost:5050/webapp/player"))
            return;
        decryptToken(containerRequestContext);
    }

    private void decryptToken(ContainerRequestContext containerRequestContext) throws ParseException {
        String bearerToken = containerRequestContext.getHeaderString("Authorization");
        if (bearerToken == null)
            throw new AppException("Please provide authorization token");
    }
}
