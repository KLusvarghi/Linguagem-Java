
//  Desenvolva um programa que dados três números inteiros, informe quantos são negativos.
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        System.out.println("Digite o 1º número: ");
        int n1 = in.nextInt();
        System.out.println("Digite o 2º número: ");
        int n2 = in.nextInt();
        System.out.println("Digite o 3º número: ");
        int n3 = in.nextInt();
        for (int i = 1; i <= 3; i++) {
            if (n1 < 0 || n2 < 0 || n3 < 0) {
                x = x++;
                System.out.println(x);
            }
        }
        if (x == 0) {
            System.out.println("Não existe nenhum número negativo.");
        } else {
            System.out.println("Existem " + x + " numeros negativos.");
        }
    }
}
