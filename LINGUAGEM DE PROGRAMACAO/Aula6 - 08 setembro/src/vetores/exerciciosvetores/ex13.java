package vetores.exerciciosvetores;

// * https://www.urionlinejudge.com.br/judge/pt/problems/view/2162

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        boolean pico;

        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }
        if (h[0] == h[1]) {
            System.out.println(0);
        } else {
            if (h[0] > h[1]) {
                pico = true;
            } else {
                pico = false;
            }
            for (int i = 2; i < n; i++) {
                if (pico) {
                    if (h[i] <= h[i - 1]) {
                        System.out.println(0);
                        return;
                    }
                } else {
                    if (h[i] >= h[i - 1]) {
                        System.out.println(0);
                        return;
                    }
                }
                pico = !pico;
            }
            System.out.println(1);
        }

        // Scanner in = new Scanner(System.in);

        // System.out.print("Digite o número de paisagens: ");
        // int numPaisa = in.nextInt();

        // int[] vetor = new int[numPaisa];
        // int cont = 0;
        // if (numPaisa >= 3) {

        // System.out.println("Digite os valores: ");
        // for (int i = 0; i < vetor.length; i++) {
        // vetor[i] = in.nextInt();
        // }
        // for (int i = 0; i < vetor.length; i++) {
        // if (vetor[i] > vetor[i + 1]) {
        // if (vetor[i + 1] < vetor[i + 2]) {
        // cont++;
        // }
        // }
        // }
        // System.out.println(cont);
        // } else {
        // System.out.println("NUMERO INVÁLIDO DE PAISAGENS.");
        // }
    }
}
