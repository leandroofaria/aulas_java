public class Calca extends Roupa {

    @Override
    public void calcularPreco(float acrescimo) {
        float preco = acrescimo - ((acrescimo * 15)/100);
    }
    
}
