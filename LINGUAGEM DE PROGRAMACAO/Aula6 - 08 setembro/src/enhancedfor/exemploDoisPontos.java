package enhancedfor;

import java.util.Scanner;

public class exemploDoisPontos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int a = in.nextInt();
        System.out.print("Digite outro número: ");
        int b = in.nextInt();
        boolean result = a > b ? true : false;
        System.out.println(result);
    }
}
