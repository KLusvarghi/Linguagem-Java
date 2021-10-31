//Escreva um programa em Java que dadas as notas de duas provas de um aluno, determine e im-prima a média aritmética dessas provas.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a 1º notas: ");
        double nota1 = in.nextDouble();
        System.out.println("Digite a 2º notas: ");
        double nota2 = in.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("A média aritimética das notas é: " + media);
    }
}
