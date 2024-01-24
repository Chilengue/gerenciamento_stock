package api.gerenciamento_stock.Models.other;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "fornecedor")
@Getter
@Setter
public  class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @NotEmpty(message = "informe nome do forncedor")
    private String nome;

    @NotEmpty(message = "informe o numero do telefone")
    private String telefone;

    @Email(message = "digite o email")
    private String Email;

    @OneToOne
    @JoinColumn(name = "codigo_ProdutoFor", referencedColumnName = "codigoProduto")
    private Produto_fornecedor produto;

    // @OneToOne
    // @JoinColumn(name="codigo_fornecedor", referencedColumnName = "codigoProduto")
    // private Produto_fornecedor produtosFornecer;

    // @OneToMany
    // @JoinColumn(name = "", referencedColumnName = "")
    // private EnderecoFornecedor enderecoFornecedor;
}
