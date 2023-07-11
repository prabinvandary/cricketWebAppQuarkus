package com.example.api;

import com.example.service.player.PlayerService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.SecurityContext;

@Path("/secured")
public class TokenSecuredResource {

    @Inject
    PlayerService playerService;

    @GET
    @Path("/player")
    @RolesAllowed({ "User", "Admin" })
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPlayer(@Context SecurityContext ctx) {
        return Response.ok(playerService.getAllPlayer()).status(200).build();
    }
}
