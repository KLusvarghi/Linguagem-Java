
// Desenvolva um programa que dada a data de nascimento de uma pessoa e a data atual,
// informe a idade dessa pessoa em anos completos.
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o dia que nasceu: dd/mm/aa");
        int diaNasc = in.nextInt();
        int mesNasc = in.nextInt();
        int anoNasc = in.nextInt();

        System.out.println("Digite o data atual: dd/mm/aa");
        int diaAtual = in.nextInt();
        int mesAtual = in.nextInt();
        int anoAtual = in.nextInt();

        int idade = anoAtual - anoNasc;

        if (mesAtual < mesNasc || mesAtual == mesNasc && diaAtual < diaNasc) {
            idade = idade - 1;
        }
        System.out.println("Sua idade em anos completos é " + idade + " anos");
    }
}
