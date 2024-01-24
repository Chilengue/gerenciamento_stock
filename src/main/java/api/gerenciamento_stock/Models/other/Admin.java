package api.gerenciamento_stock.Models.other;

import java.rmi.server.UID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Table(name = "Admin")
@Data
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UID Id;
    
    @NotEmpty(message = "digite seu username")
    private String username;

    @NotEmpty(message = "digite sua senha")
    private String Senha;
    
}
