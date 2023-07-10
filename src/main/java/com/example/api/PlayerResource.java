package com.example.api;

import com.example.controller.BaseController;
import com.example.enumvalues.PlayerRole;
import com.example.exception.AppException;
import com.example.model.Player;
import com.example.repository.PlayerRepository;
import com.example.service.player.PlayerService;
import com.example.util.GlobalApiResponse;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestResponse;

/**
 * @author prabin
 */
@Path("/player")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PlayerResource extends BaseController {

    @Inject
    PlayerService playerService;

    @POST
    public Response savePlayer(Player player) {
        return Response.ok(playerService.savePlayer(player)).status(200).build();
    }

    @POST
    @Path("/player")
    public RestResponse<GlobalApiResponse> savePlayerR(@HeaderParam("name") String name, @HeaderParam("lastName") String lastName, Player player) {
        if (!(name.contentEquals("Prabin")&&lastName.contentEquals("Bhandari")))
            throw new AppException("Header Param not matched");
        return RestResponse.ok(successResponse("Player Saved successfully", playerService.savePlayer(player)));
    }


    @GET
    public Response getAllPlayer() {
        return Response.ok(playerService.getAllPlayer()).status(200).build();
    }

    @GET
    @Path("/{id}")
    public Response getPlayerById(@PathParam("id") Long id) {
        return Response.ok(playerService.getPlayerById(id)).status(200).build();
    }

    @GET
    @Path("/id/{id}")
    public RestResponse getPlayerByIdA(@PathParam("id") Long id) {
        return RestResponse.ok(playerService.getPlayerById(id));
    }

    @PUT
    @Path("/{id}")
    public Response updatePlayerById(@PathParam("id") Long id, Player player) {
        return Response.ok(playerService.upadtePlayer(id, player)).status(200).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deletePlayerById(@PathParam("id") Long id) {
        return Response.ok(playerService.deletePlayer(id)).status(200).build();
    }

    @GET
    @Path("/playerRole")
    public Response getPlayerRoleApi() {
        return Response.ok(PlayerRole.values()).status(200).build();
    }

}
