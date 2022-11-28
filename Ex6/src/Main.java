import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Constantes.
        final double TAXA_PERCENTUAL = 0.1;

        // Variáveis.
        Scanner sc = new Scanner(System.in);
        double valorConta, valorDose, dezPorCento;
        int opcao;

        // Entrada de dados.
        System.out.print("Valor inicial da conta: R$ ");
        valorConta = sc.nextDouble();
        System.out.print("Valor dose: R$ ");
        valorDose = sc.nextDouble();

        do {
            System.out.print("Deseja ouvir mais um modão?\n");
            System.out.println("1-Sim\n2-Não");
            opcao = sc.nextInt();

            if (opcao == 1)
                valorConta += valorDose;

            System.out.printf("Valor conta: R$ %.2f\n", valorConta);
            dezPorCento = valorConta * TAXA_PERCENTUAL;
            System.out.printf("Percentual 10: R$ %.2f\n", dezPorCento);

            System.out.print("--------------------------------------\n");
        } while (opcao == 1);

        sc.close();
    }
}