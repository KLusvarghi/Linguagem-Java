// Desenvolva um programa em Java que dados dois números inteiros positivos, determinar o
// máximo divisor comum entre eles usando o algoritmo de Euclides. Exemplo:

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = in.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = in.nextInt();
        int resto = 0;
        int resto1 = 0;
        int resto2 = 0;
        int cont = 0;
        int sla2 = num2;
        int sla1 = resto1;

        if (num1 % num2 == 0) {
            int x = 1;
            while (num2 < num1) {
                num2 = sla2;
                num2 *= x;
                cont = cont + 1;
                x = x + 1;
            }
            System.out.println(cont);
        }

        else {
            do {
                if (num1 % num2 >= 0) {
                    resto1 = num1 % num2;
                    resto2 = num2 % resto1;
                    resto = resto1 % resto2;
                }
            } while (resto != 0);
            sla2 = resto2;
            while (sla2 != resto1) {
                sla2 *= 2;
                cont = cont + 2;
            }
            if (cont * resto2 != resto1) {
                cont = cont - 1;
            }
            System.out.println(cont);
        }

        do {
            if (num1 % num2 >= 0) {
                resto1 = num1 % num2;
                resto = num2 % resto1;
            }
        } while (resto != 0);
        int x = 1;
        while (resto1 < num2) {
            resto1 *= x;
            cont = cont + 1;
            x++;
        }
        System.out.println(cont);
    }
}
