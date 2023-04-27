import java.util.ArrayList;
import java.util.List;

public class Jogo {
    
    

    // Coleção de personagem
    private List<personagem> timeAzul;
    private List<personagem> timeVermelho;

    private personagem lux;
    private personagem draven;
    private personagem vex;
    private personagem zed;
    private personagem mundo;

    public Jogo() {
        timeAzul = new ArrayList<>();
        timeAzul.add(new personagem("Lux", 510, 150));
        draven = new personagem("Draven", 510, 150);
        timeAzul.add(draven);

    }
    
    public void comecar() {
        draven.usarFeitiço("Revolução dos machados", 50);
        draven.usarFeitiço("Revolução dos machados", 50);
        draven.usarFeitiço("Revolução dos machados", 50);
        lux.usarFeitiço("Prisão de luz", 80);
        draven.usarFeitiço("Revolução dos machados", 50);
    }
}
