public class Main {
    public static void main(String[] args) {

        // Variáveis.
        int multiplosDois = 0, multiplosTres = 0, multiplosCinco = 0;

        for(int i = 1; i <= 1000; i++){
            if(i % 2 == 0)
                multiplosDois++;

            if (i % 3 == 0)
                multiplosTres++;

            if (i % 5 == 0)
                multiplosCinco++;
        }

        System.out.println("Quatidades");
        System.out.printf("Multiplos de 2: %d\n", multiplosDois);
        System.out.printf("Multiplos de 3: %d\n", multiplosTres);
        System.out.printf("Multiplos de 5: %d\n", multiplosCinco);

    }
}