/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.matchSummary;


import com.example.exception.AppException;
import com.example.model.CricketMatch;
import com.example.model.MatchSummary;
import com.example.model.Player;
import com.example.pojo.cricketMatch.MatchSummaryDetailRequestPojo;
import com.example.repository.CricketMatchRepository;
import com.example.repository.MatchSummaryRepository;
import com.example.repository.PlayerRepository;
import jakarta.inject.Inject;

/**
 *
 * @author prabin
 */
public class MatchSummaryServiceImpl implements MatchSummaryService {

    @Inject
    private MatchSummaryRepository matchSummaryRepository;

    @Inject
    private CricketMatchRepository cricketMatchRepository;

    @Inject
    private PlayerRepository playerRepository;

    @Override
    public MatchSummary saveMatchSummaryService(MatchSummaryDetailRequestPojo requestPojo) {
        MatchSummary matchSummary = new MatchSummary();
        Player bowler = playerRepository.findById(requestPojo.getBowlerId());
        if (bowler == null) {
            throw new AppException("Bowler not found by given id.");
        }

        Player batsmen = playerRepository.findById(requestPojo.getBatsMenId());
        if (batsmen == null) {
            throw new AppException("Batsmen not found by given id.");
        }
        
        CricketMatch cricketMatch= cricketMatchRepository.findById(requestPojo.getMatchId());
        if (cricketMatch==null) {
            throw new AppException("Cricket match doesnot exist by given id.");
        }
        if (requestPojo.getId() != null) {
            matchSummary = matchSummaryRepository.findById(requestPojo.getId());
            if (matchSummary == null) {
                matchSummary = new MatchSummary();
            }
        }
        matchSummary.setBatsMenId(batsmen);
        matchSummary.setBowlerId(bowler);
        matchSummary.setMatchBowlAction(requestPojo.getMatchBowlAction());
        matchSummary.setMatchId(cricketMatch);
        matchSummary.setRun(requestPojo.getRun());
        matchSummary.setOver(requestPojo.getOver());
        matchSummaryRepository.persist(matchSummary);
        return matchSummary;
    }

}
