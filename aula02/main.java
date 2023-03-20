public class main {
    public static void main(String[] args) {
        carro hb20 = new carro();
        carro sandero = new carro("Branco", "Sandero", "Renault", 2006, 2);

        System.out.println("");
        System.out.println("O seu carro é um " + hb20.modelo);
        System.out.println("O modelo pertence a marca " + hb20.marca);
        System.out.println("A cor do seu carro é " + hb20.cor);
        System.out.println("O ano do seu carro é " + hb20.ano);
        System.out.println("");

        System.out.println("");
        System.out.println("O seu carro é um " + sandero.modelo);
        System.out.println("O modelo pertence a marca " + sandero.marca);
        System.out.println("A cor do seu carro é " + sandero.cor);
        System.out.println("O ano do seu carro é " + sandero.ano);
        System.out.println("");

        // ----------------------------------------------------------
        hb20.Ligar();
        hb20.Acelerar(40);
        hb20.Acelerar(60);
        hb20.Frear();
        hb20.Frear();
        hb20.Frear();
        System.out.println(hb20.Buzinar());
        hb20.LigarPisca("direita");
        hb20.LigarPisca("esquerda");
        System.out.println(hb20.Bater());
        hb20.Desligar();

    }
}