import java.util.Scanner;

public class telecopio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int f, x = 0;
        System.out.println("área de abertura do telescópio (em milímetros quadrados): ");
        double telesc = in.nextDouble();
        System.out.println("Quantas estrelas seram estudadas? ");
        int estrelas = in.nextInt();

        for (int i = 1; i == estrelas; i++) {
            f = in.nextInt();

            if (f * telesc >= 40000000) {
                x++;
            }
        }
        System.out.print(x);
    }
}