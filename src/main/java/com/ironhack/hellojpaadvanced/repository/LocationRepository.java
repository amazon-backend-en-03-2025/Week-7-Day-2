package com.ironhack.hellojpaadvanced.repository;

import com.ironhack.hellojpaadvanced.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

    List<Location> findByDescriptionContainsIgnoreCase(String word);

    List<Location> findByIdBetween(Long start, Long end);

    Optional<Location> findByIdAndCountry(Long id, String country);
}
