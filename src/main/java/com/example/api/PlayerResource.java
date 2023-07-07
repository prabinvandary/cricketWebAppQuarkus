package com.example.api;

import com.example.api.baseController.ApiResponse;
import com.example.api.baseController.BaseResource;
import com.example.enumvalues.PlayerRole;
import com.example.model.Player;
import com.example.repository.PlayerRepository;
import com.example.service.player.PlayerService;
import jakarta.inject.Inject;
import jakarta.json.stream.JsonParsingException;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author prabin
 */
@Path("/player")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PlayerResource extends BaseResource {

    @Inject
    PlayerRepository playerRepository;
    @Inject
    PlayerService playerService;

    @POST
    public ApiResponse savePlayer(Player player) throws JsonParsingException {
        playerRepository.persist(player);
        return success(200, "Player saved successfully",null );
    }

    @GET
    public ApiResponse getAllPlayer() {
        return success(200, "Player saved successfully", playerRepository.findAll());
    }

    @GET
    @Path("/{id}")
    public ApiResponse getPlayerById(@PathParam("id") Long id) {
        return success(200, "Player saved successfully", playerRepository.findById(id));
    }

    @PUT
    @Path("/{id}")
    public ApiResponse updatePlayerById(@PathParam("id") Long id, Player player) {
        return success(200, "Player updated successfully", playerService.upadtePlayer(id, player));
    }

    @DELETE
    @Path("/{id}")
    public ApiResponse deletePlayerById(@PathParam("id") Long id) {
        return success(200, "Player Deleted Successfully", playerService.deletePlayer(id));
    }

    @GET
    @Path("/playerRole")
    public ApiResponse getPlayerRoleApi() {
        return success(200, "Player api fetched successfully", PlayerRole.values());
    }

    @GET
    @Path("/helloworld")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
        return "Hello world";
    }
}
