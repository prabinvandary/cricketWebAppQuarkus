/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;


import com.example.enumvalues.MatchBowlAction;
import com.example.model.generic.GenericAbstractClass;
import com.example.model.generic.GenericInterface;
import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.*;

/**
 *
 * @author prabin
 */
@Entity
@Table(name = "match_summary")
public class MatchSummary extends GenericAbstractClass implements GenericInterface {

    private Integer run;

    private Double over;

    @Enumerated(EnumType.STRING)
    @Column(name = "match_bowl_action")
    private MatchBowlAction matchBowlAction;

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn(name = "bats_men_id", referencedColumnName = "id", nullable = false)
    private Player playerBatsMen;

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn(name = "bower_id", referencedColumnName = "id", nullable = false)
    private Player playerBolwer;
    
    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn(name = "cricket_match_id", referencedColumnName = "id", nullable = false)
    private CricketMatch cricketMatch;

    public MatchSummary() {
    }

    public MatchSummary(Long id, Integer run, Double over, MatchBowlAction action, Player batsMenId, Player bowlerId, CricketMatch matchId) {
        this.setId(id);
        this.run = run;
        this.over = over;
        this.matchBowlAction = action;
        this.playerBatsMen = batsMenId;
        this.playerBolwer = bowlerId;
        this.cricketMatch = matchId;
    }

    public MatchBowlAction getMatchBowlAction() {
        return matchBowlAction;
    }

    public Player getBatsMenId() {
        return playerBatsMen;
    }

    public Player getBowlerId() {
        return playerBolwer;
    }

    public CricketMatch getMatchId() {
        return cricketMatch;
    }

    public Integer getRun() {
        return run;
    }

    public Double getOver() {
        return over;
    }

    public void setMatchBowlAction(MatchBowlAction matchBowlAction) {
        this.matchBowlAction = matchBowlAction;
    }

    public void setBatsMenId(Player playerBatsmen) {
        this.playerBatsMen = playerBatsmen;
    }

    public void setBowlerId(Player playerBowler) {
        this.playerBolwer = playerBowler;
    }

    public void setMatchId(CricketMatch cricketMatch) {
        this.cricketMatch = cricketMatch;
    }

    public void setOver(Double over) {
        this.over = over;
    }

    public void setRun(Integer run) {
        this.run = run;
    }


}
