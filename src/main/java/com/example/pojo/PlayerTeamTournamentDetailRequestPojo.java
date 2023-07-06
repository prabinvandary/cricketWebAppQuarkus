/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pojo;

import com.example.enumvalues.PlayerPosition;
import com.example.model.Player;
import com.example.model.TeamTournament;

import java.util.List;

/**
 *
 * @author prabin
 */
public class PlayerTeamTournamentDetailRequestPojo {

    private List<PlayerTeamTournamentDetailRequestPojo> listOfRequest;

    private Player player;

    private TeamTournament teamTournament;

    private Long Id;

    private Long teamTournamentId;

    private Long playerId;

    private Boolean isWicketKeeper;

    private PlayerPosition playerPosition;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getTeamTournamentId() {
        return teamTournamentId;
    }

    public void setTeamTournamentId(Long teamTournamentId) {
        this.teamTournamentId = teamTournamentId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public TeamTournament getTeamTournament() {
        return teamTournament;
    }

    public void setTeamTournament(TeamTournament teamTournament) {
        this.teamTournament = teamTournament;
    }

    public Boolean getIsWicketKeeper() {
        return isWicketKeeper;
    }

    public void setIsWicketKeeper(Boolean isWicketKeeper) {
        this.isWicketKeeper = isWicketKeeper;
    }

    public PlayerPosition getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(PlayerPosition playerPosition) {
        this.playerPosition = playerPosition;
    }

    public List<PlayerTeamTournamentDetailRequestPojo> getListOfRequest() {
        return listOfRequest;
    }

    public void setListOfRequest(List<PlayerTeamTournamentDetailRequestPojo> listOfRequest) {
        this.listOfRequest = listOfRequest;
    }

    public PlayerTeamTournamentDetailRequestPojo() {
    }

    public PlayerTeamTournamentDetailRequestPojo(List<PlayerTeamTournamentDetailRequestPojo> listOfRequest, Player player, TeamTournament teamTournament, Long Id, Long teamTournamentId, Long playerId, Boolean isWicketKeeper, PlayerPosition playerPosition) {
        this.listOfRequest = listOfRequest;
        this.player = player;
        this.teamTournament = teamTournament;
        this.Id = Id;
        this.teamTournamentId = teamTournamentId;
        this.playerId = playerId;
        this.isWicketKeeper = isWicketKeeper;
        this.playerPosition = playerPosition;
    }
    
}
