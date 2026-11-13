package ru.ranepa.bikerental.infrastructure;

import ru.ranepa.bikerental.application.BikeService;
import ru.ranepa.bikerental.application.ClientService;

import java.util.Scanner;

public class ConsoleMenu {
    private final Scanner scanner;
    private final BikeService bikeService;
    private final ClientService clientService;

    public ConsoleMenu(Scanner scanner, BikeService bikeService, ClientService clientService) {
        this.scanner = scanner;
        this.bikeService = bikeService;
        this.clientService = clientService;
    }

    public void run() {
        boolean running = true;
        while (running) {
            printMenu();
            String command = scanner.nextLine().trim();
            switch (command) {
                case "1":
                    System.out.print("Название велосипеда: ");
                    String bikeName = scanner.nextLine();
                    System.out.print("Цена за час: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    bikeService.addBike(bikeName, price);
                    break;
                case "2":
                    System.out.print("Имя клиента: ");
                    String clientName = scanner.nextLine();
                    System.out.print("Телефон: ");
                    String phone = scanner.nextLine();
                    clientService.addClient(clientName, phone);
                    break;
                case "3":
                    bikeService.getAllBikes();
                    clientService.getAllClients();
                    break;
                case "4":
                    System.out.print("Название велосипеда: ");
                    bikeService.findBikeByName(scanner.nextLine());
                    break;
                case "5":
                    System.out.print("Название велосипеда: ");
                    String bike = scanner.nextLine();
                    System.out.print("Имя клиента: ");
                    String client = scanner.nextLine();
                    bikeService.rentBike(bike, client);
                    break;
                case "6":
                    bikeService.countBikes();
                    bikeService.countRentedBikes();
                    clientService.countClients();
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("Неизвестная команда");
            }
        }
    }

    private void printMenu() {
        System.out.println();
        System.out.println("1 - Добавить велосипед");
        System.out.println("2 - Добавить клиента");
        System.out.println("3 - Показать всех");
        System.out.println("4 - Найти велосипед по названию");
        System.out.println("5 - Выдать велосипед в прокат");
        System.out.println("6 - Статистика");
        System.out.println("0 - Выход");
        System.out.print("Команда: ");
    }
}
