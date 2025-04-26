package com.ironhack.hellojpaadvanced.service;

import com.ironhack.hellojpaadvanced.model.Hotel;
import com.ironhack.hellojpaadvanced.model.enums.HotelType;
import com.ironhack.hellojpaadvanced.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public List<Hotel> findAllByHotelTypeAndLocationId(HotelType hotelType, Long locationId) {
        return hotelRepository
                .findByUsingJPQLQueryWithMultipleParameters(hotelType, locationId);
    }
}
