package com.example.repository;

import com.example.model.CricketMatch;
import com.example.model.Team;
import com.example.model.TeamMatchScore;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface TeamMatchScoreRepository extends PanacheRepository<TeamMatchScore> {
    TeamMatchScore getByMatch(CricketMatch cricketMatch, Team team);
}
