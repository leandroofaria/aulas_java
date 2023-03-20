package aula03;

public class item {
    // CARACTERÍSTICAS -------------------------------------------
    String categoria;
        String nome;
        int quantidade;
        float valor;
        float avaliacao;
        float frete;
    
    // CONSTRUTOR ------------------------------------------------
    public item(String categoria, String nome, int quantidade, float valor, float avalaicao, float frete) {
        this.categoria = categoria;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.avaliacao = avaliacao;
        this.frete = frete;

    }

    // MÉTODOS ---------------------------------------------------- 

    public void adicionar() {
        System.out.println("Você adicionou " + nome + " no seu carrinho.");
    }

    public void valor() {
        System.out.println("O valor desse item é: " + valor + " reais.");
    }

    public void frete() {
        System.out.println("O frete desse item é: " + frete + " reais.");
    }

    public void avaliacao() {
        System.out.println("A avaliação desse item é: " + avaliacao + " estrelas.");
    }

    public void quantidade() {
        System.out.println("Ainda restam " + quantidade + " unidades desse item.");
    }

    public void comprar() {
        System.out.println("Você comprou um " + nome + " da china! Obrigado pela compra!");
    }

    // AÇÕES IPHONE
    public void ligar() {
        System.out.println("O celular está ligando...");
    }

    public void entrar() {
        System.out.println("O celular esta entrando na sua conta");
    }

    public void explodir() {
        System.out.println("O celular explodiu.");
    }

    // AÇÕES CHINELO
    public void usar() {
        System.out.println("Você colocou o chinelo.");
    }

    public void correr() {
        System.out.println("Você começou a correr com o chinelo");
    }

    public void estourar() {
        System.out.println("O chinelo estourou.");
    }
    
    // AÇÕES ÓLEO 
    public void trocar() {
        System.out.println("Você trocou o óleo da moto.");
    }

    // AÇÕES COLEIRA 
    public void colocar() {
        System.out.println("Você colocou a coleira no cachorro.");
    }

    // AÇÕES PS4
    public void desencaixotar() {
        System.out.println("Você tirou o ps4 da caixa.");
    }

    public void jogar() {
        System.out.println("Você está jogando no seu novo ps4.");
    }
}
