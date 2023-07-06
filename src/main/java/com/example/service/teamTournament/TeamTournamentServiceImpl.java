/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.teamTournament;


import com.example.model.Team;
import com.example.model.TeamTournament;
import com.example.model.Tournament;
import com.example.pojo.TeamTournamentDetailRequest;
import com.example.repository.TeamRepository;
import com.example.repository.TeamTournamentRepository;
import com.example.repository.TournamentRepository;
import jakarta.inject.Inject;

/**
 *
 * @author prabin
 */
public class TeamTournamentServiceImpl implements TeamTournamentService{

    @Inject
    private TeamTournamentRepository teamTournamentRepository;
    
    @Inject
    private TeamRepository teamRepository;
    
    @Inject
    private TournamentRepository tournamentRepository;
       
    @Override
    public TeamTournament saveTeamTournament(TeamTournamentDetailRequest request) {
       try {
            TeamTournament teamTournament = new TeamTournament();
            Team team = teamRepository.findById(request.getTeamId());
            Tournament tournament = tournamentRepository.findById(request.getTournamentId());

            if (request.getId() != null) {
                teamTournament = teamTournamentRepository.findById(request.getId());
                if (teamTournament == null) {
                    teamTournament = new TeamTournament();
                }
            }

            if (tournament == null) {
                throw new RuntimeException("Tournament not found by given id");
            }
            if (team == null) {
                throw new RuntimeException("Team not found by given id");
            }
            teamTournament.setTeam(team);
            teamTournament.setTournament(tournament);
          teamTournamentRepository.persist(teamTournament);
          return teamTournament;
        } catch (RuntimeException e) {
            throw new RuntimeException("Couldnot save data " + e.getLocalizedMessage());
        }
        
    }
}
