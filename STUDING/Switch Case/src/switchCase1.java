import java.util.Scanner;

public class switchCase1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um dia da semana: (numero)");
        int diaSemana = in.nextInt();

        /*
         * 1 -> final de semana 2 -> segunda 3 -> terça 4 -> quarta 5 -> quinta 6 ->
         * sexta 7 -> final de semana
         */

        switch (diaSemana) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia da semana");
                break;
            case 3:
                System.out.println("Dia da semana");
                break;
            case 4:
                System.out.println("Dia da semana");
                break;
            case 5:
                System.out.println("Dia da semana");
                break;
            case 6:
                System.out.println("Dia da semana");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("INVÁLIDO!");
                break;

        }
    }
}
