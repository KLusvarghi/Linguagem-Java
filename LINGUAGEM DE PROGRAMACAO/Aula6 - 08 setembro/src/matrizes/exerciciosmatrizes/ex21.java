package matrizes.exerciciosmatrizes;

import java.util.Random;
import java.util.Scanner;

// Criar um programa que deixe entrar com valores para uma matriz de ordem n e verifique
// se ela é ou não uma matriz identidade. Matriz 
// identidade é aquela em que todos os elementos da diagonal principal são iguais a 1 e os demais elementos são iguais a 0.

// . Escreva um programa que declare uma matriz 10 x 10. Preencha com 1 a diagonal
// principal e com 0 os demais elementos. Escreva ao final a matriz obtida.
public class ex21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Informe o tamanho da matriz: ");
        int x = in.nextInt();

        int[][] matriz = new int[x][x];

        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz[a].length; b++) { // INFORMAR VALORES DA MATRIZ
                if (a == b) {
                    matriz[a][b] = 1 + rand.nextInt(1);
                } else {
                    matriz[a][b] = rand.nextInt(1);
                }
            }
        }
        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz[a].length; b++) { // EXIBIR MATRIZ
                System.out.print(matriz[a][b] + "\t");
            }
            System.out.println(" ");
        }
    }
}
