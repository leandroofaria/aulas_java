public class personagem {
    private String nome;
    private int vida;
    private int ultimate;
    

    public personagem(String nome, int vida, int ultimate) {
        this.nome = nome;
        this.vida = vida;
        this.ultimate = mana;
    };


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public void aplicarDano(int dano) {
        vida -= dano;
        if(vida < 0) {
            vida=0;
            System.out.println(nome + "está morto(a).");
            return;
            // Se a vida chegar a 0, nada abaixo dessa linha será executado.
        }

        System.out.println("O dano recebido é de: " + dano );
        System.out.println("Você tem " + vida + " pontos de vida.");
    }

    public void usarFeitiço(String nome, int mana) {
        this.mana -= mana;
        if(mana<0) {
            this.mana = 0;
            System.out.println("Você está sem mana...");
            return;
        } 
        System.out.println("Você usou o feitiço " + nome);
        System.out.println("Você tem " + this.mana + " pontos de mana restantes.");
    }

    public void carregarUltimate(String nome, int porcentagem, String nomeUltimate) {
        this.ultimate += porcentagem;
        System.out.println("A ultimate do personagem " + nome + " Está em " + porcentagem + "%");
        if (this.ultimate >= 100) {
            this.ultimate = 0;
            System.out.println("O personagem " + nome + " usou a ultimate: " + nomeUltimate );

        }
    }

    public void mostrarMana() {
        System.out.println("Mana atual: " + this.mana);
    }
}
