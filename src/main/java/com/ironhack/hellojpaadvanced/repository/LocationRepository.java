package com.ironhack.hellojpaadvanced.repository;

import com.ironhack.hellojpaadvanced.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

    List<Location> findByDescriptionContainsIgnoreCase(String word);

    List<Location> findByIdBetween(Long start, Long end);

    Optional<Location> findByIdAndCountry(Long id, String country);


    @Query("SELECT l FROM Location l WHERE l.name = ?1")
    List<Location> thisMethodWillReturnAllLocationsByNameWithJPQL(String name);

//    @Query(value = "SELECT * FROM location WHERE name = ?1", nativeQuery = true)
    @Query(value = "SELECT * FROM location WHERE name = :name", nativeQuery = true)
    List<Location> thisMethodWillReturnAllLocationsByNameWithNativeQuery(@Param("name") String name);


}
