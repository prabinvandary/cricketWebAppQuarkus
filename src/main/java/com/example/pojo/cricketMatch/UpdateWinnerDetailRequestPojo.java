/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.pojo.cricketMatch;

/**
 *
 * @author prabin
 */
public class UpdateWinnerDetailRequestPojo {
    private Long teamMatchScoreId;
    
    private Boolean isWinner;

    public Long getTeamMatchScoreId() {
        return teamMatchScoreId;
    }

    public void setTeamMatchScoreId(Long teamMatchScoreId) {
        this.teamMatchScoreId = teamMatchScoreId;
    }

    public Boolean getIsWinner() {
        return isWinner;
    }

    public void setIsWinner(Boolean isWinner) {
        this.isWinner = isWinner;
    }    
}
