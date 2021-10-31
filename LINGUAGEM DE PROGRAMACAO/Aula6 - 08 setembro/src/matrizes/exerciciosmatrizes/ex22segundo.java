package matrizes.exerciciosmatrizes;

import java.util.Random;
import java.util.Scanner;

public class ex22segundo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Informe o numero de linhas e colunas da 1a. matriz: ");
        int linA = in.nextInt();
        int colA = in.nextInt();
        System.out.println();
        System.out.print("\nInforme o numero de linhas e colunas da 2a. matriz: ");
        int linB = in.nextInt();
        int colB = in.nextInt();
        if (colA != linB) {
            System.out.println("Erro: nao e' possivel multiplicar essas 2 matrizes!");

        } else {

            int[][] matrizA = new int[linA][colA], matrizB = new int[linB][colB], produto = new int[linA][colB];

            for (int a = 0; a < linA; a++) {
                for (int b = 0; b < colA; b++) {
                    matrizA[a][b] = 1 + rand.nextInt(2);
                }
            }

            for (int a = 0; a < linB; a++) {
                for (int b = 0; b < colB; b++) {
                    matrizB[a][b] = 1 + rand.nextInt(2);
                }
            }

            System.out.printf("\nMmatriz (%dx%d)\n", linA, colA);
            for (int a = 0; a < linA; a++) {
                for (int b = 0; b < colA; b++) {
                    System.out.print(matrizA[a][b] + "\t");
                }
                System.out.println();
            }

            System.out.printf("\nMatriz (%dx%d)\n", linB, colB);
            for (int a = 0; a < linB; a++) {
                for (int b = 0; b < colB; b++) {
                    System.out.print(matrizB[a][b] + "\t");
                }
                System.out.println();
            }

            System.out.printf("\nResultado da multiplicacao das 2 matrizes (%dx%d)\n", linA, colB);
            for (int i = 0; i < linA; i++) {
                for (int j = 0; j < colB; j++) {
                    produto[i][j] = 0;
                    for (int k = 0; k < colA; k++) {
                        produto[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                    System.out.printf("%d\t", produto[i][j]);
                }
                System.out.println();
            }
        }
    }
}
