import java.util.Scanner;

// Escreva um programa em Java que use um método que recebe um vetor de strings
// como parâmetro e devolve verdadeiro se o vetor está em ordem alfabética
// (crescente), ou falso,caso contrário
public class ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite quantas strings haverão no vetor: ");
        int quant = in.nextInt();
        String[] vetor = new String[quant];

        preencherVetor(vetor, quant);
        System.out.println(verificarOrdemAlfabetica(vetor));
    }

    public static void preencherVetor(String[] vet, int q) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < q; i++) {
            System.out.printf("Digite a %dª string: ", i + 1);
            vet[i] = in.nextLine();
        }
    }

    public static boolean verificarOrdemAlfabetica(String[] vetor) {
        boolean v = true;
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i].compareToIgnoreCase(vetor[i + 1]) > 0) {
                v = false;
                break;
            }
        }
        return v;
    }
}
