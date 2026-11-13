package ru.ranepa.bikerental.infrastructure;

import ru.ranepa.bikerental.application.port.ClientRepository;
import ru.ranepa.bikerental.domain.Client;

import java.util.ArrayList;
import java.util.List;

public class InMemoryClientRepository implements ClientRepository {
    private final List<Client> clients = new ArrayList<>();

    @Override
    public void add(Client client) {
        // TODO
    }

    @Override
    public List<Client> findAll() {
        // TODO
        return null;
    }

    @Override
    public Client findByName(String name) {
        // TODO
        return null;
    }
}

