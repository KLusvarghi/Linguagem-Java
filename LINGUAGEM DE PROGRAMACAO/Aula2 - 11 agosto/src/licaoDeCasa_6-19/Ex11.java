// Desenvolva um programa para calcular as raízes de uma equação do 2º grau da forma
// ax2+bx+c, dados os valores das variáveis reais a, b e c. Sabe que:

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, x1, x2, d;

        System.out.println("Informe os valores da variaveis da equacao do 2o. grau");
        System.out.print("a: ");
        a = in.nextDouble();
        System.out.print("b: ");
        b = in.nextDouble();
        System.out.print("c: ");
        c = in.nextDouble();

        d = Math.pow(b, 2) - 4 * a * c;

        if (d < 0) {
            System.out.println("Nao ha' raizes reais");
        } else if (d == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.printf("Duas raizes iguais\nx1 = x2 = %.2f\n", x1);
        } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("Duas raizes diferentes\nx1 = %.2f\nx2 = %.2f\n", x1, x2);
        }
    }
}
