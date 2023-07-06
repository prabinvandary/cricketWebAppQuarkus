/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pojo.cricketMatch;


import com.example.enumvalues.MatchBowlAction;

/**
 *
 * @author prabin
 */
public class MatchSummaryDetailRequestPojo {
    private Long id;
    
     private Integer run;

    private Double over;

    private MatchBowlAction matchBowlAction;

 
    private Long batsMenId;

  
    private Long bowlerId;
    
  
    private Long matchId;

    public Integer getRun() {
        return run;
    }

    public void setRun(Integer run) {
        this.run = run;
    }

    public Double getOver() {
        return over;
    }

    public void setOver(Double over) {
        this.over = over;
    }

    public MatchBowlAction getMatchBowlAction() {
        return matchBowlAction;
    }

    public void setMatchBowlAction(MatchBowlAction matchBowlAction) {
        this.matchBowlAction = matchBowlAction;
    }

    public Long getBatsMenId() {
        return batsMenId;
    }

    public void setBatsMenId(Long batsMenId) {
        this.batsMenId = batsMenId;
    }

    public Long getBowlerId() {
        return bowlerId;
    }

    public void setBowlerId(Long bowlerId) {
        this.bowlerId = bowlerId;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
