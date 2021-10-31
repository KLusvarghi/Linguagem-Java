//. Desenvolva um programa em Java que dados n inteiro e k natural, calcular k elevado a n. Não é permitido usar o método Math.pow().

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Digite um numero inteiro: ");
        double n = in.nextDouble();
        System.out.printf("Digite um numero natural: ");
        int k = in.nextInt();
        double x = n;
        for (int i = 1; i < k; i++) {
            x = x * x;
        }
        System.out.printf("%d elevado a %.2f é = %.2f ", k, n, x);

        // System.out.printf();
    }
}
