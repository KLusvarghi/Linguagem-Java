import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt(); // o melhor resultado obtido por um atleta numa prova das Olimpíada
        int m = in.nextInt(); // recorde mundial para essa prova.
        int l = in.nextInt(); // record OLIMPICO para esta prova
        System.out.println();
        if (r < m && r < l) {
            System.out.println("RM"); // RM se o resultado é um recorde mundial
            if (r < l) {
                System.out.println("RO"); // RO se o resultado é um recorde olimpico
            } else {
                System.out.println("*");
            }
        } else if (r > m || r > l) {
            System.out.println("*");
            if (m < l) {
                System.out.println("RO");
            } else {
                System.out.println("*");
            }
        } else if (r == m && r == l) {
            System.out.println("*");
            System.out.println("*");
        } else {
            System.out.println("Valore de recorde mundial incorreto.");
        }

    }
}