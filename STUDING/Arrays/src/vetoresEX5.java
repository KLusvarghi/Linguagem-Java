
//Faça um programa que carrega um vetor com 10 números inteiros. Calcule e exiba
//um vetor resultante ordenando de maneira decrescente.
import java.util.Scanner;

public class vetoresEX5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vet = new int[10];
        int i = 0;
        int x = 1;
        int aux = 0;

        for (i = 0; i < 10; i++) {
            System.out.printf("Digite o d% número", x);
            vet[i] = in.nextInt();
        }
        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (vet[i] > vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        for (i = 0; i < 10; i++) {
            System.out.println(vet[i]);
        }
    }
}
