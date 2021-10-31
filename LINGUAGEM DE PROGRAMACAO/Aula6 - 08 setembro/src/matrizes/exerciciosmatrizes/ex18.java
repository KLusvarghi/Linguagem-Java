package matrizes.exerciciosmatrizes;

import java.util.Random;
import java.util.Scanner;

// Desenvolva um programa em C para entrar com os valores para uma matriz An x m. Gerar e
// imprimir A t
// A matriz transposta é gerada trocando linha por coluna.
public class ex18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Digite o tamanho da matriz: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int[][] matriz = new int[x][y];

        for (int a = 0; a < x; a++) {
            for (int b = 0; b < y; b++) {
                matriz[a][b] = rand.nextInt(100);
            }
        }
        for (int a = 0; a < x; a++) {
            for (int b = 0; b < y; b++) {
                System.out.print(matriz[a][b] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("MATRIZ TRANSPOSTA:");
        for (int a = 0; a < y; a++) {
            for (int b = 0; b < x; b++) {
                System.out.print(matriz[b][a] + "\t");
            }
            System.out.println();
        }
    }
}
