package com.trainer.msclient.professor.service;

import com.trainer.msclient.professor.model.ProfessorModel;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface ProfessorService {

    List<ProfessorModel> findAll();
    Optional<ProfessorModel> findById(UUID id);
    ProfessorModel update(ProfessorModel professorModel);
    void delete(ProfessorModel professorModel);

}
