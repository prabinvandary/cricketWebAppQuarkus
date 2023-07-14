package com.example.api;

import com.example.PrintApiPath;
import com.example.controller.BaseController;
import com.example.enumvalues.PlayerRole;
import com.example.model.Player;
import com.example.service.player.PlayerService;
import com.example.util.GlobalApiResponse;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestResponse;

/**
 * @author prabin
 */
@Path("/player")
@Produces(MediaType.APPLICATION_JSON)
public class PlayerResource extends BaseController {

    @Inject
    PlayerService playerService;

    @POST
//    @RolesAllowed({"User", "Admin"})
    @PrintApiPath
    @Consumes(MediaType.APPLICATION_JSON)
    public Response savePlayer(Player player) {
        return Response.ok(playerService.savePlayer(player)).status(200).build();
    }

    @POST
    @Path("/player")
    @PrintApiPath
    @Consumes(MediaType.APPLICATION_JSON)
    public RestResponse<GlobalApiResponse> savePlayerR(Player player) {
          return RestResponse.ok(successResponse("Player Saved successfully", playerService.savePlayer(player)));
    }


    @GET
    @PrintApiPath
//    @RolesAllowed({"User", "Admin"})
    public Response getAllPlayer() {
        return Response.ok(playerService.getAllPlayer()).status(200).build();
    }

    @GET
    @Path("/{id}")
    @RolesAllowed({"User", "Admin"})
    @PrintApiPath
    public Response getPlayerById(@PathParam("id") Long id) {
        return Response.ok(playerService.getPlayerById(id)).status(200).build();
    }

    @GET
    @Path("/id/{id}")
    @RolesAllowed({"User", "Admin"})
    @PrintApiPath
    public Response getPlayerByIdA(@PathParam("id") Long id) {
        return Response.ok(playerService.getPlayerById(id)).status(200).build();
    }

    @PUT
    @Path("/{id}")
    @RolesAllowed({"User", "Admin"})
    @PrintApiPath
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updatePlayerById(@PathParam("id") Long id, Player player) {
        return Response.ok(playerService.upadtePlayer(id, player)).status(200).build();
    }

    @DELETE
    @Path("/{id}")
//    @RolesAllowed({"User", "Admin"})
    @PrintApiPath
    public Response deletePlayerById(@PathParam("id") Long id) {
        return Response.ok(playerService.deletePlayer(id)).status(200).build();
    }

    @GET
    @Path("/playerRole")
    @RolesAllowed({"User", "Admin"})
    @PrintApiPath
    public Response getPlayerRoleApi() {
        return Response.ok(PlayerRole.values()).status(200).build();
    }

}
