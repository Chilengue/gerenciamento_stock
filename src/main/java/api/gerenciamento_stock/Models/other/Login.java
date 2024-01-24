package api.gerenciamento_stock.Models.other;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Table(name = "login")
@Data
public class Login {
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private  int id;

    @NotEmpty(message ="informe nome" )
    private String nome;

    @NotEmpty(message = "Digite sobrenome")
    private String sobreNome;

    @Email
    private String Email;

    @NotEmpty(message = "Digite a senha")
    private String Senha;

    @NotEmpty(message = "ConfirmarSenha")
    private  String confirmSenha;


}
