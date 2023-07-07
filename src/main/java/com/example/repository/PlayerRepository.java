package com.example.repository;

import com.example.model.Player;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.beans.JavaBean;

public interface PlayerRepository extends PanacheRepository<Player> {
}
