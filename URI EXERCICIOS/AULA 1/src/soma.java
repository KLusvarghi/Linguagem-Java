
/*
Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA.
 A seguir escrever o valor desta variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade 
seguido pelo valor correspondente à soma de A e B. 
*/
import java.util.Scanner;

public class soma {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite dois números: ");
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        double soma = n1 + n2;
        System.out.println("SOMA = " + soma);
    }
}
