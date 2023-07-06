/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.cricketMatch;


import com.example.model.CricketMatch;
import com.example.model.Team;
import com.example.model.TeamMatchScore;
import com.example.model.Tournament;
import com.example.pojo.cricketMatch.CricketMatchDetailRequestPojo;
import com.example.pojo.cricketMatch.UpdateRunDetailRequestPojo;
import com.example.pojo.cricketMatch.UpdateWinnerDetailRequestPojo;
import com.example.repository.CricketMatchRepository;
import com.example.repository.TeamMatchScoreRepository;
import com.example.repository.TeamRepository;
import com.example.repository.TournamentRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

/**
 *
 * @author prabin
 */
public class CricketMatchServiceImpl implements CricketMatchService {

    @Inject
    private CricketMatchRepository cricketMatchRepository;

    @Inject
    private TeamRepository teamRepository;

    @Inject
    private TournamentRepository tournamentRepository;

    @Inject
    TeamMatchScoreRepository teamMatchScoreRepository;

    @Override
    @Transactional
    public CricketMatch saveCricketMatch(CricketMatchDetailRequestPojo requestPojo) {
        CricketMatch cricketMatch = new CricketMatch();
        Team firstTeam = teamRepository.findById(requestPojo.getTeamMatchDetailRequestPojo().getFirstTeamId());
        Team secondTeam = teamRepository.findById(requestPojo.getTeamMatchDetailRequestPojo().getSecondTeamId());
        Tournament tournament = tournamentRepository.findById(requestPojo.getTournamentId());

        if (requestPojo.getMatchId() != null) {
            cricketMatch = cricketMatchRepository.findById(requestPojo.getMatchId());
            if (cricketMatch == null) {
                cricketMatch = new CricketMatch();
            }
        }
        cricketMatch.setMatchDate(requestPojo.getMatchDate());
        cricketMatch.setVenue(requestPojo.getMatchVenue());
        if (tournament == null) {
            throw new RuntimeException("Tournament not found by given id");
        }
        if (firstTeam == null) {
            throw new RuntimeException("Team not found by given id " + requestPojo.getTeamMatchDetailRequestPojo().getFirstTeamId());
        }
        if (secondTeam == null) {
            throw new RuntimeException("Team not found by given id " + requestPojo.getTeamMatchDetailRequestPojo().getFirstTeamId());
        }
        cricketMatchRepository.persist(cricketMatch);
        saveTeamMatchScore(cricketMatch, firstTeam, requestPojo);
        saveTeamMatchScore(cricketMatch, secondTeam, requestPojo);
        return cricketMatch;
    }

    private TeamMatchScore saveTeamMatchScore(CricketMatch cricketMatch, Team team, CricketMatchDetailRequestPojo requestPojo) {
        TeamMatchScore teamMatchScore = new TeamMatchScore();
        if (requestPojo.getTeamMatchScoreId() != null) {
            teamMatchScore = teamMatchScoreRepository.getByMatch(cricketMatch, team);
            if (teamMatchScore == null) {
                teamMatchScore = new TeamMatchScore();
            }
        }
        if (requestPojo.getTeamMatchDetailRequestPojo().getTossWinTeamId().equals(team.getId())) {
            teamMatchScore.setTossAction(requestPojo.getTeamMatchDetailRequestPojo().getTossWinTeamAction());
        }
        teamMatchScore.setTossAction(requestPojo.getTeamMatchDetailRequestPojo().getTossLooseTeamAction());
        teamMatchScore.setCricketMatch(cricketMatch);
        teamMatchScore.setTeam(team);
        teamMatchScoreRepository.persist(teamMatchScore);
        return teamMatchScore;
    }

    public TeamMatchScore updateTeamRun(UpdateRunDetailRequestPojo requestPojo) {
        TeamMatchScore teamMatchScore = teamMatchScoreRepository.findById(requestPojo.getTeamMatchScoreId());
        if (teamMatchScore == null) {
            throw new RuntimeException("Team match details not found by given id");
        }

        teamMatchScore.setScore(requestPojo.getScore());
        teamMatchScoreRepository.persist(teamMatchScore);
        return teamMatchScore;
    }

    public TeamMatchScore updateTeamWinner(UpdateWinnerDetailRequestPojo requestPojo) {
        TeamMatchScore teamMatchScore = teamMatchScoreRepository.findById(requestPojo.getTeamMatchScoreId());
        if (teamMatchScore == null) {
            throw new RuntimeException("Team match details not found by given id");
        }
        teamMatchScore.setIsWinner(requestPojo.getIsWinner());
        teamMatchScoreRepository.persist(teamMatchScore);
        return teamMatchScore;
    }

    public TeamMatchScore addTeamRun(UpdateRunDetailRequestPojo requestPojo) {
        TeamMatchScore teamMatchScore = teamMatchScoreRepository.findById(requestPojo.getTeamMatchScoreId());
        if (teamMatchScore == null) {
            throw new RuntimeException("Team match details not found by given id");
        }

        teamMatchScore.setScore(teamMatchScore.getScore()+requestPojo.getScore());
        teamMatchScoreRepository.persist(teamMatchScore);
        return teamMatchScore;
    }
}
