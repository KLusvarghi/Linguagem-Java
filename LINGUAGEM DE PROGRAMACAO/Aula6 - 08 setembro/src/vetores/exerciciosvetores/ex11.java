package vetores.exerciciosvetores;

import java.util.Random;

// Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, o segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.

// Saída
// Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição.

// Exemplo de Entrada	Exemplo de Saída
// 0
// -5
// ...
// 63
// 230

// N[0] = 230
// N[1] = 63
// ...
// N[18] = -5
// N[19] = 0

public class ex11 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] vetor = new int[20];
        int aux;
        for (int i = 0; i < 20; vetor[i++] = rand.nextInt(1 + 10))
            ;

        for (int i = 0; i < 20; i++) {// nada dmais
            System.out.printf("Posição: [%d] = %d\n", i, vetor[i]);
        }

        for (int i = 0; i < 10; i++) {
            aux = vetor[i];
            vetor[i] = vetor[19 - i];
            vetor[19 - i] = aux;
        }

        System.out.println("\nO vetor inverso ficará:");
        for (int i = 0; i < 20; i++) {
            System.out.printf("Posição: [%d] = %d\n", i, vetor[i]);
        }

    }
}
