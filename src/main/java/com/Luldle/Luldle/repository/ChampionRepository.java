package com.Luldle.Luldle.repository;

import com.Luldle.Luldle.model.Champion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChampionRepository extends JpaRepository<Champion, Long> {
    Champion findByName (String name);
    List<Champion> findByNameStartingWithIgnoreCase(String name);
}
