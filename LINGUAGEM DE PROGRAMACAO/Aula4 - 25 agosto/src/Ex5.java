// Desenvolva um programa em Java que dados 10 números, imprima o quadrado de cada um deles.

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº numero:", i);
            int quadra = in.nextInt();
            System.out.printf("O quadrado de %d = %d\n\n", quadra, quadra * quadra);
        }
    }
}
