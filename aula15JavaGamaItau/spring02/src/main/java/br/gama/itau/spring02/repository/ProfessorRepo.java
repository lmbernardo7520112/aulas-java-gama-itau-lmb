package br.gama.itau.spring02.repository;

import org.springframework.data.repository.CrudRepository;
import br.gama.itau.spring02.model.Professor;
public interface ProfessorRepo extends CrudRepository<Professor, Long> {
    
}
