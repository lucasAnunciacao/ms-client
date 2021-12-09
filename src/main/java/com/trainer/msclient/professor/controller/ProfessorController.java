package com.trainer.msclient.professor.controller;

import com.trainer.msclient.professor.model.ProfessorModel;
import com.trainer.msclient.professor.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/v1")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @RequestMapping(value = "/professor", method = RequestMethod.GET)
    public ResponseEntity<List<ProfessorModel>> findAll() {
        List<ProfessorModel> professorModelList = professorService.findAll();
        return ResponseEntity.ok(professorModelList);
    }

    @RequestMapping(value = "/professor/{id}", method = RequestMethod.GET)
    public ResponseEntity<ProfessorModel> findById(@PathVariable UUID id) {
        Optional<ProfessorModel> optionalProfessorModel = professorService.findById(id);
        return ResponseEntity.ok(optionalProfessorModel.orElse(null));
    }


    @RequestMapping(value = "/professor", method = RequestMethod.POST)
    public ResponseEntity<ProfessorModel> create(@RequestBody ProfessorModel professorModel) {
        ProfessorModel professorModelResponse = professorService.update(professorModel);
        return ResponseEntity.ok(professorModelResponse);
    }

    @RequestMapping(value = "/professor", method = RequestMethod.PUT)
    public ResponseEntity<ProfessorModel> update(@RequestBody ProfessorModel professorModel) {
        ProfessorModel professorModelResponse = professorService.update(professorModel);
        return ResponseEntity.ok(professorModelResponse);
    }

    @RequestMapping(value = "/professor/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        ProfessorModel professorModel = new ProfessorModel();
        professorModel.setId(UUID.fromString(id));
        professorService.delete(professorModel);
    }
}
