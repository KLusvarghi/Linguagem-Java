import java.util.Random;
import java.util.Scanner;

// Escreva um programa em Java que use um método que receba um vetor de inteiros de n elementos   e   troque   o   1º   elemento   pelo   último,   o   2º   pelo   penúltimo,   o   3º   pelo antepenúltimo, e assim sucessivamente. O programa deve solicitar o tamanho do vetor e seus elementos, e utilizar o método para inverter a ordem dos elementos do vetor. Depois utilize outro método para mostrar o conteúdo do vetor.
public class ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tam = in.nextInt();
        int[] vet = new int[tam];
        System.out.print("Informe o valor limite para os elementos do vetor: ");
        int limite = in.nextInt();
        preencherVetor(vet, limite);
        vetorOriginal(vet);
        int i = 0;
        int f = vet.length - 1;
        inverterOrdem(vet, i, f);
        imprimirVetor(vet);

    }

    public static void preencherVetor(int[] vetor, int l) {
        Random rand = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(l + 1);
        }
    }

    public static void vetorOriginal(int[] vetor) {
        int i;
        System.out.print("O vetor original é: { ");
        for (i = 0; i < vetor.length - 1; i++) {
            System.out.printf("%d, ", vetor[i]);
        }
        System.out.printf("%d }\n", vetor[i]);
    }

    public static int[] inverterOrdem(int[] vet, int i, int f) {
        int aux;
        if (i >= f) {
            return vet;
        }
        aux = vet[i];
        vet[i] = vet[f];
        vet[f] = aux;
        return inverterOrdem(vet, i + 1, f - 1);
    }

    public static void imprimirVetor(int[] vetor) {
        int i;
        System.out.print("O vetor inverso ficou: { ");
        for (i = 0; i < vetor.length - 1; i++) {
            System.out.printf("%d, ", vetor[i]);
        }
        System.out.printf("%d }\n", vetor[i]);
    }
}
