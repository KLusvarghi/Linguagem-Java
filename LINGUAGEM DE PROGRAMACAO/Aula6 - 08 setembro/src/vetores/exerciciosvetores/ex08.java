package vetores.exerciciosvetores;

import java.util.Scanner;

// Tentando descobrir se um dado era viciado, um dono de cassino o lançou n vezes. Dados
// os n resultados dos lançamentos, determinar o número de ocorrências de cada face.

public class ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] dado = new int[6];
        int n, face = 0;
        System.out.print("Numero de lancamentos do dado: ");
        n = in.nextInt();
        System.out.println("\nInforme a face de cada lancamento");

        System.out.println("Digite os resultados: \n");
        for (int i = 1; i <= n; i++) {
            System.out.printf("Face do %do. lancamento: ", i);
            face = in.nextInt();
            while (face < 1 || face > 6) {
                System.out.println("Erro: face invalida! Deve ser um valor entre 1 e 6");
                System.out.printf("Face do %do. lancamento: ", i);
                face = in.nextInt();
            }
            dado[face - 1]++;
        }

        System.out.println("\nO número de ocorrências de cada face foi: ");
        for (int i = 0; i < 6; i++) {
            if (dado[i] == 0) {
            } else {
                System.out.printf("Face %d: %d\n", i + 1, dado[i]);
            }
        }
    }
}
