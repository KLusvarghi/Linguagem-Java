package br.fatec.matrizes;

import java.util.Scanner;

public class Trab1_v2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, o, h, s;
		n = in.nextInt();
		o = in.nextInt();
		h = in.nextInt();
		s = in.nextInt();
		int p;
		int c;
		int melhor = -1, custo;
		for (int i = 0; i < h; i++) {
			p = in.nextInt();
			custo = n * p;
			for (int j = 0; j < s; j++) {
				c = in.nextInt();
				if (custo <= o && c >= n && (melhor == -1 || custo < melhor)) {
					melhor = custo;
				}
			}
		}
		if (melhor == -1) {
            System.out.println("fique em casa");
        }
        else {
            System.out.printf("%d\n", melhor);
        }
	}

}
