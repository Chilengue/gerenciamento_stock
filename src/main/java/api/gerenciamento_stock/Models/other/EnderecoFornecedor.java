package api.gerenciamento_stock.Models.other;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ProdutoVenda")
@Getter
@Setter
public class EnderecoFornecedor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    
    private String endere_fornecedor; 

    private String endere_rua;

    private String endere_Bairro;

    private String endere_Cidade;

    private String cnpj;
    
}









