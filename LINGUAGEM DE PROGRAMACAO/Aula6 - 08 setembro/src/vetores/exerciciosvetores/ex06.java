package vetores.exerciciosvetores;

import java.util.Scanner;

// Criar um programa para entrar com números inteiros em um vetor a de tamanho 10. Gerar
// e imprimir o vetor b onde cada elemento é o quadrado do elemento, na respectiva posição
// do vetor a.

public class ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.println("Digite o valor dos 10 números de cada posição do vetor: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = in.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            int valor = vetorA[i];
            vetorB[i] = (valor * valor);
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("O quadrado do número " + vetorA[i] + " na posição " + (i + 1) + " é de " + vetorB[i]);
        }
    }
}
