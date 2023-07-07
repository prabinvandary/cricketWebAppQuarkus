package com.example.repository;

import com.example.model.CricketMatch;
import com.example.model.Team;
import com.example.model.TeamMatchScore;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class TeamMatchScoreRepositoryImplements implements TeamMatchScoreRepository{
    @Override
    public TeamMatchScore getByMatch(CricketMatch cricketMatch, Team team) {
        return null;
    }
}
