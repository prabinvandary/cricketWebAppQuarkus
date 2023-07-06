/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.service.cricketMatch;


import com.example.model.CricketMatch;
import com.example.pojo.cricketMatch.CricketMatchDetailRequestPojo;

/**
 *
 * @author prabin
 */
public interface CricketMatchService {
    CricketMatch saveCricketMatch(CricketMatchDetailRequestPojo requestPojo);
}
