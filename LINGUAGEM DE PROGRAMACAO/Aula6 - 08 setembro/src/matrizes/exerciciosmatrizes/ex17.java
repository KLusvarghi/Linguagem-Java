package matrizes.exerciciosmatrizes;

import java.util.Random;
import java.util.Scanner;

// Desenvolva um programa para entrar com valores inteiros para uma matrizA 4 x 4 e para
// uma matrizB 4 x 4. Gerar e imprimir a matriz Soma 4x 4 contendo a soma dos elementos de A
// e B.
public class ex17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        int[][] soma = new int[4][4];

        for (int a = 0; a < matrizA.length; a++) {
            for (int b = 0; b < matrizA.length; b++) {
                matrizA[a][b] = rand.nextInt(20);
                matrizB[a][b] = rand.nextInt(20);
            }
        }
        for (int a = 0; a < soma.length; a++) {
            for (int b = 0; b < soma.length; b++) {
                soma[a][b] = matrizA[a][b] + matrizB[a][b];
            }
        }
        for (int a = 0; a < soma.length; a++) {
            for (int b = 0; b < soma.length; b++) {
                System.out.print(matrizA[a][b] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int a = 0; a < soma.length; a++) {
            for (int b = 0; b < soma.length; b++) {
                System.out.print(matrizB[a][b] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("A SOMA DAS DUAS MATRIZES É: ");
        for (int a = 0; a < soma.length; a++) {
            for (int b = 0; b < soma.length; b++) {
                System.out.print(soma[a][b] + "\t");
            }
            System.out.println();
        }
    }
}
