
/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e 
calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, 
quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário.
*/
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu Número: ");
        int numeroFuncionario = in.nextInt();
        System.out.println("Digite o seu Número de horas trabalhadas: ");
        double horasTrabalhadas = in.nextDouble();
        System.out.println("Digite quanto recebe por hora trabalhada: ");
        double recebeHora = in.nextDouble();
        double salario = horasTrabalhadas * recebeHora;
        System.out.println("NÚMERO = " + numeroFuncionario);
        System.out.println("SALÁRIO = US " + salario);
    }

}
