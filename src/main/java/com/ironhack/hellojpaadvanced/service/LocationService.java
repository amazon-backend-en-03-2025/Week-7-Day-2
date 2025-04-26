package com.ironhack.hellojpaadvanced.service;

import com.ironhack.hellojpaadvanced.model.Location;
import com.ironhack.hellojpaadvanced.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    public Location findById(Long id) {
        return locationRepository.findById(id).orElseThrow();
    }

    public List<Location> findByDescriptionContains(String word) {
        return locationRepository.findByDescriptionContainsIgnoreCase(word);
    }

    public List<Location> findByIdBetween(Long start, Long end) {
        return locationRepository.findByIdBetween(start, end);
    }

    public Location findByIdAndCountry(Long id, String country) {
        return locationRepository.findByIdAndCountry(id, country).orElse(null);
    }

    public Location save(Location location) {
        return locationRepository.save(location);
    }

    public List<Location> findByName(String name) {
//        return locationRepository.thisMethodWillReturnAllLocationsByNameWithJPQL(name);
        return locationRepository.thisMethodWillReturnAllLocationsByNameWithNativeQuery(name);
    }

}
