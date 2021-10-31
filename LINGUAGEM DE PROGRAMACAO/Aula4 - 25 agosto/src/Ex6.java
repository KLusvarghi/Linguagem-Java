
// Desenvolva um programa em Java que dada uma coleção de números inteiros positivos
// terminada por 0 (zero), imprimir seus quadrado
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num;
        int i = 1;
        do {
            System.out.printf("Digite o %s numero: ", i);
            num = in.nextDouble();
            System.out.printf("O quadrado de %.2f = %.2f\n\n", num, (num * num));
            i++;
        } while (num > 0);
        System.out.printf("VALOR MENOR DO QUE 0.");

    }
}
