package api.gerenciamento_stock.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import api.gerenciamento_stock.Models.other.Fornecedor;

@Repository
public interface FornecedorRepository extends CrudRepository<Fornecedor, Integer> {
    
}
