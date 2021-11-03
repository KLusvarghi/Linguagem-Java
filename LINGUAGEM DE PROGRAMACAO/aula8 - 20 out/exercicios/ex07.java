/* Escreva um programa em Java contendo um método que receba como parâmetro um vetor
com n valores inteiros quaisquer. Determine e retorne outro vetor com dois elementos,
sendo que na primeira posição há o menor número inteiro do vetor passado como
parâmetro e na segunda posição, o maior número inteiro*/

import java.util.Arrays;
import java.util.Scanner;

public class ex07 {
    public static int[] organizarVetor(int[] vetor) {
		Arrays.sort(vetor);
		int[] novoVetor = new int[2];
		novoVetor[0] = vetor[0];
		novoVetor[1] = vetor[vetor.length - 1];
		return novoVetor;
	}

	public static void adicionarValores(int[] vetor) {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite os valores do vetor: ");
		for (int x = 0; x < vetor.length; x++) {
			vetor[x] = in.nextInt();
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor: ");
		int valor = in.nextInt();

		int[] vetor = new int[valor];

		adicionarValores(vetor);

		int[] novoVetor = organizarVetor(vetor);

		for (int x = 0; x < novoVetor.length; x++) {
			System.out.printf("%d° Valor: %d\n", x + 1, novoVetor[x]);
		}
	}
}
