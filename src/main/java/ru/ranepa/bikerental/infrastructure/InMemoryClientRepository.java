package ru.ranepa.bikerental.infrastructure;

import ru.ranepa.bikerental.application.port.ClientRepository;
import ru.ranepa.bikerental.domain.Client;

import java.util.ArrayList;
import java.util.List;

public class InMemoryClientRepository implements ClientRepository {
    private final List<Client> clients = new ArrayList<>();

    @Override
    public void add(Client client) {
        // TODO добавить client в список clients
    }

    @Override
    public List<Client> findAll() {
        // TODO вернуть список clients
        return null;
    }

    @Override
    public Client findByName(String name) {
        // TODO пройти по списку и вернуть клиента с таким именем, иначе null
        return null;
    }
}

