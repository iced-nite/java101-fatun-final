package ru.ranepa.bikerental.application.port;

import ru.ranepa.bikerental.domain.Bike;

import java.util.List;

public interface BikeRepository {
    void add(Bike bike);
    List<Bike> findAll();
    Bike findByName(String name);
}
