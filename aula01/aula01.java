import java.util.ArrayList;
import java.util.Scanner;

public class aula01 {

    public void soma(int a, int b) {
        int resultado = a + b;
        System.out.println(resultado);
    }
    

    public static void main(String[] args) {
        System.out.println("Leandro");

        // numero = int(input("Digite um número: "))

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String nomee = scanner.nextLine();
        System.out.println(nomee);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        // System.out.println("Sua idade é " + idade);

        //if idade < 18:
        if (idade < 18) {
            System.out.println("Você é menor de idade");
        }
        else if (idade == 18) {
            System.out.println("Você tem 18!");
        }
        else {
            System.out.println("Você é maior de idade");
        }

        int contador = 0;
        while (contador < 5) {
            System.out.println(contador);
            contador++;
        }

        //for i in range(0,10):
        //for valor in lista:

        //1. declaração de uma variavel contadora
        //2. condição
        //3. incremento/decremento
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int[] array = new int[5];
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Pedro") ;
        nomes.add("Leandro") ;
        nomes.add("Lucas") ;

        for (String nome : nomes) {
            System.out.println(nome);
            
        }


    }
}
