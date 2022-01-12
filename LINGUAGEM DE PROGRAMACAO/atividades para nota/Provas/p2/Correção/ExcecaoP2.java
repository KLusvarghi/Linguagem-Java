package br.fatec.p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoP2 {

	public static void main(String[] args) {
		try {
			System.out.println(inputAge());
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static int inputAge() throws InputMismatchException {
		Scanner in = new Scanner(System.in);
		int age = 0;
		System.out.print("Informe sua idade: ");
		try {
			age = in.nextInt();
		} catch (InputMismatchException e) {
			throw new InputMismatchException("Informe um valor inteiro");
		}
		if (age < 0 || age > 150) {
			throw new InputMismatchException("O valor deve estar entre 0 e 150");
		}
		return age;
	}

}
