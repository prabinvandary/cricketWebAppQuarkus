/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pojo;


import com.example.model.Tournament;

/**
 *
 * @author prabin
 */
public class TeamTournamentDetailRequest {
    
    private Long teamId;

    private Long id;
    
    private Tournament tournament;
    
    private Long tournamentId;

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TeamTournamentDetailRequest(Long teamId, Tournament tournament) {
        this.teamId = teamId;
        this.tournament = tournament;
    }

    public TeamTournamentDetailRequest() {
    
    }

    
    public Long getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Long tournamentId) {
        this.tournamentId = tournamentId;
    }
    
}
