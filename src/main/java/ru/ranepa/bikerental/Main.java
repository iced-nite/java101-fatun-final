package ru.ranepa.bikerental;

import ru.ranepa.bikerental.application.BikeService;
import ru.ranepa.bikerental.application.ClientService;
import ru.ranepa.bikerental.application.port.BikeRepository;
import ru.ranepa.bikerental.application.port.ClientRepository;
import ru.ranepa.bikerental.infrastructure.ConsoleMenu;
import ru.ranepa.bikerental.infrastructure.InMemoryBikeRepository;
import ru.ranepa.bikerental.infrastructure.InMemoryClientRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BikeRepository bikeRepository = new InMemoryBikeRepository();
        ClientRepository clientRepository = new InMemoryClientRepository();

        BikeService bikeService = new BikeService(bikeRepository);
        ClientService clientService = new ClientService(clientRepository);

        Scanner scanner = new Scanner(System.in);
        ConsoleMenu menu = new ConsoleMenu(scanner, bikeService, clientService);
        menu.run();
    }
}
