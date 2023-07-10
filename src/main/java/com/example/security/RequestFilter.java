package com.example.security;

import com.example.exception.AppException;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.PreMatching;
import jakarta.ws.rs.ext.Provider;

import java.io.IOException;

@Provider
@PreMatching
public class RequestFilter implements ContainerRequestFilter {
    public RequestFilter() {
        System.out.println("From container request filter constructor");
    }

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        String name = containerRequestContext.getHeaderString("name");
        String lastName = containerRequestContext.getHeaderString("lastName");
        if (containerRequestContext.getUriInfo().getAbsolutePath().toString().equals("http://localhost:5050/webapp/player"))
            return;
        if (name==null||lastName==null)
            throw new AppException("Please provide require header param");
        if (!(name.contentEquals("Prabin") && lastName.contentEquals("Bhandari")))
            throw new AppException("Header Param not matched");
    }
}
