import java.util.ArrayList;

public class Aula {
    private Pessoa professora;
    // Coleção de Pessoas
    private ArrayList<Pessoa> estudantes;

    public Aula() {
        professora = new Pessoa(null, 0);
        estudantes = new ArrayList<>();
    }

    public void setProfessora(Pessoa professora) {
        this.professora = professora;
    }

    public void createProfessora(String nome, int idade) {
        professora = new Pessoa(nome, idade);
    }

    public void createStudentCollection(ArrayList<Pessoa> estudantes) {
        this.estudantes = estudantes;
    }
}
