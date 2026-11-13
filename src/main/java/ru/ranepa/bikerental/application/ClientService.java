package ru.ranepa.bikerental.application;

import ru.ranepa.bikerental.application.port.ClientRepository;
import ru.ranepa.bikerental.domain.Client;

import java.util.List;

public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public boolean addClient(String name, String phone) {
        // TODO
        return false;
    }

    public List<Client> getAllClients() {
        // TODO
        return null;
    }

    public Client findClientByName(String name) {
        // TODO
        return null;
    }

    public int countClients() {
        // TODO
        return 0;
    }
}
