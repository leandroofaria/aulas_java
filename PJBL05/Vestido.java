public class Vestido extends Roupa{

    public Vestido(String nome, float precoProduto, String marca) {
        super(nome, precoProduto, marca);
    }

    @Override
    public void calcularPreco(float acrescimo) {
        float preco = acrescimo - ((acrescimo * 10)/100);
    }
    
}
