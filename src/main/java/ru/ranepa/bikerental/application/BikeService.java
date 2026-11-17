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
        // TODO проверить, что название не пустое и цена больше 0;
        // TODO проверить, что велосипеда с таким названием ещё нет;
        // TODO создать Bike и добавить через bikeRepository.add(...)
        return false;
    }

    public List<Bike> getAllBikes() {
        // TODO вернуть список всех велосипедов из bikeRepository
        return null;
    }

    public Bike findBikeByName(String name) {
        // TODO найти велосипед через bikeRepository.findByName(...)
        return null;
    }

    public boolean rentBike(String bikeName, String clientName) {
        // TODO проверить, что велосипед существует и не выдан;
        // TODO проверить, что клиент существует;
        // TODO пометить велосипед как выданный
        return false;
    }

    public int countBikes() {
        // TODO вернуть количество всех велосипедов
        return 0;
    }

    public int countRentedBikes() {
        // TODO вернуть количество выданных велосипедов
        return 0;
    }
}
