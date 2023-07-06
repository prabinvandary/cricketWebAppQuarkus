/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.playerTeamTournament;

import com.example.model.Player;
import com.example.model.PlayerTeamTournament;
import com.example.model.TeamTournament;
import com.example.pojo.PlayerTeamTournamentDetailRequestPojo;
import com.example.repository.PlayerRepository;
import com.example.repository.PlayerTeamTournamentRepository;
import com.example.repository.TeamTournamentRepository;
import jakarta.inject.Inject;

/**
 *
 * @author prabin
 */
public class PlayerTeamTournamentServiceImpl implements PlayerTeamTournamentService {

    @Inject
    private PlayerTeamTournamentRepository playerTeamTournamentRepository;

    @Inject
    private PlayerRepository playerRepository;

    @Inject
    private TeamTournamentRepository teamTournamentRepository;

    @Override
    public PlayerTeamTournament savePlayerTeamTournament(PlayerTeamTournamentDetailRequestPojo requestPojo) {
        try {
            PlayerTeamTournament playerTeamTournament = new PlayerTeamTournament();
            if (requestPojo.getId() != null) {
                playerTeamTournament = playerTeamTournamentRepository.findById(requestPojo.getId());
                if (playerTeamTournament == null) {
                    playerTeamTournament = new PlayerTeamTournament();
                }
            }
            TeamTournament teamTournament = teamTournamentRepository.findById(requestPojo.getTeamTournamentId());
            if (teamTournament == null) {
                throw new RuntimeException("Team tournament not found by given Id");
            }
            Player player = playerRepository.findById(requestPojo.getPlayerId());
            if (player == null) {
                throw new RuntimeException("Player not found by given id.");
            }
            playerTeamTournament.setPlayer(player);
            playerTeamTournament.setTeamTournament(teamTournament);
            playerTeamTournament.setIsWicketKeeper(requestPojo.getIsWicketKeeper());
            playerTeamTournament.setPlayerPosition(requestPojo.getPlayerPosition());
            playerTeamTournamentRepository.persist(playerTeamTournament);
            return playerTeamTournament;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
