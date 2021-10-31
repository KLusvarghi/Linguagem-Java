package matrizes.exemplosmatrizes;

public class exemplo4 {
    public static void main(String[] args) {

        // Usando o enhanced-for para
        // percorrer a matriz
        int[][] mat = new int[4][];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            mat[i] = new int[i + 1];
            for (j = 0; j < i + 1; j++) {
                mat[i][j] = k++;
            }
        }
        for (int[] linha : mat) {
            for (int x : linha) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }
    }
}
