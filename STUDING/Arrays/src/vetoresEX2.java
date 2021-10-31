
//Faça um programa que carregue um vetor com 8 números inteiros.
//Calcule e exiba os números superiores a 50 e suas respectivas posições.
//Exiba a mensagem se não existir nenhum número nessa condição.
import java.util.Scanner;

public class vetoresEX2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = 1;
        int tot = 0;
        int[] numero = new int[8];

        for (int i = 0; i <= 8; i++) {
            System.out.printf("Digite o d% numero: ", x);
            numero[i] = in.nextInt();
            x++;
            if (numero[i] > 50) {
                tot++;
            }
        }
        if (tot > 0) {
            System.out.printf("Existem d% acima de 50", tot);
        } else {
            System.out.printf("Não existe nenhum número acima de 50");
        }
    }
}
