public class Camisa extends Roupa{


    public Camisa(String nome, float precoProduto, String marca) {
        super(nome, precoProduto, marca);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void calcularPreco(float acrescimo) { 
        float preco = acrescimo - ((acrescimo * 10)/100);
    }
}
