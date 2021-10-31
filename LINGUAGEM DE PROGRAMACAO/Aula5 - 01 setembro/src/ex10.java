
// Escreva um programa que dado n, imprima os n primeiros números ímpares em ordem
// decrescente.
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = in.nextInt();
        int i = 0;
        if (num % 2 == 0) {
            System.out.println(num - 1);
            i = num - 1;
            while (i != 1) {
                i = i - 2;
                System.out.println(i);
            }
        } else {
            System.out.println(num);
            i = num;
            while (i != 1) {
                i = i - 2;
                System.out.println(i);

            }
        }
    }
}
