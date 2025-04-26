package com.ironhack.hellojpaadvanced.model;

import com.ironhack.hellojpaadvanced.model.enums.HotelType;
import jakarta.persistence.*;

@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long locationId;

    @Enumerated(EnumType.STRING)
    private HotelType hotelType;

    public Hotel() {
    }

    public Hotel(String name, Long locationId, HotelType hotelType) {
        this.name = name;
        this.locationId = locationId;
        this.hotelType = hotelType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public HotelType getHotelType() {
        return hotelType;
    }

    public void setHotelType(HotelType hotelType) {
        this.hotelType = hotelType;
    }
}
