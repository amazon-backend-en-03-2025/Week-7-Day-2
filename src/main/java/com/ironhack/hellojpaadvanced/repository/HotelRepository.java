package com.ironhack.hellojpaadvanced.repository;

import com.ironhack.hellojpaadvanced.model.Hotel;
import com.ironhack.hellojpaadvanced.model.enums.HotelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    @Query("SELECT h FROM Hotel h WHERE h.hotelType = ?1 and h.locationId = ?2")
    List<Hotel> findByUsingJPQLQueryWithMultipleParameters(HotelType hotelType, Long locationId);
}
