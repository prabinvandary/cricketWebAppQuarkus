package com.example.repository;

import com.example.model.Tournament;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface TournamentRepository extends PanacheRepository<Tournament> {
}
