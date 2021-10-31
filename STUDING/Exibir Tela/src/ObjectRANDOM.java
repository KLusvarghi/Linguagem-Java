import java.util.Random;
import java.util.Scanner;

public class ObjectRANDOM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random gerador = new Random();
        int numero = gerador.nextInt(20 + 1);

        while (numero != 6) {
            System.out.println("Gerou o número " + numero);
            numero = 1 + gerador.nextInt(7);
        }
        System.out.println("Gerou o número 3!!!");

        // com numeros inteiros
        for (int i = 0; i == 10; i++) {
            System.out.println(gerador.nextInt(10 + 1));
        }

        // com numeros double/float
        for (int i = 0; i == 10; i++) {
            System.out.println(gerador.nextDouble() * 30);
        }

        // com numeros boolean
        for (int i = 0; i == 10; i++) {
            System.out.println(gerador.nextBoolean());
        }
    }
}
