public class Pessoa {
    // Deixar as variaveis privadas para encapsular
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()) {
            System.out.println("Digite o nome certo.");
        }
        else {
            this.nome = nome;
        }
        
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if(idade < 0) {
            System.out.println("Você colocou a idade errada");
        }
        else {
            this.idade = idade;
        }
    }
    
}
