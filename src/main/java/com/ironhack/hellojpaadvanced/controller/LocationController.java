package com.ironhack.hellojpaadvanced.controller;

import com.ironhack.hellojpaadvanced.model.Location;
import com.ironhack.hellojpaadvanced.service.LocationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public List<Location> findAll() {
        return locationService.findAll();
    }

    @GetMapping("/{id}")
    public Location findById(@PathVariable Long id){
        return locationService.findById(id);
    }

    @GetMapping("/description/{word}")
    public List<Location> findByDescriptionContains(@PathVariable String word){
        return locationService.findByDescriptionContains(word);
    }

    @GetMapping("/id-between")
    public List<Location> findByIdBetween(@RequestParam(defaultValue = "0", required = false) Long starting,
                                          @RequestParam Long ending){
        return locationService.findByIdBetween(starting, ending);
    }

    @GetMapping("/{id}/country/{country}")
    public Location findByIdAndCountry(@PathVariable Long id, @PathVariable String country){
        return locationService.findByIdAndCountry(id, country);
    }

    @PostMapping
    public Location save(@RequestBody Location location){
        return locationService.save(location);
    }
}
