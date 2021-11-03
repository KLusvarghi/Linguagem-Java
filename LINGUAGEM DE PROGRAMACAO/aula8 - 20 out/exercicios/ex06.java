import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    /*
     * Escreva um programa em Java que use um método que recebe como parâmetro uma
     * matriz. A bidimensional de valores reais e um valor real x, e multiplica
     * todos os elementosde A por x. No final, o programa deve exibir a matriz.
     */

    public static void multiplicarMatriz(double[][] matriz, double valorReal) {
        for (int x = 0; x < matriz.length; x++) {
            for (int z = 0; z < matriz[0].length; z++) {
                matriz[x][z] *= valorReal;
            }
        }
    }

    public static void adicionarValores(double[][] matriz) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite os valores da matriz");
        for (int x = 0; x < matriz.length; x++) {
            for (int z = 0; z < matriz[0].length; z++) {
                matriz[x][z] = in.nextDouble();
            }
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho da matriz: ");
        int lin = in.nextInt();
        int col = in.nextInt();

        double[][] matriz = new double[lin][col];

        adicionarValores(matriz);

        System.out.print("Digite o valor na qual multiplicará a matrizA: ");
        double valorReal = in.nextDouble();

        multiplicarMatriz(matriz, valorReal);

        System.out.println("Matriz multiplicada:");
        for (int x = 0; x < matriz.length; x++) {
            for (int z = 0; z < matriz[0].length; z++) {
                System.out.printf("%.2f\t", matriz[x][z]);
            }
            System.out.println();
        }
    }
}
