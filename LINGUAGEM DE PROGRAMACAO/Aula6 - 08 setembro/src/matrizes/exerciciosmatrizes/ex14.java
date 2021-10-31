package matrizes.exerciciosmatrizes;

import java.util.Random;
import java.util.Scanner;

// Criar um programa que leia os elementos de uma matriz inteira n x n e:
// 1. escreva os elementos da diagonal principal;
// 2. escreva todos os elementos, exceto os elementos da diagonal principal;
// 3. escreva os elementos da diagonal secundária.

public class ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Informe o tamanho da matrix: ");
        int l = in.nextInt();
        int c = in.nextInt();
        System.out.println(" ");

        if (l == c) {
            int diagonalPrincipal = 0;
            int diagonalSecundaria = 0;
            int somaTodos = 0;
            int[][] matriz = new int[l][c];

            for (int a = 0; a < matriz.length; a++) {
                for (int b = 0; b < matriz[a].length; b++) { // INFORMAR VALORES DA MATRIZ
                    matriz[a][b] = rand.nextInt(20);
                }
            }

            for (int a = 0; a < matriz.length; a++) {
                for (int b = 0; b < matriz[a].length; b++) { // EXIBIR MATRIZ
                    System.out.print(matriz[a][b] + "\t");
                }
                System.out.println(" ");
            }

            // for (int a = 0; a < matriz.length; a++) {
            // for (int b = 0; b < matriz[a].length; b++) {
            // if (a == b) {
            // diagonalPrincipal += matriz[a][b];
            // }
            // }
            // }
            for (int a = 0; a < l; a++) {
                diagonalPrincipal += matriz[a][a];
            }

            // for (int i = matriz.length - 1; i >= 0; i--) {
            // for (int j = matriz.length - 1; j >= 0; j--) {
            // if (i + j == matriz.length - 1) {
            // diagonalSecundaria += matriz[i][j];
            // }
            // }
            // }
            for (int a = 0; a < l; a++) {
                diagonalSecundaria += matriz[a][l - 1 - a];
            }

            for (int a = 0; a < matriz.length; a++) {
                for (int b = 0; b < matriz[a].length; b++) { // todos os elementos, exceto os elementos da diagonal
                                                             // principal
                    if (a != b) {
                        somaTodos += matriz[a][b];
                    }
                }
            }

            System.out.println(" ");
            System.out.println("A soma da diagonal Principal é: " + diagonalPrincipal);
            System.out.println("A soma da todos menos da diagonal Principal é: " + somaTodos);
            System.out.println("A soma da diagonal Secundária é: " + diagonalSecundaria);
        } else {
            System.out.println("NÃO HÁ COMO FAZER SE A MATRIZ NÃO TEM O MESMO NUMERO DE LINHAS E COLUNAS...");
            System.out.println();
        }
    }
}
