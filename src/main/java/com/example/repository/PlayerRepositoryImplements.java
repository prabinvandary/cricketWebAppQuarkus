package com.example.repository;

import jakarta.enterprise.context.RequestScoped;

import java.io.Serializable;

@RequestScoped
public class PlayerRepositoryImplements implements PlayerRepository, Serializable {
}
