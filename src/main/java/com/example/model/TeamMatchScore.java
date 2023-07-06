/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;


import com.example.enumvalues.TossAction;
import com.example.model.generic.GenericAbstractClass;
import com.example.model.generic.GenericInterface;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

/**
 *
 * @author prabin
 */
@Entity
@Table(name = "team_match_score")
public class TeamMatchScore extends GenericAbstractClass implements GenericInterface {

    @ManyToOne(optional = false)
    @Nonnull
    @JoinColumn(name = "team_id", referencedColumnName = "id", nullable = false)
    private Team team;

    private Integer score;

    @ManyToOne(optional = false)
    @Nonnull
    @JoinColumn(name = "cricket_match_id", referencedColumnName = "id", nullable = false)
    private CricketMatch cricketMatch;

    @Column(name = "is_winner")
    private Boolean isWinner;

    @Enumerated(EnumType.STRING)
    @Column(name = "toss_action",length = 50)
    private TossAction tossAction;

    public TeamMatchScore() {
    }

    public TeamMatchScore(Long id, Team team, Integer score, CricketMatch cricketMatch, Boolean isWinner, TossAction tossAction) {
        this.setId(id);
        this.team = team;
        this.score = score;
        this.cricketMatch = cricketMatch;
        this.isWinner = isWinner;
        this.tossAction = tossAction;
    }

    public CricketMatch getCricketMatch() {
        return cricketMatch;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setCricketMatch(CricketMatch cricketMatch) {
        this.cricketMatch = cricketMatch;
    }

    public Boolean getIsWinner() {
        return isWinner;
    }

    public Team getTeam() {
        return team;
    }

    public Integer getScore() {
        return score;
    }

    public TossAction getTossAction() {
        return tossAction;
    }

    public void setIsWinner(Boolean isWinner) {
        this.isWinner = isWinner;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setTossAction(TossAction tossAction) {
        this.tossAction = tossAction;
    }



}
