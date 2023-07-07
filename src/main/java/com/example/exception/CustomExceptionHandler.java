
package com.example.exception;

import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class CustomExceptionHandler implements ExceptionMapper<Exception> {


    @Override
    public Response toResponse(Exception e) {
        int status = 500;
        String message = e.getMessage();

        if (e instanceof BadRequestException) {
            status = 400;
        } else if (e instanceof NotFoundException) {
            status = 404;
        }

        return Response.status(status).entity(new ErrorResponse(status, message)).build();
    }

    static class ErrorResponse {

        private int status;
        private String message;

        public ErrorResponse(int status, String message) {
            this.status = status;
            this.message = message;
        }

        public int getStatus() {
            return status;
        }

        public String getMessage() {
            return message;
        }
    }
}