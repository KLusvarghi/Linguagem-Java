/*
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, 
sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, 
sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço
 em branco antes e depois da igualdade. 
*/

import java.util.Scanner;

public class mediaAritmetica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor da 1º nota: ");
        double n1 = in.nextDouble();
        System.out.println("Digite o valor da 2º nota: ");
        double n2 = in.nextDouble();
        System.out.println("Digite o valor da 3º nota: ");
        double n3 = in.nextDouble();
        double mediaAri = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
        System.out.println("A média das nostas é: " + mediaAri);
    }
}
