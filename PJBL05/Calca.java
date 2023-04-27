public class Calca extends Roupa {

    public Calca(String nome, float precoProduto, String marca) {
        super(nome, precoProduto, marca);
    }

    @Override
    public void calcularPreco(float acrescimo) {
        float preco = acrescimo - ((acrescimo * 15)/100);
    }
    
}
