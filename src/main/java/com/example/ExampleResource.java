package com.example;

import com.example.model.Player;
import com.example.repository.PlayerRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;


@Path("/hello")
public class ExampleResource {

    @Inject
    PlayerRepository playerRepository;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/player")
    public List<Player> helloPlayer() {
        return new ArrayList<>();
    }
}
