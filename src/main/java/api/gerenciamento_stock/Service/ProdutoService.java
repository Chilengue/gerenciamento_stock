package api.gerenciamento_stock.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import api.gerenciamento_stock.Models.Mensagem;
import api.gerenciamento_stock.Models.other.Produto;
import api.gerenciamento_stock.Repository.ProdutoReposotory;

@Service
public class ProdutoService {

    @Autowired
    private Mensagem mensagem;

    @Autowired
    private ProdutoReposotory accao;

    public ResponseEntity<?> cadastrar(Produto obj)
    {
        if (obj.getModelo().equals("")) {
            mensagem.setMensagem("o modelo preisa ser Prenchido");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else if(obj.getQuantidade_estoque()<0){
            mensagem.setMensagem("digita o estoque");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else if(obj.getPreco_custoFinal()<1.0){
            mensagem.setMensagem("Digite um valor maior que R$ 0,00!");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else if(obj.getVolumeEmbalagemDoProduto()<0){
            mensagem.setMensagem("O volume da embalagem precisa ser positivo.");
            return new ResponseEntity<>(mensagem , HttpStatus.UNPROCESSABLE_ENTITY);
        }else{
            return new ResponseEntity<>(accao.save(obj), HttpStatus.CREATED);
        }
    }

    public ResponseEntity<?> selecionarpeloId (int id_Produto)
    {
        if (accao.countBycodigo(id_Produto)==0) {
            mensagem.setMensagem("codigo nao foi encontrado");
            return new ResponseEntity<>(accao.findById_Produto(id_Produto), HttpStatus.BAD_REQUEST);
        }
        else
        {
            return new ResponseEntity<>(accao.findById_Produto(id_Produto), HttpStatus.OK);
        }
    }

    //editar os produto
    public ResponseEntity<?> editar(Produto obj)
    {
        if(accao.countBycodigo(obj.getId_Produto())==0){
            mensagem.setMensagem("o codigo informado nao existe");
            return new ResponseEntity<>(mensagem, HttpStatus.NOT_FOUND);
        }
        else if(obj.getModelo().equals(""))
        {
            mensagem.setMensagem("E necessario informar o modelo");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else if (obj.getQuantidade_estoque()<0) {
            mensagem.setMensagem("aumenta estoque");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }
        else if(obj.getPreco_custoFinal()<0.0){
        mensagem.setMensagem("E necessario informar o preco real");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }else if(obj.getVolumeEmbalagemDoProduto()<0){
                  mensagem.setMensagem("E necessario informar o preco real");
            return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
        }
        else{
            return new ResponseEntity<>(accao.save(obj), HttpStatus.OK);
        }
    }

    public ResponseEntity<?> remover(int id_Produto)
    {
        if(accao.countBycodigo(id_Produto)==0){
            mensagem.setMensagem("Nao foi possivel realizar a exclusão. O código não foi encontrado.");
            return new ResponseEntity<>(mensagem, HttpStatus.NOT_FOUND);
        }else{
            Produto obj =accao.findById_Produto(id_Produto);
            accao.delete(obj);

            mensagem.setMensagem("pessoa removida com sucesso!");
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        }
    }
}