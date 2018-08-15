package com.usc.VotingSystem.repositories;

import com.usc.VotingSystem.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepo extends JpaRepository<Citizen,Integer> {

    public Citizen findByName(String name);
}
