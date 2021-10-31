import java.util.Random;
import java.util.Scanner;

public class exemp09vetorRetorno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o tamanho: ");
        int n = in.nextInt();
        System.out.print("Informe o valor limite para os elementos do vetor: ");
        int limite = in.nextInt();
        int[] vet = criarVetor(n, limite);

        imprimirVetor(vet);
        in.close();
    }

    public static int[] criarVetor(int n, int limite) {
        Random rand = new Random();
        int[] v = new int[n];
        for (int i = 0; i < v.length; i++) {
            v[i] = rand.nextInt(limite+1);
        }
        return v;
    }

    public static void imprimirVetor(int[] vet) {
        int i;
        System.out.print("Conteudo do vetor: { ");
        for (i = 0; i < vet.length - 1; i++) {
            System.out.printf("%d, ", vet[i]);
        }
        System.out.printf("%d }\n", vet[i]);
    }
}
