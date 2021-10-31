import java.util.Random;
import java.util.Scanner;

public class ex05 {
    // Escreva um programa em Java que use um método que recebe como parâmetro
    // umamatriz quadrada de ordem n de inteiros e devolve verdadeiro se ela é uma
    // matriz triangular superior, ou falso, caso contrário. Obs.: uma matriz
    // triangular superior é umamatriz onde todos os elementos de posições acima da
    // diagonal principal são diferentes de0 e os demais elementos são iguais a 0.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o tamanho da matriz: ");
        int l = in.nextInt();
        int c = in.nextInt();
        System.out.print("Informe o valor limite para os elementos da matriz: : ");
        int limite = in.nextInt();
        if (c != l) {
            System.out.println("Valor inválido!");
            // break;
        } else {
            int[][] matriz = new int[l][c];
            preencherMatriz(matriz, limite);
            exibirMatriz(matriz);
            int v = 0;
            verificar(matriz, v);
        }

    }

    public static void preencherMatriz(int[][] mat, int limite) {
        Random rand = new Random();
        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                mat[l][c] = rand.nextInt(limite);
            }
        }
    }

    public static void exibirMatriz(int[][] mat) {
        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                System.out.printf("%d\t", mat[l][c]);
            }
            System.out.println();
        }
    }

    public static void verificar(int[][] mat, int v) {
        for (int a = 0; a < mat.length; a++) {
            for (int b = 0; b < mat.length; b++) {
                if (b > a) {
                    if (mat[a][b] == 0) {
                        v++;
                        break;
                    }
                }
            }
        }
        if (v > 0) {
            System.out.println("Não é uma matriz triangular superior!");
        } else {
            System.out.println("É uma matriz triangular superior!");
        }
    }
}
