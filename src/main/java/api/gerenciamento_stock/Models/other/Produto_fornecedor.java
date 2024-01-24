package api.gerenciamento_stock.Models.other;

import java.sql.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "produto_forcedor")
@Getter
@Setter
public class Produto_fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoProduto;

    private double quantidade_compra;

    private float valor;

    private Date prazo;

    

    
}
