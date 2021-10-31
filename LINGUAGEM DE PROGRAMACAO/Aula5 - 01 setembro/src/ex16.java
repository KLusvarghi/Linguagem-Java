// Desenvolva um programa em Java que dado um inteiro positivo n, imprima todos os números
// primos menores ou iguais a n.

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int metade = 0;
        System.out.print("Digite um número: ");
        int num = in.nextInt();

        for (int numerosMenor = num; numerosMenor <= 2; numerosMenor--) {
            if (numerosMenor % 1 == 0) {
                if (numerosMenor % numerosMenor == 0) {
                    metade = numerosMenor / 2;
                    if (numerosMenor % metade != 0) {
                        System.out.println(numerosMenor);
                    }
                }
            }
        }
    }
}