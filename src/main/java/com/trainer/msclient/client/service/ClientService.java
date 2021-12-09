package com.trainer.msclient.client.service;

import com.trainer.msclient.client.model.ClientModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface ClientService {

    List<ClientModel> findAll();
    Optional<ClientModel> findById(UUID id);
    ClientModel update(ClientModel clientModel);
    void delete(ClientModel clientModel);

}
