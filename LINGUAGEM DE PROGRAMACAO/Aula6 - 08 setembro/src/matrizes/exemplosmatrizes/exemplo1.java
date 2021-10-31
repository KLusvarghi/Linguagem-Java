package matrizes.exemplosmatrizes;

public class exemplo1 {
    public static void main(String[] args) {

        // matriz
        // bidimensional
        int[][] mat = new int[4][5];
        int l, c, k = 0;
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 5; c++) {
                mat[l][c] = k++;
            }
        }
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 5; c++) {
                System.out.print(mat[l][c] + "\t");
            }
            System.out.println();
        }
    }
}
