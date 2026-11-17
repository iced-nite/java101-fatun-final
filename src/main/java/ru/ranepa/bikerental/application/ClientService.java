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
        // TODO проверить, что имя и телефон не пустые;
        // TODO проверить, что клиента с таким именем ещё нет;
        // TODO создать Client и добавить через clientRepository.add(...)
        return false;
    }

    public List<Client> getAllClients() {
        // TODO вернуть список всех клиентов из clientRepository
        return null;
    }

    public Client findClientByName(String name) {
        // TODO найти клиента через clientRepository.findByName(...)
        return null;
    }

    public int countClients() {
        // TODO вернуть количество клиентов
        return 0;
    }
}
