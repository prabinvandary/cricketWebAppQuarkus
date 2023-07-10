//package com.example.annotation;
//
//import io.quarkus.arc.Unremovable;
//import jakarta.interceptor.AroundInvoke;
//import jakarta.interceptor.Interceptor;
//import jakarta.interceptor.InvocationContext;
//import org.jboss.resteasy.reactive.server.spi.ResteasyReactiveContainerRequestContext;
//
//
//
//@Interceptor
//@Unremovable
//@PrintApiPathInterceptorBinding
//public class PrintApiPathInterceptor {
//
//    ResteasyReactiveContainerRequestContext requestContext;
//
//    @AroundInvoke
//    public Object printApiPath(InvocationContext context) throws Exception {
//        String apiPath = getApiPathFromRequest();
//        System.out.println("API Path: " + apiPath);
//        return context.proceed();
//    }
//
//    private String getApiPathFromRequest() {
//        return requestContext.getUriInfo().getPath();
//    }
//}
