package matrizes.exemplosmatrizes;

public class exemplo3 {
    public static void main(String[] args) {

        // Usando o atributo length
        // para percorrer a matriz

        int[][] mat = new int[4][];
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            mat[i] = new int[i + 1];
            for (j = 0; j < i + 1; j++) {
                mat[i][j] = k++;
            }
        }
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
