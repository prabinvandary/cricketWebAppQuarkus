package com.example.model;


import com.example.model.generic.GenericAbstractClass;
import com.example.model.generic.GenericInterface;
import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "cricket_match")
public class CricketMatch extends GenericAbstractClass implements GenericInterface {

    @Column(name = "match_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date matchDate;

    @Column(length = 50, nullable = false)
    private String venue;

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn(name = "tournament_id", referencedColumnName = "id", nullable = false)
    private Tournament tournament;
    
    public CricketMatch() {
    }

    public CricketMatch(Long id, Date matchDate, String venue) {
        this.setId(id);
        this.matchDate = matchDate;
        this.venue = venue;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public String getVenue() {
        return venue;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }
    


}
