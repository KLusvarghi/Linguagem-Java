
// denvolva um programa em Java que dado um natural n para calcular n! (fatorial de n). 
// Sabese que 0! = 1 e que para n > 0, n! = n * (n – 1) * (n – 2) *...* 1.
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = in.nextInt();
        int f = num;
        int x = num;
        do {
            num = num - 1;
            f = f * num;
        } while (num != 1);
        System.out.println(f);
    }
}
