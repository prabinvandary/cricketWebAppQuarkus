/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.player;


import com.example.model.Player;

/**
 *
 * @author prabin
 */
public interface PlayerService {
    Player upadtePlayer(Long id, Player player);
    
    Boolean deletePlayer(Long id);
    
}
