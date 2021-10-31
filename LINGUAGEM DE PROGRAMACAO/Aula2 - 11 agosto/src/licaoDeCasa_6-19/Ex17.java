
/*
Depois da liberação do governo para as mensalidades dos planos de saúde, as pessoas
começaram a fazer pesquisas para descobrir um bom plano, não muito caro. Um vendedor de
um plano de saúde apresentou a tabela a seguir. Desenvolva um programa que dada a idade
de uma pessoa, imprima o valor que ela deverá pagar.
• Até 10 anos: R$ 150,00
• Acima de 10 até 18 anos: R$ 250,00
• Acima de 18 até 24 anos: R$ 300,00
• Acima de 24 até 50 anos: R$ 500,00
• Acima de 50 até 65 anos: R$ 750,00
• Maior que 65 anos: R$ 900,00
*/
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = in.nextInt();
        if (idade < 10) {
            System.out.println("Deverá pagar: R$ 150,00 no plano de saúde");
        } else if (idade > 10 && idade <= 18) {
            System.out.println("Deverá pagar: R$ 250,00 no plano de saúde");
        } else if (idade > 18 && idade <= 24) {
            System.out.println("Deverá pagar: R$ 300,00 no plano de saúde");
        } else if (idade > 24 && idade <= 50) {
            System.out.println("Deverá pagar: R$ 500,00 no plano de saúde");
        } else if (idade > 50 && idade <= 65) {
            System.out.println("Deverá pagar: R$ 750,00 no plano de saúde");
        } else {
            System.out.println("Deverá pagar: R$ 900,00 no plano de saúde");
        }
    }
}
