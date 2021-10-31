/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
 o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um 
valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e
 um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
*/

import java.util.Scanner;

public class calculoSimples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o código da peça: ");
        int codigopeça1 = in.nextInt();
        System.out.println("Digite a quantidade de peças: ");
        double q1 = in.nextDouble();
        System.out.println("Digite o valor unitario de cada peça: ");
        double v1 = in.nextDouble();
        System.out.println("Digite o código da peça: ");
        int codigopeça2 = in.nextInt();
        System.out.println("Digite a quantidade de peças: ");
        double q2 = in.nextDouble();
        System.out.println("Digite o valor unitario de cada peça: ");
        double v2 = in.nextDouble();
        double aPagar = (q1 * v1) + (q2 * v2);
        System.out.println("VALOR A PAGAR = " + aPagar);
    }
}
