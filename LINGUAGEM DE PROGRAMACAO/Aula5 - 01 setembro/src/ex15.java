
// Desenvolva um programa em Java que dado p inteiro, verificar se p é primo.
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int metade = 0;
        System.out.print("Digite um número: ");
        int num = in.nextInt();
        if (num % 1 == 0) {
            if (num % num == 0) {
                metade = num / 2;
                if (num % metade != 0) {
                    System.out.println("O número digitado é Primo");

                } else {
                    System.out.println("O número digitado não é Primo");

                }
            }
        }
    }
}
