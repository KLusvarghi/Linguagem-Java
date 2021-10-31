
/*
Um endocrinologista deseja controlar a saúde de seus pacientes e, para isso, se utiliza do
Índice de Massa Corporal (IMC). Sabendo-se que o IMC é calculado através da seguinte
fórmula:
IMC = peso / altura2
Onde:
- peso é dado em Kg
- altura é dada em metros
Criar um programa que dados o peso e altura do paciente, exiba sua faixa de risco, baseando-se na seguinte tabela:
IMC Faixa de Risco
Abaixo de 20 Abaixo do peso
A partir de 20 até 25 Normal
Acima de 25 até 30 Excesso de peso
Acima de 30 até 35 Obesidade
Acima de 35 Obesidade mórbida

*/
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite seu peso: (kg) ");
        double peso = in.nextDouble();
        System.out.print("Digite sua altura: (metros) ");
        double altura = in.nextDouble();
        double imc = peso / Math.pow(altura, 2);

        if (imc < 20) {
            System.out.println("O seu IMC diz que está abaixo do peso.");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("O seu IMC está normal.");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("O seu IMC diz que está com excesso do peso.");
        } else if (imc > 30 && imc <= 35) {
            System.out.println("O seu IMC diz que está com obesidade.");
        } else {
            System.out.println("O seu IMC diz que está com Obesidade mórbida.");

        }
    }
}
