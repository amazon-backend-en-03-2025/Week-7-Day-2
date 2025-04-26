package com.ironhack.hellojpaadvanced.demo;

import com.ironhack.hellojpaadvanced.model.Hotel;
import com.ironhack.hellojpaadvanced.model.Location;
import com.ironhack.hellojpaadvanced.model.enums.HotelType;
import com.ironhack.hellojpaadvanced.repository.HotelRepository;
import com.ironhack.hellojpaadvanced.repository.LocationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DataLoader implements CommandLineRunner {

    private final LocationRepository locationRepository;
    private final HotelRepository hotelRepository;


    public DataLoader(LocationRepository locationRepository,
                      HotelRepository hotelRepository) {
        this.locationRepository = locationRepository;
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading data...");

        var location1 = new Location("Sicily", "A beautiful island especially for a wedding", "Italy");
        var location2 = new Location("Madrid", "A great city with a buzzing nightlife", "Spain");
        var location3 = new Location("Barcelona", "Nice city with a good city beach", "Spain");

        locationRepository.save(location1);
        locationRepository.save(location2);
        locationRepository.save(location3);


        var hotel1 = new Hotel("White Lotus - Taormina", 1L, HotelType.LUXURY);
        var hotel2 = new Hotel("Hilton - Madrid", 2L, HotelType.BUSINESS);

        hotelRepository.save(hotel1);
        hotelRepository.save(hotel2);

        System.out.println("Loading data complete.");
    }
}
