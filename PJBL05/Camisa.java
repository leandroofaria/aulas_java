public class Camisa extends Roupa{
    @Override
    public void calcularPreco(float acrescimo) { 
        float preco = acrescimo - ((acrescimo * 10)/100);
    }
}
