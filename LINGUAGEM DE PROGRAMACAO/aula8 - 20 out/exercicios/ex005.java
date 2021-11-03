import java.util.Scanner;

public class ex005 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a ordem da matriz: ");
        int n = in.nextInt();
        int[][] mat = new int[n][n];
        adicionarValores(mat);
        if (isTriangularSuperior(mat)) {
            System.out.println("A matriz e' uma matriz Triangular Superior");
        } else {
            System.out.println("A matriz NAO e' uma matriz Triangular Superior");
        }

    }

    public static boolean isTriangularSuperior(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (j > i) { // acima da diagonal principal
                    if (mat[i][j] == 0) {
                        return false;
                    }
                } else { // da diagonal principal para baixo
                    if (mat[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void adicionarValores(int[][] matriz) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite os valores da matriz");
        for (int x = 0; x < matriz.length; x++) {
            for (int z = 0; z < matriz[0].length; z++) {
                matriz[x][z] = in.nextInt();
            }
        }
    }
}
