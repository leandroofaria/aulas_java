public class Produto {
    private String nome;
    private float precoProduto;
    private String marca;


    public Produto(String nome, float precoProduto, String marca) {
        this.nome = nome;
        this.precoProduto = precoProduto;
        this.marca = marca;
    }
    
    public String getNome() {
        return this.nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public float getPrecoProduto() {
        return this.precoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }
}