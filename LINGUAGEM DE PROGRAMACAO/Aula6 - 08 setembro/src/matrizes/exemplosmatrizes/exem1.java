package matrizes.exemplosmatrizes;

import java.util.Random;

// Escreva um programa em Java que 

// preencha uma matriz de inteiros n x m
// com valores aleatório (use a classe 
// Random), imprima esta matriz e calcule e 
// imprima o somatório dos elementos da 
// matriz.

import java.util.Scanner;

public class exem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Informe o número de linhas e colunas: ");
        int l = in.nextInt();
        int c = in.nextInt();
        System.out.println(" ");
        int soma = 0;
        int[][] matriz = new int[l][c];

        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz[a].length; b++) {
                soma += matriz[a][b] = rand.nextInt(10);
            }
        }
        for (int[] linha : matriz) {
            for (int x : linha) {
                System.out.print(x + "\t"); // podendo exibir deste jeito ou do jeito debaixo
            }
            System.out.println(" ");

        }
        // for (int a = 0; a < matriz.length; a++) {
        // for (int b = 0; b < matriz[a].length; b++) {
        // System.out.print(matriz[a][b] + "\t");
        // }
        // System.out.println(" ");
        // }
        System.out.println();
        System.out.println("A soma dos valores da matriz é " + soma);
    }
}
