package matrizes.exerciciosmatrizes;

import java.util.Random;

// Criar um programa que carregue uma matriz 12 x 4 com os valores das vendas de uma
// loja, em que cada linha represente um mês do ano, e cada coluna, uma semana do mês.
// Calcule e imprima:
// • O total vendido em cada mês;
// • O total vendido em cada semana durante todo o ano;
// • O total vendido no ano.
public class ex23 {
    public static void main(String[] args) {
        Random rand = new Random();

        double[][] matriz = new double[12][4];

        System.out.println("Vendas do Ano");
        for (int a = 0; a < 12; a++) {
            for (int b = 0; b < 4; b++) {
                matriz[a][b] = rand.nextInt(100000);
                System.out.printf("%10.2f\t", matriz[a][b]);
            }
            System.out.println();
        }

        double vendasMes;
        System.out.println("\nTotal de vendas por mes");
        for (int a = 0; a < 12; a++) {
            vendasMes = 0;
            for (int b = 0; b < 4; b++) {
                vendasMes += matriz[a][b];
            }
            System.out.printf("Mes %2d: R$ %.2f\n", a + 1, vendasMes);
        }

        double vendasSemana, totalVendas = 0;
        System.out.println("\nTotal de vendas por semana");
        for (int b = 0; b < 4; b++) {
            vendasSemana = 0;
            for (int a = 0; a < 12; a++) {
                vendasSemana += matriz[a][b];
            }
            System.out.printf("Semana %d: R$ %.2f\n", b + 1, vendasSemana);
            totalVendas += vendasSemana;
        }
        System.out.printf("\nTotal de vendas no ano: R$ %.2f\n", totalVendas);
    }
}
