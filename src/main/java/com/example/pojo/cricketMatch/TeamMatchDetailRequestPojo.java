/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pojo.cricketMatch;


import com.example.enumvalues.TossAction;

/**
 *
 * @author prabin
 */
public class TeamMatchDetailRequestPojo {

    private Long id;
    private Long firstTeamId;
    private Long secondTeamId;
    private Long tossWinTeamId;
    private TossAction tossWinTeamAction;
    private TossAction tossLooseTeamAction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getTossWinTeamId() {
        return tossWinTeamId;
    }

    public void setTossWinTeamId(Long tossWinTeamId) {
        this.tossWinTeamId = tossWinTeamId;
    }

    public TossAction getTossWinTeamAction() {
        return tossWinTeamAction;
    }

    public void setTossWinTeamAction(TossAction tossWinTeamAction) {
        this.tossWinTeamAction = tossWinTeamAction;
    }

    public TossAction getTossLooseTeamAction() {
        return tossLooseTeamAction;
    }

    public void setTossLooseTeamAction(TossAction tossLooseTeamAction) {
        this.tossLooseTeamAction = tossLooseTeamAction;
    }
    
}
