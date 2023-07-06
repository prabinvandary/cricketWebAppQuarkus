/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.api;


import com.example.model.Team;
import com.example.repository.TeamRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


/**
 *
 * @author prabin
 */
@Path("/team")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TeamResource {
    @Inject
    private TeamRepository teamRepository;
    
    @GET
    public List<Team> getAllTeam(){
        return (List<Team>) teamRepository.findAll();
    }
    
    @POST
    public Boolean saveTeam(Team team){
        teamRepository.persist(team);
        return Boolean.TRUE;
    }
}
