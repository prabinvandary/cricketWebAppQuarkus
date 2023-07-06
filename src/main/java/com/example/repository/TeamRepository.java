package com.example.repository;

import com.example.model.Team;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface TeamRepository extends PanacheRepository<Team> {
}
