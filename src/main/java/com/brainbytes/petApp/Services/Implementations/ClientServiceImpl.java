package com.brainbytes.petApp.Services.Implementations;

import com.brainbytes.petApp.Entities.Client;
import com.brainbytes.petApp.Repositories.ClientRepository;
import com.brainbytes.petApp.Services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public List<Client> GetAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client GetClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client AddClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client UpdateClientById(Long id, Client clientDetails) {
        return clientRepository.findById(id).map(client -> {
            client.setFullName(clientDetails.getFullName());
            client.setMail(clientDetails.getMail());
            client.setPhone(clientDetails.getPhone());
//          client.setPassword(clientDetails.getPassword());
            return clientRepository.save(client);
        }).orElse(null);
    }

    @Override
    public void DeleteClientById(Long id) {
        clientRepository.deleteById(id);
    }
}
