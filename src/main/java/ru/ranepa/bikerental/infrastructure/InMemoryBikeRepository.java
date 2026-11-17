package ru.ranepa.bikerental.infrastructure;

import ru.ranepa.bikerental.application.port.BikeRepository;
import ru.ranepa.bikerental.domain.Bike;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBikeRepository implements BikeRepository {
    private final List<Bike> bikes = new ArrayList<>();

    @Override
    public void add(Bike bike) {
        // TODO добавить bike в список bikes
    }

    @Override
    public List<Bike> findAll() {
        // TODO вернуть список bikes
        return null;
    }

    @Override
    public Bike findByName(String name) {
        // TODO пройти по списку и вернуть велосипед с таким названием, иначе null
        return null;
    }
}
