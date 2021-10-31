package matrizes.exerciciosmatrizes;

import java.util.Random;
import java.util.Scanner;

// O produto de uma matriz por outra não é determinado por meio do produto dos seus
// respectivos elementos. Assim, o produto das matrizes A = (ai j) m x p e B = (bi j) p x n é a matriz
// C = (ci j) m x n em que cada elemento cij é obtido por meio da soma dos produtos dos
// elementos correspondentes da i-ésima linha de A pelos elementos da j-ésima coluna B.
// Escreva um programa que dadas duas matrizesA m x p e matrizB p x n gera e imprima a matrizC m x n
// obtida através da multiplicação das matrizes A e B. Note que o produto de duas matrizes
// só pode ser computado se o número de colunas da primeira matriz for igual ao número de
// linhas da segunda.
public class ex22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Digite o tamanho da 1º matriz: ");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.print("\nDigite o tamanho da 2º matriz: ");
        int z = in.nextInt();
        int w = in.nextInt();

        if (x != z || y != w) {
            System.out.print("\n IMPOSSIVEL CALCULAR COM SUAS METRIZES DIFERENTES.\n");
        } else {

            int[][] matrix1 = new int[x][y], matrix2 = new int[x][y], produto = new int[x][y];

            for (int a = 0; a < matrix1.length; a++) {
                for (int b = 0; b < matrix1.length; b++) {
                    matrix1[a][b] = 1 + rand.nextInt(10);
                    matrix2[a][b] = 1 + rand.nextInt(10);
                }
            }
            for (int a = 0; a < matrix1.length; a++) {
                for (int b = 0; b < matrix1.length; b++) {
                    produto[a][b] = matrix1[a][b] * matrix2[a][b];
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
            System.out.println("O PRODUTOS DAS DUAS MATRIZES É ");
            for (int a = 0; a < matrix1.length; a++) {
                for (int b = 0; b < matrix1.length; b++) {
                    System.out.print(produto[a][b] + "\t");
                }
                System.out.println();
            }
        }
    }
}
