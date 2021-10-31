
/*
Desenvolva um programa que dada a idade de uma pessoa, determine sua condição de eleitor
conforme a tabela s seguir:

Menor que 16 anos - Não pode votar

Maior ou igual a 16 e menor que 18 anos ou maior ou igual a 65 anos - Facultativo

Entre 18 e 64 anos - Obrigatório
*/
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = in.nextInt();
        if (idade < 16) {
            System.out.println("Não pode votar!");
        } else if (idade >= 16 && idade > 18 || idade >= 65) {
            System.out.println("Facultativo");
        } else {
            System.out.println("Obrigatório");
        }
    }
}
