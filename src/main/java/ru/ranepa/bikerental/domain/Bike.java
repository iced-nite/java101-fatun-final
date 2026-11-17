package ru.ranepa.bikerental.domain;

/** Велосипед (главная сущность). */
public class Bike {
    private String name;
    private double pricePerHour;
    private boolean rented;

    public Bike(String name, double pricePerHour) {
        this.name = name;
        this.pricePerHour = pricePerHour;
        this.rented = false;
    }

    public String getName() { return name; }
    public double getPricePerHour() { return pricePerHour; }
    public boolean isRented() { return rented; }
}
