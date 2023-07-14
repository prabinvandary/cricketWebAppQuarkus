package com.example.repository;

import com.example.model.Player;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface PlayerRepository extends PanacheRepository<Player> {
}
