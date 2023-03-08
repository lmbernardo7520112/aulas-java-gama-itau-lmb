package br.gama.itau.aula16.repository;

import org.springframework.data.repository.CrudRepository;

import br.gama.itau.aula16.model.Proprietario;

public interface ProprietarioRepo extends CrudRepository<Proprietario, Long> {
    
}
