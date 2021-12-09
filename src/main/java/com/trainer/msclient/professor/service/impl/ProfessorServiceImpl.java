package com.trainer.msclient.professor.service.impl;

import com.trainer.msclient.professor.model.ProfessorModel;
import com.trainer.msclient.professor.repository.ProfessorRepository;
import com.trainer.msclient.professor.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public List<ProfessorModel> findAll() {
        return professorRepository.findAll();
    }

    @Override
    public Optional<ProfessorModel> findById(UUID id) {
        return professorRepository.findById(id);
    }

    @Override
    public ProfessorModel update(ProfessorModel professorModel) {
        return professorRepository.save(professorModel);
    }

    @Override
    public void delete(ProfessorModel professorModel) {
        professorRepository.delete(professorModel);
    }
}
