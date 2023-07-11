package com.example.api;

import com.example.api.baseController.BaseResource;
import com.example.security.jwt.GenerateJwtToken;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/token")
public class TokenResource extends BaseResource {
    GenerateJwtToken generateJwtToken=new GenerateJwtToken();
    @GET
    public Response getToken() {
        return Response.ok(generateJwtToken.generateToken()).status(200).build();
    }
}
