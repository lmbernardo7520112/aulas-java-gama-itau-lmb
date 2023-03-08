package br.gama.itau.aula16.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gama.itau.aula16.dto.VeiculoDTO;
import br.gama.itau.aula16.model.Veiculo;
import br.gama.itau.aula16.repository.VeiculoRepo;
import br.gama.itau.aula16.service.VeiculoService;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
    
    @Autowired
    private VeiculoRepo repo;

    @Autowired
    private VeiculoService service;

    @GetMapping
    public ResponseEntity<List<VeiculoDTO>> getAll() {
        List<VeiculoDTO> lista = service.getAll();

        if(lista == null || lista.size() == 0) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VeiculoDTO> getById(@PathVariable Long id) {
        Veiculo veiculo = service.getById(id);

        if(veiculo == null) {
            return ResponseEntity.notFound().build();
        }
        VeiculoDTO veiculoDTO = new VeiculoDTO(veiculo);
        return ResponseEntity.ok(veiculoDTO);
    }

    @PostMapping
    public ResponseEntity<Veiculo> newVeiculo(@RequestBody Veiculo novoVeiculo) {
        Veiculo veiculoInserido = service.newVeiculo(novoVeiculo);
        
        if(veiculoInserido == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(veiculoInserido); // cód http 201 = inserido com sucesso
    }

    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> updateVeiculo(@PathVariable long id, @RequestBody Veiculo veiculo) {
        Optional<Veiculo> veiculoOptional = repo.findById(id);

        if(veiculoOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        veiculo.setId(id);
        Veiculo veiculoAtualizado = repo.save(veiculo);
        return ResponseEntity.ok(veiculoAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Veiculo> deleteById(@PathVariable Long id) {
        Optional<Veiculo> veiculoOptional = repo.findById(id);

        if(veiculoOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        
        repo.deleteById(id);
        return ResponseEntity.noContent().build(); // cód http 204 = retorno com sucesso sem contúdo no body(corpo)
    }

    @GetMapping("/ano/{anoFabricacao}")
    public ResponseEntity<List<VeiculoDTO>> getByAno(@PathVariable int anoFabricacao) {
        List<VeiculoDTO> lista = service.getByAno(anoFabricacao);

        if(lista == null || lista.size() == 0) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(lista);
    }
}