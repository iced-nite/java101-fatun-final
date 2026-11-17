package ru.ranepa.bikerental.application.port;

import ru.ranepa.bikerental.domain.Client;
import java.util.List;

public interface ClientRepository {
    void add(Client client);
    List<Client> findAll();
    Client findByName(String name);
}
