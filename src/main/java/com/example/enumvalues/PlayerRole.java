/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.example.enumvalues;

public enum PlayerRole {
    BATSMEN("Batsmen"), BOWLER("Bowler"), ALL_ROUNDER("All Rounder");

    private String label;

    private PlayerRole(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
