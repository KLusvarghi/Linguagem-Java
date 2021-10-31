//Entrar com vários números no vetor de tamanho máximo de 100 elementos até digitar o número "0".
//Imprimir quantos números iguais ao último número foram lidos.
//O limite de números é 100.

import java.util.Scanner;

public class vetoresEX1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numeros = new int[20];
        int i;
        int x = 1;
        int tot = 0;
        for (i = 0; i < 20; i++) {
            System.out.printf("Digite o %d numero: ", x);
            numeros[i] = in.nextInt();
            x++;
        }
        for (i = 0; i < 20; i++) {
            if (numeros[i] == numeros[19]) {
                tot++;
            }
        }
        tot += -1;
        System.out.printf("Foram digitados %d numero iguais ao ultimo digitado", tot);
    }
}
