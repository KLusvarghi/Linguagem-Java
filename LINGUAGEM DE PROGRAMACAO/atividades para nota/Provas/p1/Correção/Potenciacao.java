package br.fatec.p1;

import java.util.Scanner;

public class Potenciacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, t, base, expoente, res = 0;
		n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			t = in.nextInt();
			expoente = t % 10;
			base = t / 10;
			res += (int) Math.pow(base, expoente);
		}
		System.out.println(res);
	}

}
