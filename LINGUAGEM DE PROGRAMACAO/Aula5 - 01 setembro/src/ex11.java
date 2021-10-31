
// Escreva um programa que dados dois números inteiros positivos, X e Y, determinar o quociente
// da divisão inteira entre X e Y sem utilizar o operador de divisão (/).
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int quociente = 0;
        System.out.print("Digite um número: ");
        int divisor = in.nextInt();
        System.out.print("Digite outro número: ");
        int dividendo = in.nextInt();
        int i = dividendo;
        while (i > 0) {
            i -= divisor;
            i = dividendo;
            quociente += 1;
        }
        if (i < 0) {
            quociente -= 1;
        }
        System.out.println(quociente);
    }
}
