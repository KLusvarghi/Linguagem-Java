package vetores.exemplosvetores;
// Escreva um programa em Java que 

// dado um vetor de inteiros com n
// elementos, imprima os elementos 
// desse vetor em ordem inversa.

import java.util.Scanner;

public class exem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = in.nextInt();
        int[] vet = new int[num];

        System.out.printf("Digite d% números: \n", num);
        for (int i = 0; i < vet.length; i++) {
            vet[i] = in.nextInt();
        }

        System.out.println("Os números inverços ficaram:");
        for (int a = (vet.length - 1); a >= 0; a--) {
            System.out.println(vet[a]);
        }
    }
}
