/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;


import com.example.enumvalues.PlayerRole;
import com.example.model.generic.GenericAbstractClass;
import jakarta.persistence.*;

import java.util.Objects;

/**
 *
 * @author prabin
 */
@Entity
@Table(name = "player")
public class Player extends GenericAbstractClass{

    @Column(length = 50, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "player_role", length = 30, nullable = false)
    private PlayerRole playerRole;

    @Column(length = 100, nullable = false)
    private String address;

    public Player() {
    }

    public Player(Long id, String name, PlayerRole role, String address) {
        this.setId(id);
        this.name = name;
        this.playerRole = role;
        this.address = address;
    }

    public PlayerRole getPlayerRole() {
        return playerRole;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayerRole(PlayerRole playerRole) {
        this.playerRole = playerRole;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.getId());
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.playerRole);
        hash = 83 * hash + Objects.hashCode(this.address);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.getId(), other.getId())) {
            return false;
        }
        return this.playerRole == other.playerRole;
    }
}
