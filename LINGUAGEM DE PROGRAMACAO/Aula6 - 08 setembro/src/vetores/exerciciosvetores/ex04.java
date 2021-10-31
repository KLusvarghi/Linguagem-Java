package vetores.exerciciosvetores;

// Desenvolva um programa para armazenar n números inteiros em um vetor e depois
// imprimir todos os números positivos digitados.

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o numero de posições no vetor: ");
        int num = in.nextInt();

        int[] vetor = new int[num];
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite um valor na %d posição: ", i + 1);
            vetor[i] = in.nextInt();
        }
        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("Os números positivos são: ");
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] > 0) {
                    System.out.println("[" + vetor[i] + "]" + " na posição " + (i + 1));
                    cont++;
                }
            }
        } else {
            System.out.println("NÃO EXISTE NENHUM NÚMERO POSITIVO");
        }
    }
}
