package com.trainer.msclient.client.controller;

import com.trainer.msclient.client.model.ClientModel;
import com.trainer.msclient.client.service.ClientService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/v1")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public ResponseEntity<List<ClientModel>> findAll() {
        List<ClientModel> clientModelList = clientService.findAll();
        return ResponseEntity.ok(clientModelList);
    }

    @RequestMapping(value = "/client/{id}", method = RequestMethod.GET)
    public ResponseEntity<ClientModel> findById(@PathVariable UUID id) {
        Optional<ClientModel> optionalClientModel = clientService.findById(id);
        return ResponseEntity.ok(optionalClientModel.orElse(null));
    }


    @RequestMapping(value = "/client", method = RequestMethod.POST)
    public ResponseEntity<ClientModel> create(@RequestBody ClientModel clientModel) {
        ClientModel clientModelResponse = clientService.update(clientModel);
        return ResponseEntity.ok(clientModelResponse);
    }

    @RequestMapping(value = "/client", method = RequestMethod.PUT)
    public ResponseEntity<ClientModel> update(@RequestBody ClientModel clientModel) {
        ClientModel clientModelResponse = clientService.update(clientModel);
        return ResponseEntity.ok(clientModelResponse);
    }

    @RequestMapping(value = "/client/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        ClientModel clientModel = new ClientModel();
        clientModel.setId(UUID.fromString(id));
        clientService.delete(clientModel);
    }
}
