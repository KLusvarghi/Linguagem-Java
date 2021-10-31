import java.util.Scanner;

public class ex04 {
    // Escreva um programa em Java que dadas n strings, determine quantas dessas
    // strings contém uma string qualquer dada pelo usuário
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cont = 0;
        System.out.print("Digite a quantidade de palavras: ");
        int num = in.nextInt();
        String[] vetor = new String[num];

        System.out.println("Digite as palavras: ");
        for (int i = 0; i < num; i++) {
            vetor[i] = in.next();
        }

        System.out.print("\nDigite uma palavra novamente: ");
        String palavra = in.next();

        for (int i = 0; i < num; i++) {
            if (vetor[i].equals(palavra)) {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.printf("Tiveram %d palavras iguias a ultima digitada.\n", cont);
        } else {
            System.out.printf("Não houve nenhuma palavra igual a ultima digitada.\n");
        }
    }
}
