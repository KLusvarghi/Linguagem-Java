package vetores.exerciciosvetores;

import java.util.Scanner;

// Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.
// Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.
// Exemplo de Entrada	Exemplo de Saída
// 0
// -5
// 63
// 0
// ...

// X[0] = 1
// X[1] = 1
// X[2] = 63
// X[3] = 1
// ...

public class ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %dº valor do vetor na posição %d: ", (i + 1), i);
            vetor[i] = in.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] <= 0) {
                vetor[i] = 1;
                System.out.println(vetor[i]);
            } else {
                System.out.println(vetor[i]);
            }

        }
    }
}
