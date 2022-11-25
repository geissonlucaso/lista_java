import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variáveis.
        Scanner sc  = new Scanner(System.in);;
        double nota, frequencia;

        // Entrada de dados.
        nota = sc.nextDouble();
        frequencia = sc.nextDouble();

        if(nota >= 7.0 && frequencia >= 0.75)
            System.out.println("Aprovado");
        else if((4.0 <= nota && nota < 7.0) && frequencia >= 0.75)
            System.out.println("Em recuperação");
        else if(nota < 4.0 || frequencia < 0.75)
            System.out.println("Reprovado");

    }
}