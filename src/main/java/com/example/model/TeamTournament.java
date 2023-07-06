/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;


import com.example.model.generic.GenericAbstractClass;
import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author prabin
 */
@Entity
@Table(name = "team_tournament")
public class TeamTournament extends GenericAbstractClass {

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn(name = "team_id", referencedColumnName = "id", nullable = false)
    private Team team;

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn(name = "tournament_id", referencedColumnName = "id", nullable = false)
    private Tournament tournament;

    public TeamTournament() {
    }

    public TeamTournament(Long id, Team team, Tournament tournament) {
        this.setId(id);
        this.team = team;
        this.tournament = tournament;
    }

    public TeamTournament(Team team, Tournament tournament) {
        this.team = team;
        this.tournament = tournament;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

}
