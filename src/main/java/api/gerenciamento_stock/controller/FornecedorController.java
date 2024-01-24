package api.gerenciamento_stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.gerenciamento_stock.Models.other.Fornecedor;
import api.gerenciamento_stock.Repository.FornecedorRepository;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {
    
    @Autowired
    private  FornecedorRepository fornecedorRepository;

    @GetMapping("/listar")
    public Iterable<Fornecedor> listar(){

        return fornecedorRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Fornecedor cadastrar(@RequestBody Fornecedor obj){
        return fornecedorRepository.save(obj);
    }
}
