package matrizes.exemplosmatrizes;

import java.util.Arrays;
import java.util.Random;

public class classesarrays {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] vetor = new int[20];
        Arrays.fill(vetor, 10);
        for (int x : vetor)// apenas exibe as posiçoes do vetor com o valor de 10 em cada lugar do vetor
            System.out.print(x + " ");
        System.out.println();
        for (int i = 0; i < vetor.length; vetor[i++] = rand.nextInt(25)) // ele irá apenas atribuir numeros entre 0 a 24
                                                                         // em cada posição do vetor
            ;
        for (int x : vetor) {
            System.out.print(x + " "); // vai imprimir o vetor com o metodo Enhanced For
        }
        System.out.println();
        Arrays.sort(vetor); // quando ele for imprimir o vetor, ele irá imprimi lo em ordem crescente
        for (int x : vetor) {
            System.out.print(x + " "); // imprimindo novamente mas em ordem crescente
        }
        System.out.println();
        int val = rand.nextInt(25); // vai gerar um valor aleaório entre 0 e 24
        int index = Arrays.binarySearch(vetor, val); // e aqui em "binarySearch" ele irá pesquisar a variavel 'val'
                                                     // dentro do vetor
        if (index >= 0) {
            System.out.println(val + " esta' na posicao " + index + " do vetor"); // irá exibir index que é onde está a
                                                                                  // posição de val dentro do vetor
        } else {
            System.out.println(val + " nao esta' contido no vetor"); // caso não tenha o valor de val dentro do vetor
                                                                     // será exibido isso
        }
    }
}
