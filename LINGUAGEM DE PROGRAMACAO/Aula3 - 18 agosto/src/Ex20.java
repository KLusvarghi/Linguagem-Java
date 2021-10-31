
/*
Substituia a sequencia de if-else-if no programa abaixo por um switch-case.
import java.util.Scanner;
public class DiaDaSemana {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in); 
 int dia = in.nextInt();
 String diaDaSemana;
 if (dia == 1) {
 diaDaSemana = "Domingo";
 }
 else if (dia == 2) {
 diaDaSemana = "Segunda-feira";
 }
 else if (dia == 3) {
 diaDaSemana = "Terca-feira";
 }
 else if (dia == 4) {
 diaDaSemana = "Quarta-feira";
 }
 else if (dia == 5) {
 diaDaSemana = "Quinta-feira";
 }
 else if (dia == 6) {
 diaDaSemana = "Sexta-feira";
 }
 else if (dia == 7) {
 diaDaSemana = "Sabado";
 }
 else {
 diaDaSemana = "Invalido!";
 }
 System.out.println("Dia da semana: " + diaDaSemana);
 }
}
*/
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número (1-7): ");
        int dia = in.nextInt();
        String diaDaSemana = "a";
        int i = 1;
        switch (dia) {
            case 1:
                diaDaSemana = "domingo";
                break;
            case 2:
                diaDaSemana = "segunda-feira";
                break;
            case 3:
                diaDaSemana = "terça-terça";
                break;
            case 4:
                diaDaSemana = "quarta-feira";
                break;
            case 5:
                diaDaSemana = "quinta-feira";
                break;
            case 6:
                diaDaSemana = "sexta-feira";
                break;
            case 7:
                diaDaSemana = "sábado";
                break;
            default:
                i++;
                System.out.println("VALOR INVÁLIDO.");

        }
        if (i != 2) {
            System.out.println("Dia da semana: " + diaDaSemana);
        }
    }
}
