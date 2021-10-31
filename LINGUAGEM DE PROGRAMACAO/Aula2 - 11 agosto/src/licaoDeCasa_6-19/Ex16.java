
/*
. A confederação brasileira de natação promoverá eliminatórias para o próximo mundial.
Desenvolva um programa que receba a idade de um nadador e imprima a sua categoria
segundo a tabela a seguir:

Categoria      Idade
Infantil A  5 – 7 anos
Infantil B  8 – 10 anos
Juvenil A   11 – 13 anos
Juvenil B   14 – 17 anos
Adulto Maiores de 17 anos
*/
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a idade do nadador(a): ");
        int idade = in.nextInt();
        if (idade >= 5 && idade <= 7) {
            System.out.println("A categoria é INFANTIL <A>");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("A categoria é INFANTIL <B>");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("A categoria é JUVENIL <A>");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("A categoria é JUVENIL <B>");
        } else {
            System.out.println("A categoria é ADULTOS MAIORES DE 17 ANOS");
        }
    }
}
