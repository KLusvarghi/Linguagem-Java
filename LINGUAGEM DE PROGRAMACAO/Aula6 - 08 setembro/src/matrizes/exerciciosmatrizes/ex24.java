package matrizes.exerciciosmatrizes;

// import java.util.Random;
import java.util.Scanner;

// Neste problema você deve ler um número, indicando uma linha da matriz na qual uma operação deve ser realizada, um 
// caractere maiúsculo, indicando a operação que será realizada, e todos os elementos de uma matriz M[12][12]. 
// Em seguida, calcule e mostre a soma ou a média dos elementos que estão na área verde da matriz, conforme for o caso. 
// A imagem abaixo ilustra o caso da entrada do valor 2 para a linha da matriz, demonstrando os elementos que deverão ser considerados na operação.

// Entrada
// A primeira linha de entrada contem um número L (0 ≤ L ≤ 11) indicando a linha que será considerada para operação. 
// A segunda linha de entrada contém um único caractere Maiúsculo T ('S' ou 'M'), indicando a operação (Soma ou Média) 
// que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz, 
// sendo que a mesma é preenchida linha por linha, da linha 0 até a linha 11, sempre da esquerda para a direita.

// Saída
// Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

public class ex24 {

    public static void main(String[] args) {
        // Random rand = new Random();
        Scanner in = new Scanner(System.in);
        double[][] matriz = new double[12][12];

        int soma = 0;
        float media = 0;
        int x = 1;

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
        String decisao = in.next();

        for (int a = 0; a < matriz.length; a++) {
            soma += matriz[num][a];
            media += matriz[num][a];
        }

        if (decisao != "s") {
            System.out.printf("A Soma dos elementos da linha %d foi de: %d", num, soma);

        } else if (decisao == "M") {
            media = media / (matriz.length - 1);
            System.out.printf("A Média dos elementos da linha %d foi de: %d", num, media);
        } else {
            System.out.printf("OPERAÇÃO INVÁLIDA.");
        }
        System.out.println();
    }
}
