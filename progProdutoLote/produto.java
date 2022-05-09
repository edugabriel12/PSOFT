package progProdutoLote;

public class produto {
    private String id = "123";
    private String nome = "Leite";
    private String fabricante = "Nestlê";

    public String toString() {
        return "O nome do produto é: " 
        + this.nome + "e seu fabricante é: " + this.fabricante
        + "com id: " + this.id;
    }

    public String getNome() {
        return this.nome;
    }
}
