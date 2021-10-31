import java.util.Scanner;

public class exemplo03 {

    // Escreva um programa que receba um nome completo e apresente apenas o último
    // sobrenome e o primeiro nome separados por uma vírgula. Por exemplo:

    // Ciro Cirne Trindade
    // Trindade, Ciro
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite seu nome inteiro: ");
        String nome = in.nextLine();

        String array[] = nome.split(" ");
        System.out.printf("%s, %s\n", array[array.length - 1], array[0]);
    }
}
