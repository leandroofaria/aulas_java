package aula03;

public class main {
    public static void main(String[] args) {
        item iphone = new item("eletronicos", "Iphone", 198, 508.93f, 4f, 0f);

        item coleira = new item("animais", "coleira", 174, 19.95f, 4.4f, 7.99f);

        item chinelo = new item("calçados", "chinelo slide", 69916, 39.41f, 4.2f, 7.99f);

        item oleoMoto = new item("automoveis", "óleo para moto", 1152, 22.59f, 4.6f, 8.64f);

        item ps4 = new item("jogos", "playstation 4", 8, 2449.02f, 0f, 0f);

        // AÇÕES ------------------------------------------------------ 

        // IPHONE
        System.out.println("");
        iphone.adicionar();
        iphone.valor();
        iphone.frete();
        iphone.avaliacao();
        iphone.quantidade();
        iphone.comprar();
        iphone.ligar();
        iphone.entrar();
        iphone.explodir();
        System.out.println("");

        // COlEIRA
        coleira.adicionar();
        coleira.valor();
        coleira.frete();
        coleira.avaliacao();
        coleira.quantidade();
        coleira.comprar();
        coleira.colocar();
        System.out.println("");

        // CHINELO
        chinelo.adicionar();
        chinelo.valor();
        chinelo.frete();
        chinelo.avaliacao();
        chinelo.quantidade();
        chinelo.comprar();
        chinelo.usar();
        chinelo.correr();
        chinelo.estourar();
        System.out.println("");

        // OLEO MOTO 
        oleoMoto.adicionar();
        oleoMoto.valor();
        oleoMoto.frete();
        oleoMoto.avaliacao();
        oleoMoto.quantidade();
        oleoMoto.comprar();
        oleoMoto.trocar();
        System.out.println("");

        // PS4
        ps4.adicionar();
        ps4.valor();
        ps4.frete();
        ps4.avaliacao();
        ps4.quantidade();
        ps4.comprar();
        ps4.desencaixotar();
        ps4.jogar();
        System.out.println("");
    }

        

    
}
