import java.util.Scanner;

public class vetoresEntradaSaida {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[5];
        int x = 1;
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", x);
            numeros[i] = in.nextInt();
            x++;
        }
        for (int y = 0; y < numeros.length; y++) {
            System.out.println(numeros[y]);
        }
    }
}
