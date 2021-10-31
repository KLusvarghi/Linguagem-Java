
/*
Escreva um programa em Java que dada uma data no formato ddmmaaaa, exiba-a no formato
dd/nome-do-mês/ano. Use o comando switch-case.
import java.util.Scanner;
*/
import java.util.Scanner;

public class Ex21 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Digite a data atual: (dd/mm/aaaa) ");
    int dia = in.nextInt();   
    int mes = in.nextInt();   
    int ano = in.nextInt();   
    String mesEscrito = "a";
    switch (mes){
        case 1:
            mesEscrito = "Janeiro";
            break;
        case 2:
            mesEscrito = "Fevereiro";
            break;
        case 3:
            mesEscrito = "Março";
            break;
        case 4:
            mesEscrito = "Abril";
            break;
        case 5:
            mesEscrito = "Maio";
            break;
        case 6:
            mesEscrito = "Junho";
            break;
        case 7:
            mesEscrito = "Julho";
            break;
        case 8:
            mesEscrito = "Agosto";
            break;
        case 9:
            mesEscrito = "Setembro";
            break;
        case 10:
            mesEscrito = "Outubro";
            break;
        case 11:
            mesEscrito = "Novembro";
            break;
        case 12:
            mesEscrito = "Dezembro";
            break;
    }
    System.out.print("A data é: "+dia +" de "+ mesEscrito +" "+ ano);
}
