package matrizes.exerciciosmatrizes;

import java.util.Scanner;

// // Neste problema você deve ler um número que indica uma coluna de uma matriz na qual uma operação deve ser realizada, um caractere maiúsc
// ulo, indicando a operação que será realizada, e todos os elementos de uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média 
// dos elementos que estão na área verde da matriz, conforme for o caso. A imagem abaixo ilustra o caso da entrada do valor 5 para a coluna da 
// matriz, demonstrando os elementos que deverão ser considerados na operação.

// // Entrada
// // A primeira linha de entrada contem um número C (0 ≤ C ≤ 11) indicando a coluna que será considerada para operação. A segunda linha de
//  entrada contém um único caractere Maiúsculo T ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos 
//  da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

// // Saída
// // Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
public class ex25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[][] matriz = new double[12][12];

        double soma = 0;
        double media = 0;
        int x = 1;
        char decisao = ' ';

        System.out.println("Digite o valor de cada posição:");
        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz.length; b++) {
                System.out.printf("%dº na posição [%d];[%d] ", x, a, b);
                matriz[a][b] = in.nextDouble();
                x++;
            }
        }

        System.out.println("MATRIZ 12x12");
        System.out.println();
        for (int a = 0; a < matriz.length; a++) {
            for (int b = 0; b < matriz.length; b++) {
                System.out.print(matriz[a][b] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.printf("Digite um numero (0 á %d): ", (matriz.length - 1));
        int num = in.nextInt();
        System.out.print("Digite 'S'para somar ou 'M'para obter a media: ");
        decisao = in.next().toUpperCase().charAt(0);
        ;

        for (int a = 0; a < matriz.length; a++) {
            soma += matriz[num][a];
            media += matriz[a][num];
        }
        for (int a = 0; a < matriz.length; a++) {
            media += matriz[num][a];
        }

        if (decisao == 'S') {
            System.out.printf("A Soma dos elementos da linha %d foi de: %d", num, soma);

        } else if (decisao == 'M') {
            media = soma / (1 - matriz.length);
            System.out.printf("A Média dos elementos da linha %d foi de: %d", num, media);
        } else {
            System.out.printf("OPERAÇÃO INVÁLIDA.");
        }
        System.out.println();
    }

}
