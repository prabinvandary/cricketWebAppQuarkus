/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.player;

import com.example.exception.AppException;
import com.example.model.Player;
import com.example.repository.PlayerRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author prabin
 */
@RequestScoped
public class PlayerServiceImpl implements PlayerService, Serializable {

    @Inject
    PlayerRepository playerRepository;

    @Override
    public Player upadtePlayer(Long id, Player updatePlayer) {
        Player player = playerRepository.findById(id);
        if (player == null) {
            throw new AppException("Player does not exist by given id.");
        }
        setPlayer(updatePlayer, player);
        playerRepository.persist(player);
        return player;
    }

    @Override
    @Transactional
    public Boolean deletePlayer(Long id) {
        Player player = playerRepository.findByIdOptional(id).orElseThrow(()->new AppException("Player does not exist by given Id"));
        playerRepository.deleteById(player.getId());
        return true;
    }

    @Override
    public List<Player> getAllPlayer() {
        return playerRepository.listAll();
    }

    @Override
    @Transactional
    public Player savePlayer(Player playerToSave) {
        Player player = new Player();
        if (playerToSave.getId() != null)
            player = playerRepository.findByIdOptional(playerToSave.getId()).orElse(player);
        setPlayer(playerToSave, player);
        playerRepository.persistAndFlush(player);
        return player;
    }

    private void setPlayer(Player playerToSave, Player player) {
        player.setAddress(playerToSave.getAddress() != null ? playerToSave.getAddress() : player.getAddress());
        player.setName(playerToSave.getName() != null ? playerToSave.getName() : player.getName());
        player.setPlayerRole(playerToSave.getPlayerRole() != null ? playerToSave.getPlayerRole() : player.getPlayerRole());
    }

    @Override
    public Player  getPlayerById(Long id) {
        return playerRepository.findByIdOptional(id).orElseThrow(() -> new AppException("Player does not exist by given id " + id));
    }

}
