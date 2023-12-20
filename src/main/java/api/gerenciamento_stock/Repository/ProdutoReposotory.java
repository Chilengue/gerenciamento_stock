package api.gerenciamento_stock.Repository;

import  java.util.*;
import org.springframework.data.repository.CrudRepository;


import api.gerenciamento_stock.Models.other.Produto;
import java.util.List;


public interface ProdutoReposotory extends CrudRepository<Produto, Long> {

    List<Produto> findAll();

    Produto findById_Produto(int id_Produto);

    //List
    List<Produto> findById_ProdutoDesc(int id_Produto);

    int countBycodigo(int id_Produto);
    
}
