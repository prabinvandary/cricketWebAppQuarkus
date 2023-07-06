package com.example.enumvalues;

public enum TournamentType {
    T_TWNETY("Twenty - Twenty (T-20)"), ODI("One Day Inning(ODI)"), TEST("Test");

    private String label;

    private TournamentType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
