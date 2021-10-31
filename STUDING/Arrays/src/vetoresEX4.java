// Uma empresa contratou 15 funcionários temporários. De acordo com o valor das
//vendas mensais, os funcionários adquirem pontos que determinarão seus salários
// ao final de cada mês. Sabemos que esses funcionários trabalharão nos meses de
// novembro a janeiro do ano subsequente. Faça um algoritmo que:

// -Leia as pontuações nos três meses de cada funcionário;
// -Calcule e exiba a pontuação geral de cada funcionário nos três meses;
// -Calcule e exiba a média das pontuações de cada funcionário nos três meses;
// -Determine e exiba a maior média atingida entre TODOS os funcionários.

import java.util.Scanner;

public class vetoresEX4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] mes1 = new int[14];
        int[] mes2 = new int[14];
        int[] mes3 = new int[14];
        int[] maiorMedia = new int[14];
        int x = 1;
        int i = 0;
        double tot = 0;
        for (i = 0; i < 15; i++) {
            System.out.printf("Digite sua pontuação total do mes um d% funcionario", x);
            mes1[i] = in.nextInt();
            System.out.printf("Digite sua pontuação total do mes um d% funcionario", x);
            mes2[i] = in.nextInt();
            System.out.printf("Digite sua pontuação total do mes um d% funcionario", x);
            mes3[i] = in.nextInt();
            x++;
        }
        for (i = 0; i < 15; i++) {
            System.out.printf("A pontuação geral do d% funcionario é: ", x, +mes1[i] + mes2[i] + mes3[i]);
            x++;
        }
        for (i = 0; i < 15; i++) {
            maiorMedia[i] = (mes1[i] + mes2[i] + mes3[i]) / 3;
            System.out.printf("A media geral do d% funcionario é: ", x, +(mes1[i] + mes2[i] + mes3[i]) / 3);
            x++;
            if (maiorMedia[i] > tot) {
                tot = maiorMedia[i];
            }
        }
        System.out.println("A maior média foi de " + tot);
    }
}
