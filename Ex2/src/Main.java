import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variáveis.
        Scanner sc = new Scanner(System.in);
        int notaAltura, notaBeleza, notaCarisma;

        // Entrada de dados.
        notaAltura = sc.nextInt();
        notaBeleza = sc.nextInt();
        notaCarisma = sc.nextInt();

        // Verificação condicional.
        if(notaAltura > 7) {
            if (notaBeleza > 7) {
                if (notaCarisma > 7) {
                    System.out.println("Booooraa");
                } else {
                    System.out.println("só vai...");
                }
            } else {
                if (notaCarisma > 7) {
                    System.out.println("só vai...");
                } else {
                    System.out.println("Fé em Deus...");
                }
            }
        } else {
            if (notaBeleza > 7) {
                if (notaCarisma > 7) {
                    System.out.println("só vai...");
                } else {
                    System.out.println("Fé em Deus...");
                }
            } else {
                if (notaCarisma > 7) {
                    System.out.println("Fé em Deus...");
                } else {
                    System.out.println("Misericórdia");
                }
            }
        }
    }
}