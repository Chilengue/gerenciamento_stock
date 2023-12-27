package api.gerenciamento_stock.Models.other;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "informacaoMacroEconomica")
@Getter
@Setter
public class informacaoMacroEconomica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_informacao;
    
    private float TaxaSeli;

    private String periodo;
    
}
