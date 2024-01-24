
 package api.gerenciamento_stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.gerenciamento_stock.Models.other.Produto;
import api.gerenciamento_stock.Repository.ProdutoReposotory;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoReposotory produtosAcao;

    @GetMapping("/listar")
    public Iterable<Produto> listar()
    {
        return produtosAcao.findAll();
    }

    @PostMapping("/cadastrar")
    public Produto cadastrar(@RequestBody Produto obj){
     return produtosAcao.save(obj);   
    }

    
}