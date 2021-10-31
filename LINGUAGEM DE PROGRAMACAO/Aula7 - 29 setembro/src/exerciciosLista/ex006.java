import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a quantidade de grupos: ");
        int num = in.nextInt();
        for (int y = 0; y < num; y++) {
            boolean diferentes = false;
            System.out.print("\nDigite a quantidade de pessoas no grupos: ");
            int quantLinguas = in.nextInt();
            in.nextLine();
            String[] lingua = new String[quantLinguas];
            System.out.println("\nDigite a nacionalidade de cada um do grupo: ");
            for (int i = 0; i < quantLinguas; i++) {
                lingua[i] = in.nextLine().toLowerCase();
            }

            String compara = lingua[0];
            for (int i = 1; i < quantLinguas; i++) {
                if (!compara.equals(lingua[i])) {
                    diferentes = true;
                    break;
                }
            }

            if (!diferentes) {
                System.out.println(lingua[0]);
            } else {
                System.out.println("ingles");
            }
        }
        in.close();
    }
}
