package com.ironhack.hellojpaadvanced.controller;

import com.ironhack.hellojpaadvanced.model.Hotel;
import com.ironhack.hellojpaadvanced.model.enums.HotelType;
import com.ironhack.hellojpaadvanced.service.HotelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/hotels")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("hotel-type/{hotelType}/location-id/{locationId}")
    public List<Hotel> findAllByHotelTypeAndLocationId(
            @PathVariable HotelType hotelType,
            @PathVariable Long locationId) {
        return hotelService.findAllByHotelTypeAndLocationId(hotelType, locationId);
    }
}
