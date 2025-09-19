package com.brainbytes.petApp.Services;

import com.brainbytes.petApp.Entities.Client;

import java.util.List;

public interface ClientService {

    List<Client> GetAllClients();
    Client GetClientById(Long id);
    Client AddClient(Client client);
    Client UpdateClientById(Long id, Client client);
    void DeleteClientById(Long id);

}
