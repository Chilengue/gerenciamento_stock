package api.Repository;

import java.util.*;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import api.gerenciamento_stock.Models.other.Produto;
import java.util.List;


@Repository
public interface RepositorioRepository extends CrudRepository<Produto, Long>{
    
    List<Produto> findAll();

    List<Produto> findById_Produto(long id_Produto);

    List<Produto> findByQuantidade_estoque(int quantidade_estoque);

    @Query(value = "SELECT * FROM produtos", nativeQuery = true)
    int somaProdutos();
    


}
