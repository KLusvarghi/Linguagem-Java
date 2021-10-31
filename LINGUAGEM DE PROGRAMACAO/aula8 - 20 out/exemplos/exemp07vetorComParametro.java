import java.util.Random;
import java.util.Scanner;

public class exemp07vetorComParametro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o tamanho: ");
        int n = in.nextInt();
        int[] vet = new int[n];
        System.out.print("Informe o valor limite para os elementos do vetor: ");
        int limite = in.nextInt();

        preencherVetor(vet, limite); //O vetor é passado como parâmetro por referência
        
        imprimirVetor(vet);
        in.close();
    }

    public static void preencherVetor(int[] vet, int limite) {
        Random rand = new Random();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(limite + 1);
        }
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