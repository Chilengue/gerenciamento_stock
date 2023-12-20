package api.gerenciamento_stock.Models.other;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "forncedor")
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
}
