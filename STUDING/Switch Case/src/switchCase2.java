import java.util.Scanner;

public class switchCase2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um dia da semana: (numero)");
        int diaSemana = in.nextInt();

        switch (diaSemana) {

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia da semana");
                break;
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("INVÁLIDO!");
                break;

        }
    }
}
