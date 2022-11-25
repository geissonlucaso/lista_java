import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        * O enunciado não deixou claro os valores de cada um dos boletos.
        * Vou supor que cada um tem o valor de R$ 250,00 para poder calcular se
        * vai "sobrar algum salário", "não sobrar nada" ou se vai "ficar no vermelho".
        *
        * O enunciado também não deixa claro as saídas que devem ser exibidas. Por isso, escolhi mostrar
        * uma mensagem de status para cada situação.
        * */

        // Variáveis.
        Scanner sc = new Scanner(System.in);
        double salario;

        // entrada de dados.
        salario = sc.nextDouble();

        // Processamento.
        double salarioLiquido = salario - (salario * 0.125 + salario * 0.06);   // Desconto folha + VR.
        salarioLiquido = salarioLiquido - (4 * 250);                            // Pagamento de 4 boletos.

        if(salarioLiquido < 0.0)
            System.out.printf("Deu ruim. Saldo: R$ %.2f.", salarioLiquido);
        else if(salarioLiquido == 0.0)
            System.out.printf("Tá de boas. Saldo: R$ %.2f.", salarioLiquido);
        else
            System.out.printf("Mandar para a poupança. Saldo: R$ %.2f.", salarioLiquido);

    }
}