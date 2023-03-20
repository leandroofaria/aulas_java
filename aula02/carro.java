import javax.annotation.processing.SupportedOptions;

public class carro {
    // Atributos (carac. do objeto) ----------------------
    String cor;
    String modelo;
    String marca;
    int ano;
    int numeroPortas;
    boolean ligado;
    float velocidade;

    //  Construtor ---------------------------------------
    public carro() {
        this.cor = "Prata";
        this.modelo = "Hb20";
        this.marca = "Hyundai";
        this.ano = 2021;
        this.numeroPortas = 4;
        this.ligado = false; 
        this.velocidade = 0f;
    }

    public carro(String cor, String modelo, String marca, int ano, int numeroPortas) {
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.numeroPortas = numeroPortas;

        this.ligado = false; 
        this.velocidade = 0f;

    }
    // Métodos (funções que o carro vai executar) --------
    public void Ligar() {
        ligado = true;
        System.out.println("O seu carro está ligado.");
    }

    public void Desligar() {
        ligado = false;
        System.out.println("O seu carro está desligado.");

    }

    public void Acelerar(float adicao) {
        velocidade += adicao;
        System.out.println("Sua velocidade agora é: " + velocidade);
    }

    public void Frear() {
        velocidade -= 5f;
        System.out.println("Sua velocidade agora é: " + velocidade);

    }

    public String Buzinar() {
        return "BIIIIIIIIII";

    }

    public String Bater() {
        return "BUMMMM";
    }

    public void LigarPisca(String lado) {
        if(lado.equals("direita")) {
            System.out.println("Você está virando para a direita.");
        } else {
            System.out.println("Você está virando para a esquerda.");
        }
    }

    
}


