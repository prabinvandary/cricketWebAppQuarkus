/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.api;


import com.example.model.Tournament;
import com.example.repository.TournamentRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

/**
 *
 * @author prabin
 */
@Path("/tournament")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TournamentResource {

    @Inject
    private TournamentRepository tournamentRepository;

    @POST
    public Tournament saveTournament(Tournament tournament) {
        tournamentRepository.persist(tournament);
        return tournament;
    }

    @GET
    public List<Tournament> getAllTournament() {
        return (List<Tournament>) tournamentRepository.findAll();
    }

}
