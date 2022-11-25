import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variáveis.
        Scanner sc = new Scanner(System.in);
        int valorEntrada, total = 0;

        // Entrada de dados.
        valorEntrada = sc.nextInt();

        // Processamento.
        for(int i = 1; i <= valorEntrada; i++) {
            total += Math.pow(i, i);
        }

        // Exibição do resultado.
        System.out.println(total);
    }
}