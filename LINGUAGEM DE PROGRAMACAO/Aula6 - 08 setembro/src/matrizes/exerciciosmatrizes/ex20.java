package matrizes.exerciciosmatrizes;

import java.util.Random;
import java.util.Scanner;

// Implemente um programa que exibe um triângulo de Pascal de ordem n, para 1 < n  20.
// Considere uma matriz quadrada de ordem n, o triângulo de Pascal segue a seguinte regra
// de formação:
// • todos os elementos da primeira coluna da matriz são iguais a 1;
// • todos os elementos da diagonal principal da matriz também são iguais a 1;
// • para os demais elementos são obtidos pela soma do elemento da mesma coluna na
// linha de cima com o seu vizinho esquerdo;
// • os elementos acima da diagonal principal não são exibidos.
// Abaixo é mostrado um triângulo de Pascal de ordem 5:
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
public class ex20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("informe o tamanho da matrix: ");
        int x = in.nextInt();
        int y = in.nextInt();

        int[][] matriz = new int[x][y];

        int a = 0;
        int b = 0;
        int p = 0;
        if (x == y) {
            System.out.println();
            System.out.println("O TRIANGULO DE PASQUAL É: ");
            for (a = 0; a < matriz.length; a++) {
                for (b = 0; b < matriz.length; b++) { // VERTICAL
                    if (a == b) {
                        matriz[a][b] = 1;
                    }
                }
            }
            for (a = 0; a < matriz.length; a++) { // PRIMEIRACOLUNA TUDO IGUAL A "1"
                b = 0;
                matriz[a][b] = 1;
            }
            for (a = 1; a < matriz.length; a++) { // SEGUNDA COLUNA TUDO DE 1 ATÉ (X-1)
                b = 1;
                matriz[a][b] = a;
            }
            for (int tam = 1; tam < y - 1; tam++) { // CALCULO DE CADA POSIÇÃO ABAIXO DA DIAGONAL
                p = tam + 1;
                for (a = 1; a < matriz.length; a++) {
                    matriz[a][p] = matriz[a - 1][p] + matriz[a - 1][p - 1];
                    // pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];

                }
            }

            System.out.println();
            for (a = 0; a < matriz.length; a++) { // EXIBIR A MATRIZ
                for (b = 0; b < matriz.length; b++) {
                    System.out.print(matriz[a][b] + "\t");
                }
                System.out.println();
            }
        }
    }
}
