/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

import com.example.enumvalues.TournamentType;
import com.example.model.generic.GenericAbstractClass;
import com.example.model.generic.GenericInterface;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author prabin
 */
@Entity
@Table(name = "tournament")
public class Tournament extends GenericAbstractClass implements GenericInterface {

    @Enumerated(EnumType.STRING)
    @Column(name = "tournament_type", length = 30, nullable = false)
    private TournamentType tournamentType;

    @Temporal(TemporalType.DATE)
    @Column(name = "from_date", nullable = false)
    private Date fromDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "to_date", nullable = false)
    private Date toDate;

    @Column(name = "tournament_name", length = 50, nullable = false)
    private String tournamentName;

    public Tournament() {
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public Tournament(Long id, TournamentType tournamentType, Date fromDate, Date toDate, String tournamentName) {
        this.setId(id);
        this.tournamentType = tournamentType;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.tournamentName = tournamentName;
    }

    public TournamentType getTournamentType() {
        return tournamentType;
    }

    public void setTournamentType(TournamentType tournamentType) {
        this.tournamentType = tournamentType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tournament otherTournament = (Tournament) obj;
        return Objects.equals(this.getId(), otherTournament.getId());
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
