
/*Escreva um programa em Java que receba um número inteiro n como parâmetro e devolva
uma matriz identidade de ordem n. Obs.: uma matriz identidade de ordem n é aquele em
que todos os elementos da diagonal principal são iguais a 1 e os demais elementos são
iguais a 0*/
import java.util.Scanner;

public class ex08 {

    public static int[][] organizarMatriz(int n) {
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            mat[i][i] = 1;
        }
        /*
         * for (int x = 0; x < mat.length; x++) { for (int z = 0; z < mat[0].length;
         * z++) { mat[x][z] = 0; if (x == z) { mat[x][z] = 1; } } }
         */
        return mat;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int valor = in.nextInt();

        int[][] matriz = organizarMatriz(valor);

        for (int x = 0; x < matriz.length; x++) {
            for (int z = 0; z < matriz[0].length; z++) {
                System.out.printf("%d ", matriz[x][z]);
            }

            System.out.println("");
        }
    }
}
