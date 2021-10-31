import java.util.Scanner;

public class estruturaDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2;
        int somaN = 0;
        do {
            System.out.println("Digite dois números: ");
            num1 = in.nextInt();
            num2 = in.nextInt();
            somaN = num1 + num2;
        } while (somaN % 2 == 0);

        System.out.println("A somar é " + somaN);
    }
}
