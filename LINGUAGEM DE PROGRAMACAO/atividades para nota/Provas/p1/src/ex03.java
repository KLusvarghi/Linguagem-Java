import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lin, col;
        boolean zerosEUns = true;
        System.out.print("Informe o numero de linhas e colunas da matriz: ");
        lin = in.nextInt();
        col = in.nextInt();
        double[][] matriz = new double[lin][col];
        System.out.println("Informe os elementos da matriz:");
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = in.nextDouble();
                if (matriz[i][j] <= 0 || matriz[i][j] >= 1) {
                    zerosEUns = false;
                }
            }
        }
        if (zerosEUns) {
            System.out.println("A matriz e' composta por valores entre 0 e 1");
        } else {
            System.out.println("A matriz tem valores fora do intervalo de 0 a 1");
        }
    }
}
