package api.gerenciamento_stock.Models.other;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "produtos")
@Getter
@Setter
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Produto;

    private String modelo;

    private int quantidade_estoque;

    private float preco_custoFinal;

    private float volumeEmbalagemDoProduto;

    
}
