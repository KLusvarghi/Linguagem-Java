package vetores.exerciciosvetores;

// https://www.urionlinejudge.com.br/judge/pt/problems/view/1245

import java.util.Arrays;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] esq = new int[31];
		int[] dir = new int[31];
		char pe;
		int tam, n, pares;

		System.out.print("Quanto pares são? ");
		n = in.nextInt();
		Arrays.fill(esq, 0);
		Arrays.fill(dir, 0);

		for (int i = 0; i < n; i++) {
			System.out.printf("\nQual o tamanho do %dº pé e o lado? \n", (1 + i));
			tam = in.nextInt();
			pe = in.next().toUpperCase().charAt(0);
			if (pe == 'E') {
				esq[tam - 30]++;
			} else {
				dir[tam - 30]++;
			}
		}
		pares = 0;
		for (int i = 0; i < 31; i++) {
			pares += (esq[i] < dir[i] ? esq[i] : dir[i]);
		}
		System.out.println(pares);

	}

}