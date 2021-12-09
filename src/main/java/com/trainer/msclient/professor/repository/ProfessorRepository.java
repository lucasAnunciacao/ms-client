package com.trainer.msclient.professor.repository;

import com.trainer.msclient.professor.model.ProfessorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorModel, UUID> {
}
