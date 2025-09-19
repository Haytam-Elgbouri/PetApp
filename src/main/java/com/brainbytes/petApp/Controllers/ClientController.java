package com.brainbytes.petApp.Controllers;

import com.brainbytes.petApp.Entities.Client;
import com.brainbytes.petApp.Services.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/clients")
    public List<Client> GetAllCLients(){
        return clientService.GetAllClients();
    };

    @GetMapping("/client/{id}")
    public Client GetClientById(@PathVariable Long id){
        return clientService.GetClientById(id);
    };

    @PostMapping("/client")
    public Client AddClient(@RequestBody Client client){
        return clientService.AddClient(client);
    };

    @PutMapping("/client/{id}")
    public Client UpdateClientById(@PathVariable Long id, @RequestBody Client client){
        return clientService.UpdateClientById(id, client);
    };

    @DeleteMapping("/client/{id}")
    public void DeleteClientById(@PathVariable Long id){
        clientService.DeleteClientById(id);
    }

}

