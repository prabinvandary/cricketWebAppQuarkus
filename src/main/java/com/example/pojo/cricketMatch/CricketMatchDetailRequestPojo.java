/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pojo.cricketMatch;

import java.util.Date;

/**
 *
 * @author prabin
 */
public class CricketMatchDetailRequestPojo {
    private Long matchId;
    private Long tournamentId;
    private Date matchDate;
    private String matchVenue;
    private TeamMatchDetailRequestPojo teamMatchDetailRequestPojo;
    private Long firstTeamId;
    private Long secondTeamId;
    private Long teamMatchScoreId;

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Long getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Long tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public String getMatchVenue() {
        return matchVenue;
    }

    public void setMatchVenue(String matchVenue) {
        this.matchVenue = matchVenue;
    }

    public Long getFirstTeamId() {
        return firstTeamId;
    }

    public void setFirstTeamId(Long firstTeamId) {
        this.firstTeamId = firstTeamId;
    }

    public Long getSecondTeamId() {
        return secondTeamId;
    }

    public void setSecondTeamId(Long secondTeamId) {
        this.secondTeamId = secondTeamId;
    }

    public Long getTeamMatchScoreId() {
        return teamMatchScoreId;
    }

    public void setTeamMatchScoreId(Long teamMatchScoreId) {
        this.teamMatchScoreId = teamMatchScoreId;
    }

    public TeamMatchDetailRequestPojo getTeamMatchDetailRequestPojo() {
        return teamMatchDetailRequestPojo;
    }

    public void setTeamMatchDetailRequestPojo(TeamMatchDetailRequestPojo teamMatchDetailRequestPojo) {
        this.teamMatchDetailRequestPojo = teamMatchDetailRequestPojo;
    }

    
    public CricketMatchDetailRequestPojo() {
    }    
}
