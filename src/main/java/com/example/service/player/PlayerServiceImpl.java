/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.player;

import com.example.model.Player;
import com.example.repository.PlayerRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import org.hibernate.service.spi.InjectService;

/**
 *
 * @author prabin
 */
@RequestScoped
public class PlayerServiceImpl implements PlayerService {

    @Inject
    private PlayerRepository playerRepository;

    @Override
    public Player upadtePlayer(Long id, Player updatePlayer) {
        Player player = playerRepository.findById(id);
        if (player == null) {
            throw new RuntimeException("Player doesnot exist by given id.");
        }
        player.setAddress(updatePlayer.getAddress() != null ? updatePlayer.getAddress() : player.getAddress());
        player.setName(updatePlayer.getName() != null ? updatePlayer.getName() : player.getName());
        player.setPlayerRole(updatePlayer.getPlayerRole() != null ? updatePlayer.getPlayerRole() : player.getPlayerRole());
        playerRepository.persist(player);
        return player;
    }

    @Override
    public Boolean deletePlayer(Long id) {
        Player player = playerRepository.findById(id);
        if (player == null) {
            throw new RuntimeException("Player doesnot exist by given id.");
        }
        
        playerRepository.deleteById(id);
        return true;
    }

}
