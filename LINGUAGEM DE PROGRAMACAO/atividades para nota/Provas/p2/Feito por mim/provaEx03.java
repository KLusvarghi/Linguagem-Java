package prova02;
import java.util.InputMismatchException;
import java.util.Scanner;

public class provaEx03 {
    public static void main(String[] args) {
        int idadePessoa = 0;
        inputAge(idadePessoa);
    }

    public static int inputAge(int idade) {
        Scanner in = new Scanner(System.in);
        System.out.println("O programa pode lançar uma exceção do tipo InputMismatchException.");
        System.out.println("");
        int cont = 0;
        do {
            cont = 0;
            System.out.print("Informe sua idade:");
            try {
                idade = in.nextInt();
                if (idade < 0 || idade > 150) {
                    System.out.println("A idade deve estar entre 0 e 150");
                    cont = cont + 1;
                }
            } catch (InputMismatchException e) {
                System.out.println("A idade deve ser um valor inteiro!");
            }
        } while (cont != 0);
        return idade;
    }
}
