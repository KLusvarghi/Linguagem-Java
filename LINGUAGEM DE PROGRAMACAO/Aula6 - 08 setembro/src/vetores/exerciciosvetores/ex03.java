// // Desenvolva um programa para armazenar 10 números inteiros em um vetor e imprimir
// uma listagem numerada contendo o número e umas das mensagens: par ou ímpar, para
// cada elemento do vetor.
package vetores.exerciciosvetores;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[9];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite um valor na %d posição: ", i + 1);
            vetor[i] = in.nextInt();
        }
        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i] + " - PAR");
            } else {
                System.out.println(vetor[i] + " - ÍMPAR");
            }
        }
    }
}
