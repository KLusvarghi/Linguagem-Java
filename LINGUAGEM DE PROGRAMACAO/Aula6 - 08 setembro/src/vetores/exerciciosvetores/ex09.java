package vetores.exerciciosvetores;

import java.util.Scanner;

// Dada uma sequência de n números inteiros, determinar qual é a maior subsequência
// crescente nesta sequência. Por exemplo, seja n = 8, a sequência 5, 7, -1, 0 , 3, 6, 6, 4, então
// a maior sequência crescente é -1, 0, 3, 6.

public class ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o numero de elementos da sequencia: ");
        int n = in.nextInt();

        int[] matriz = new int[n];
        int indexMaior, indexAtual, tamMaior, tamAtual;

        System.out.printf("Informe os %d elementos da sequencia\n", n);
        for (int i = 0; i < n; i++) {
            matriz[i] = in.nextInt();
        }

        indexMaior = indexAtual = 0;
        tamMaior = tamAtual = 1;
        for (int i = 0; i < n - 1; i++) {
            if (matriz[i + 1] > matriz[i]) {
                tamAtual++;
                if (tamAtual > tamMaior) {
                    tamMaior = tamAtual;
                    indexMaior = indexAtual;
                }
            } else {
                tamAtual = 1;
                indexAtual = i + 1;
            }
        }
        System.out.print("\nMaior sequencia crescente: ");
        for (int i = indexMaior; i < indexMaior + tamMaior; i++) {
            System.out.printf("%d ", matriz[i]);
        }
        System.out.println();
    }
}
