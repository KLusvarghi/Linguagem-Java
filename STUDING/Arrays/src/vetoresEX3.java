
//Faça um programa que crie um vetor com 10 posições e cadastre dados dentro dos
//mesmos e gere uma verificação: todos os números pares devem ser acrescidos "+ 5"
//no seu valor e todos os números ímpares de vem ser multiplicados por 5,
//ao final exibir o vetor todo alterado.
import java.util.Scanner;

public class vetoresEX3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] num = new int[10];
        int x = 1;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o d% numero: ", x);
            num[i] = in.nextInt();

            if (num[i] % 2 == 0) {
                num[i] += 5;
            } else {
                num[i] = num[i] * 5;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }
    }
}
