package api.gerenciamento_stock.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import api.gerenciamento_stock.Models.other.Produto;
// import java.util.List;

@Repository
public interface ProdutoReposotory extends CrudRepository<Produto, Integer> {

    // List<Produto> findAll();

    // Produto findById_Produto(int id_Produto);

    // //List
    // List<Produto> findById_ProdutoDesc(int id_Produto);

    // int countBycodigo(int id_Produto);
    
}
