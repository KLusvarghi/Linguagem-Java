import java.util.Random;
import java.util.Scanner;

public class exemp08matrizComoParametro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o numero de linha e coluna da matriz: ");
        int linhas = in.nextInt();
        int colunas = in.nextInt();
        int[][] mat = new int[linhas][colunas];
        System.out.print("Informe o valor limite para os elementos da matriz: ");
        int limite = in.nextInt();
        preencherMatriz(mat, limite);
        imprimirMatriz(mat);
        in.close();
    }

    public static void preencherMatriz(int[][] mat, int limite) {
        Random rand = new Random();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = rand.nextInt(limite+1);
            }
        }
    }

    public static void imprimirMatriz(int[][] mat) {
        System.out.println("Conteudo da matriz:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.printf("%d\t", mat[i][j]);
            }
            System.out.println();
        }
    }
}
