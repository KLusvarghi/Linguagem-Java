package matrizes.exerciciosmatrizes;

import java.util.Scanner;

public class ex20segunda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Informe a ordem do triangulo de Pascal (2-20): ");
        n = in.nextInt();
        while (n < 2 || n > 20) {
            System.out.println("Erro: ordem invalida! A ordem tem que ser uma valor entre 2 e 20");
            System.out.print("Informe a ordem do triangulo de Pascal (2-20): ");
            n = in.nextInt();
        }
        int[][] pascal = new int[n][];
        for (int i = 0; i < n; i++) {
            pascal[i] = new int[i + 1];

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
                    // matriz[a][p] = matriz[a - 1][p] + matriz[a - 1][p - 1];

                }
                System.out.printf("%d\t", pascal[i][j]);
            }
            System.out.println();
        }
    }
}
