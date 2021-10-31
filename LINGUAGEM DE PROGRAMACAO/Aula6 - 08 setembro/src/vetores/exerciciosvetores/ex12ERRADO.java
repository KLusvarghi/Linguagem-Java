package vetores.exerciciosvetores;

// https://www.urionlinejudge.com.br/judge/pt/problems/view/1245

import java.util.Scanner;

public class ex12ERRADO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Quanto pares são? ");
        int pares = in.nextInt();

        int[] tamanho = new int[pares];
        char[] pe = new char[pares];
        int cont = 0;

        for (int i = 0; i < tamanho.length; i++) {
            System.out.printf("\nQual o tamanho do %dº pé e o lado? \n", (1 + i));
            tamanho[i] = in.nextInt();
            pe[i] = in.next().charAt(0);

        }

        for (int p = 0; p < tamanho.length; p++) {
            for (int i = 0; i < tamanho.length; i++) {
                if (tamanho[p] == tamanho[i]) {
                    if (pe[p] != pe[i]) {
                        cont = cont + 1;
                    }
                }
            }
        }
        for (int i = 0; i < tamanho.length; i++) {
            System.out.println(tamanho[i] + " - " + pe[i]);
        }
        System.out.printf("\nExistem %d pares iguais\n", cont);
    }
}
