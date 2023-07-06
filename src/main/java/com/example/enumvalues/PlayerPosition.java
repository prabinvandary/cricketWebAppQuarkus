/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.example.enumvalues;

public enum PlayerPosition {
    CAPTAIN("Captain"), VICE_CAPTAIN("Vice Captaion"), ONLY_PLAYER("Player");
    
    private String label;

    private PlayerPosition(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
