
// Desenvolva um programa em Java que dado p inteiro, verificar se p é primo.
import java.util.Scanner;

public class ex15segunda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean resutado = true;
        System.out.print("Digite um número: ");
        int num = in.nextInt();
        if (num == 1) {
            resutado = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    resutado = false;
                }
            }
        }
        if (resutado == true) {
            System.out.println("O número digitado é Primo");
        } else {
            System.out.println("O número digitado NÃO é Primo");
        }
    }
}
