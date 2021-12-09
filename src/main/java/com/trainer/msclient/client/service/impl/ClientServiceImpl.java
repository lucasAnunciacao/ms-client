package com.trainer.msclient.client.service.impl;

import com.trainer.msclient.client.model.ClientModel;
import com.trainer.msclient.client.repository.ClientRepository;
import com.trainer.msclient.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<ClientModel> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<ClientModel> findById(UUID id) {
        return clientRepository.findById(id);
    }

    @Override
    public ClientModel update(ClientModel clientModel) {
        return clientRepository.save(clientModel);
    }

    @Override
    public void delete(ClientModel clientModel) {
        clientRepository.delete(clientModel);
    }
}
