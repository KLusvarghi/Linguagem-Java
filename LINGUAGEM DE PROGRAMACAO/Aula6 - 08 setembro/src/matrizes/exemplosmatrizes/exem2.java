package matrizes.exemplosmatrizes;

import java.util.Random;

// Escreva um programa em Java que preencha uma matriz de reais n x m com valores aleatório (use a classe Random), 
// imprima esta matriz e determine e imprima a posição (linha e coluna) do maior elemento da matriz.

import java.util.Scanner;

public class exem2 {
    private static int i;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Informe o número de linhas e colunas: ");
        int l = in.nextInt();
        int c = in.nextInt();
        System.out.println(" ");
        int maiorNumero = 0;
        int[][] matriz = new int[l][c];

        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz[a].length; b++) {
                matriz[a][b] = rand.nextInt(100);
            }
        }

        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz[a].length; b++) {
                System.out.print(matriz[a][b] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println();

        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz[a].length; b++) {
                if (maiorNumero < matriz[a][b]) {
                    maiorNumero = matriz[a][b];
                }
            }
        }

        System.out.println("A soma dos valores da matriz na posição é " + maiorNumero);
    }
}