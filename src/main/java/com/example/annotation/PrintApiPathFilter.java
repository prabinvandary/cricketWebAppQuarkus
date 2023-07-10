package com.example.annotation;

import com.example.PrintApiPath;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.ext.Provider;
import org.jboss.logging.Logger;

@PrintApiPath
@Provider
public class PrintApiPathFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) {
        System.out.println("Requested Api path is:" +requestContext.getUriInfo().getAbsolutePath().toString());
    }
}
