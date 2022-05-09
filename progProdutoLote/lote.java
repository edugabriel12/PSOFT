package progProdutoLote;
import java.util.Date;

public class lote {
    private String id = "1234";
    private produto P = new produto();
    private Date dataFabricacao = new Date();
    private int quantidade = 123;
    private Date dataValidade = new Date();
    
    public String toString() {
        return "Este é o lote do produto " 
        + this.P.getNome() + " e sua quantidade é: " + 
        this.quantidade;
    }
}
