package ru.ranepa.bikerental.application;

import ru.ranepa.bikerental.application.port.BikeRepository;
import ru.ranepa.bikerental.domain.Bike;

import java.util.List;

public class BikeService {
    private final BikeRepository bikeRepository;

    public BikeService(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    public boolean addBike(String name, double pricePerHour) {
        // TODO
        return false;
    }

    public List<Bike> getAllBikes() {
        // TODO
        return null;
    }

    public Bike findBikeByName(String name) {
        // TODO
        return null;
    }

    public boolean rentBike(String bikeName, String clientName) {
        // TODO
        return false;
    }

    public int countBikes() {
        // TODO
        return 0;
    }

    public int countRentedBikes() {
        // TODO
        return 0;
    }
}
