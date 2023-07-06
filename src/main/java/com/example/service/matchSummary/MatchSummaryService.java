/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.matchSummary;


import com.example.model.MatchSummary;
import com.example.pojo.cricketMatch.MatchSummaryDetailRequestPojo;

/**
 *
 * @author prabin
 */
public interface MatchSummaryService {
    MatchSummary saveMatchSummaryService(MatchSummaryDetailRequestPojo requestPojo);
}
