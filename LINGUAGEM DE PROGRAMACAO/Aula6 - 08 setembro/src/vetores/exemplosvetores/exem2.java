package vetores.exemplosvetores;
// Escreva um programa em Java que 

// dados n valores inteiros, imprima 
// apenas os números pares digitados.

import java.util.Scanner;

public class exem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o numero de elementos: ");
        int num = in.nextInt();
        int[] numeros = new int[num];
        int cont = 0;
        System.out.printf("Digite d% números: \n", num);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = in.nextInt();
        }

        System.out.println("Os números pares são: ");
        for (int x : numeros) {
            if (x % 2 == 0) {
                System.out.println(x);
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("NÃO EXISTE NENHUM NÚMERO POSITIVO.");
        }
    }
}
