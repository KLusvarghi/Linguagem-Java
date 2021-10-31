package matrizes.exerciciosmatrizes;
// Implemente um programa que leia duas matrizes n x n de números reais e gere e escreva

// uma terceira com os maiores elementos de cada posição entre as duas matrizes.

import java.util.Random;
import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Digite o tamanho das matrizes: ");
        int tam = in.nextInt();
        int tan = in.nextInt();
        int[][] matrix1 = new int[tam][tan];
        int[][] matrix2 = new int[tam][tan];
        int[][] maiorPosicao = new int[tam][tan];

        for (int a = 0; a < matrix1.length; a++) {
            for (int b = 0; b < matrix1.length; b++) {
                matrix1[a][b] = 1 + rand.nextInt(7);
                matrix2[a][b] = 1 + rand.nextInt(7);
            }
        }
        for (int a = 0; a < matrix1.length; a++) {
            for (int b = 0; b < matrix1.length; b++) {
                if (matrix1[a][b] > matrix2[a][b]) {
                    maiorPosicao[a][b] = matrix1[a][b];
                } else {
                    maiorPosicao[a][b] = matrix2[a][b];
                }
            }
        }

        for (int a = 0; a < matrix1.length; a++) {
            for (int b = 0; b < matrix1.length; b++) {
                System.out.print(matrix1[a][b] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int a = 0; a < matrix1.length; a++) {
            for (int b = 0; b < matrix1.length; b++) {
                System.out.print(matrix2[a][b] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Maior valor entre as duas matrizes: ");
        for (int a = 0; a < matrix1.length; a++) {
            for (int b = 0; b < matrix1.length; b++) {
                System.out.print(maiorPosicao[a][b] + "\t");
            }
            System.out.println();
        }

    }
}
