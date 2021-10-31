
/*
 Dada a data de nascimento de uma pessoa, escreva um programa em Java que determine o
seu tipo característico de acordo com as regras abaixo:
a) Seja D o dia do nascimento da pessoa
b) M o mês do nascimento da pessoa
c) A o ano de nascimento da pessoa
d) N o número formado pela justaposição dos três números anteriores: DMA
e) Z o resto da divisão de N por 9
A tabela abaixo fornece o tipo característico da pessoa a partir de Z:
Z Tipo
0 irresistível
1 impetuoso
2 discreto
3 amoroso
4 tímido
5 paquerador
6 estudioso
7 sonhador
8 charmoso
*/
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String d = in.next();
        String m = in.next();
        String a = in.next();
        String n = d + m + a;
        int z = Integer.parseInt(n) % 9;
        String tipo = "";

        switch (z) {
            case 0:
                tipo = "Irresistível";
                break;
            case 1:
                tipo = "Impetuoso";
                break;
            case 2:
                tipo = "Discreto";
                break;
            case 3:
                tipo = "Amoroso";
                break;
            case 4:
                tipo = "Tímido";
                break;
            case 5:
                tipo = "Paquerador";
                break;
            case 6:
                tipo = "Estudioso";
                break;
            case 7:
                tipo = "Sonhador";
                break;
            case 8:
                tipo = "Charmoso";
                break;
        }
        System.out.printf("Seu tipo é %s", tipo);
    }
}
