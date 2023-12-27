package api.gerenciamento_stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import api.gerenciamento_stock.Models.other.Produto;
import api.gerenciamento_stock.Repository.ProdutoReposotory;
import api.gerenciamento_stock.Service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutoReposotory produtoReposotory;

    @Autowired
    private ProdutoService ProdutoService;

    @GetMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody Produto obj)
    {
        return ProdutoService.cadastrar(obj);
    }
    
}
