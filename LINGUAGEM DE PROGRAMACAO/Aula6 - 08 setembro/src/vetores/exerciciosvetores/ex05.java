package vetores.exerciciosvetores;

import java.util.Scanner;

// Criar um programa que leia o preço de compra e o preço de venda de 10 mercadorias
// usando um vetor para cada um dos preços. O programa deverá imprimir quantas
// mercadorias proporcionam:
// a) Lucro < 10%
// b) 10 % <= Lucro <= 20%
// c) Lucro > 20%

public class ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o numero de mercadorias: ");
        int num = in.nextInt();
        System.out.println();

        int[] compra = new int[num];
        int[] venda = new int[num];
        int lucro = 0;

        int lucroA = 0;
        int lucroB = 0;
        int lucroC = 0;

        for (int i = 0; i < num; i++) {
            System.out.printf("Digite o valor da compra e venda da %d mercadorias:\n", i + 1);
            compra[i] = in.nextInt();
            venda[i] = in.nextInt();
            System.out.println();
        }
        for (int i = 0; i < compra.length; i++) {
            lucro = venda[i] - compra[i];
            if (lucro < (venda[i] * 0.10)) {
                lucroA++;
            }
            if (lucro >= (venda[i] * 0.10) && lucro <= (venda[i] * 0.20)) {
                lucroB++;
            }
            if (lucro > (venda[i] * 0.20)) {
                lucroC++;
            }
        }
        if (lucroA > 0) {
            System.out.println(lucroA + " mercadorias tem um lucro abaixo de 10%.");
        } else {
            System.out.println("Nenhuma mercadoria tem lucro menor do que 10%.");
        }
        if (lucroB > 0) {
            System.out.println(lucroB + " mercadorias tem um lucro entre 10% e 20%.");
        } else {
            System.out.println("Nenhuma mercadorias tem um lucro entre 10% e 20%.");
        }
        if (lucroC > 0) {
            System.out.println(lucroC + " mercadorias tem um lucro maior que 20%.");
        } else {
            System.out.println("Nenhuma mercadorias tem um lucro maior que 20%.");
        }
    }
}
