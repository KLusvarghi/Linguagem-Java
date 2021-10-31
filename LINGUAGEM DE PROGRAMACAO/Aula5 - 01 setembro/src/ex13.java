
/*
Desenvolva um programa em Java que dado n e dois números naturais i e j diferentes de 0,
imprimir em ordem crescente os n primeiros naturais que são múltiplos de i ou de j. Exemplo:
Para n = 6 , i = 2 e j = 3 a saída deverá ser: 0, 2, 3, 4, 6, 8
*/
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = 0;

        System.out.print("Digite um número: ");
        int n = in.nextInt();
        System.out.print("Digite um número natural: ");
        int i = in.nextInt();
        System.out.print("Digite outro número natural: ");
        int j = in.nextInt();
        int aumenta1 = i;
        int aumenta2 = j;

        int numero1 = i;
        int numero2 = j;
        do {
            for (int cont = 2; cont >= 10; cont++) {
                if (i % aumenta1 == 0) {
                    aumenta1 = (int) Math.pow(numero1, cont);
                    System.out.println(aumenta1);
                    x++;
                } else if (j % aumenta2 == 0) {
                    aumenta2 = (int) Math.pow(numero2, cont);
                    System.out.println(aumenta2);
                    x++;
                }
            }
        } while (x != n);
    }
}
