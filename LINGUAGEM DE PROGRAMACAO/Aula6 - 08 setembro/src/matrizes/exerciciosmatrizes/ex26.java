package matrizes.exerciciosmatrizes;

import java.util.Random;
import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Digite a quantidade de jogadores: ");
        int x = in.nextInt();
        System.out.print("Digite a quantidade de jogos: ");
        int y = in.nextInt();
        int[][] matriz = new int[x][y];

        int a, b, cont = 0;

        for (a = 0; a < x; a++) {
            for (b = 0; b < y; b++) {
                matriz[a][b] = rand.nextInt(6);
            }
        }
        System.out.println();
        for (a = 0; a < x; a++) {
            for (b = 0; b < y; b++) {
                System.out.print(matriz[a][b] + "\t");
            }
            System.out.println();
        }

        // for ( b = 0; b < x; b++) {
        // for ( a = 0; a < y; a++) {
        // // matriz[a][b];
        // if (matriz[a][b] == 0) {
        // cont = 1;
        // }
        // }

        // for (b = 0; b < x; b++) {
        // for ( a = 0; a < y; a++) {
        // if (cont >= 1) {
        // // matriz[a][b] = 0;
        // cont1++;

        // }
        // }
        // }
        // }

        for (a = 0; a < x; a++) {
            for (b = 0; b < y; b++) {
                if (matriz[a][b] == 0) {
                    break;
                }
            }
            if (b == y) {
                cont++;
            }
        }
        System.out.printf("\n[%d] jogadores fizeram gols em todos os jogos.\n", cont);
    }
}
