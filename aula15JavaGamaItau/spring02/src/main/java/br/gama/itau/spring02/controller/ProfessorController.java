package br.gama.itau.spring02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gama.itau.spring02.model.Professor;
import br.gama.itau.spring02.repository.ProfessorRepo;

@RestController //indica que a classe é um controle do tipo REST capaz de receber e enviar requisições 
@RequestMapping("/professor")// mapeamento desta classe
public class ProfessorController {

    @Autowired
    private ProfessorRepo repo;

    @GetMapping("/{codigo}")
    public Professor getProfessor(@PathVariable long codigo) {
        return repo.findById(codigo).get();
    }
}
