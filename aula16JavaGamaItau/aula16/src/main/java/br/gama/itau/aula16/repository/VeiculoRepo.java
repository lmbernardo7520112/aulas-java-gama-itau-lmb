package br.gama.itau.aula16.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import br.gama.itau.aula16.model.Veiculo;

public interface VeiculoRepo extends CrudRepository<Veiculo, Long> {
    Veiculo findByPlaca(String placa);
    List<Veiculo> findByAnoFabricacaoGreaterThan(int anoFabricacao);

}
