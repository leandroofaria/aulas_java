public abstract class Roupa extends Produto {


    public Roupa(String nome, float precoProduto, String marca) {
        super(nome, precoProduto, marca);

    }

    protected String cor;
    protected int tamanhoDaRoupa;

    public abstract void calcularPreco(float acrescimo);
}
