package matrizes.exerciciosmatrizes;
// Escreva um programa em C que dada uma matriz quadrada de ordem n de inteiros,

// determina se a matriz é triangular superior ou não. Matriz triangular superior é uma
// matriz onde todos os elementos de posições acima da diagonal principal são diferentes de
// 0 e todos os elementos demais elementos são iguais a 0.

import java.util.Random;
import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("informe o tamanho da matrix: ");
        int x = in.nextInt();

        int[][] matriz = new int[x][x];

        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz.length; b++) {
                if (b > a) {
                    matriz[a][b] = rand.nextInt(20);
                } else {
                    matriz[a][b] = 0;
                }
            }
        }
        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz.length; b++) {
                System.out.printf("[%d];[%d] \t", a, b);
            }
            System.out.println();
        }
        System.out.println();
        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz.length; b++) {
                System.out.print(matriz[a][b] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("É UMA MATRIZ TRIANGULAR SUPERIOR.");
    }

}
